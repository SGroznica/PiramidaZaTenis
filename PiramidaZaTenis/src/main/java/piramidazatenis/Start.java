/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis;

import org.hibernate.Session;
import piramidazatenis.util.HibernateUtil;
import piramidazatenis.util.PocetniInsert;
import piramidazatenis.view.SplashScreen;

public class Start {

    private Session session;

    public Start() {
        
        
    
        
    }

    public static void main(String[] args) {
       new SplashScreen().setVisible(true);
       //PocetniInsert.izvedi();
    }

}
