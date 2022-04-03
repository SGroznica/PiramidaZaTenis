/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.util;

import com.github.javafaker.Faker;
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
        for(int i = 0; i<120; i++){
            p = new Igrac();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setBrojmobitela("");
            p.setOib(PiramidaZaTenisUtil.generirajOib());
            session.save(p);
            igraci.add(p);
            System.out.println("Krierao igrača: " + p.getIme() + " " + p.getOib());
        }
        return igraci;
        
        
    }
    
     private static void unesiTennisMatch(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Faker faker = new Faker();
        List<Igrac> igraci = generirajIgrace(faker, session);
        
        TennisMatch tm;
        
            for (int j = 0; j < 15; j++) {
                tm = new TennisMatch();
                Collections.shuffle(igraci);
                tm.setIgrac1(igraci.get((int) Math.random() * (igraci.size() - 1)));
                Collections.shuffle(igraci);
                tm.setIgrac2(igraci.get((int) Math.random() * (igraci.size() - 26)));
                tm.setDatumigranja(new Date());
                tm.setTeren(faker.team().name());
                session.save(tm);
                System.out.println("Kreirao meč");
            }
        
        session.getTransaction().commit();
       
     }
    
}
