/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.view;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import piramidazatenis.model.Igrac;

/**
 *
 * @author stjep
 */
public class IgracComparator implements Comparator<Igrac>{
     private Collator hr;

    public IgracComparator() {
        System.out.println("Napravio instancu Collator");
        hr = Collator.getInstance(new Locale("hr", "HR")); //Your locale here
        hr.setStrength(Collator.PRIMARY);
    }

    public int compareTo(Igrac o1, Igrac o2) {
        return hr.compare(o1.getPrezime(), o2.getPrezime());
    }

   /*@Override
    public int compare(Igrac o1, Igrac o2) {
        Integer prvi = o1.get()== null ? 0 : o1.getPolaznici().size();
        Integer drugi = o2.getPolaznici() == null ? 0 : o2.getPolaznici().size();
        return drugi.compareTo(prvi);
    }*/

    @Override
    public int compare(Igrac o1, Igrac o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
