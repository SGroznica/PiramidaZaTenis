/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.util;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import piramidazatenis.model.Igrac;

/**
 *
 * @author stjep
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Faker faker = new Faker();
        
        //List<Igrac> igraci = generirajIgrace(faker, session);
        
        
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
    
}
