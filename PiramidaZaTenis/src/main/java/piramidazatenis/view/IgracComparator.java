/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.view;

import java.text.Collator;
import java.util.Locale;
import piramidazatenis.model.Igrac;

/**
 *
 * @author stjep
 */
public abstract class IgracComparator implements Comparable<Igrac>{
     private Collator hr;

    public IgracComparator() {
        System.out.println("Napravio instancu Collator");
        hr = Collator.getInstance(new Locale("hr", "HR")); //Your locale here
        hr.setStrength(Collator.PRIMARY);
    }

    public int compareTo(Igrac o1, Igrac o2) {
        return hr.compare(o1.getPrezime(), o2.getPrezime());
    }
}
