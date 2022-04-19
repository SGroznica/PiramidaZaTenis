/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.util;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;
import piramidazatenis.model.Igrac;
import piramidazatenis.model.TennisMatch;

/**
 *
 * @author stjep
 */
public class PocetniInsert {
    
    public static void inicijalniPodaci(){
        PocetniInsert.unesiTennisMatch();
    }
    
   
    
     private static List<Igrac> generirajIgrace(Faker faker, Session session){
        List<Igrac> igraci = new ArrayList();
        Igrac p;
        Random rnd = new Random();
       
        
        for(int i = 0; i<120; i++){
            int number = 10000000 + rnd.nextInt(90000000);
            p = new Igrac();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setBrojmobitela("09" + number);
            p.setOib(PiramidaZaTenisUtil.generirajOib());
            if(i < 30) {
                p.setRed(i + 1);
            } else if(i < 60) {
                p.setRed(i-29);
            } else if(i < 90) {
                p.setRed(i - 59);
            } else {
                p.setRed(i-89);
            }
           
            session.save(p);
            igraci.add(p);
            System.out.println("Krierao igrača: " + p.getIme() + " " + p.getOib());
        }
        return igraci;
        
    }
    
     
      private static Date pocetakMatcha() {
        Random random = new Random();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        int minDay = (int) LocalDate.of(2022, 1, 1).toEpochDay();
        var maxDay = (int) LocalDate.of(2022, 12, 31).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate pMeca = LocalDate.ofEpochDay(randomDay);
        Date date = Date.from(pMeca.atStartOfDay(defaultZoneId).toInstant());
        return date;
    }
     
     private static void unesiTennisMatch(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Faker faker = new Faker();
        List<Igrac> igraci = generirajIgrace(faker, session);
        
        TennisMatch tm;
        Igrac i;
            for (int j = 0; j < 30; j++) {
                tm = new TennisMatch();
                Collections.shuffle(igraci);
                i = igraci.get((int) Math.random() * (igraci.size() - 1));
                tm.setIgrac1(i);
                Collections.shuffle(igraci);
                tm.setIgrac2(igraci.get((int) Math.random() * (igraci.size() - 26)));
                tm.setDatumigranja(pocetakMatcha());
                tm.setTeren(faker.team().name());
                tm.setRed(tm.getIgrac1().getRed());
                tm.setPobjednik(tm.getIgrac1());
                session.save(tm);
                System.out.println("Kreirao meč");
            }
        
        session.getTransaction().commit();
       
     }
    
}
