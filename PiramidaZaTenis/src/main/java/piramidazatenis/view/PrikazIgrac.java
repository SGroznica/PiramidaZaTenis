/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidazatenis.view;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import piramidazatenis.model.Igrac;

/**
 *
 * @author CP
 */
public class PrikazIgrac extends JLabel implements ListCellRenderer<Igrac> {

     public PrikazIgrac() {
        setOpaque(true);
    }
     
    @Override
    public Component getListCellRendererComponent(JList<? extends Igrac> list,
            Igrac value, int index, boolean isSelected, boolean cellHasFocus) {

        if (isSelected) {
            setBackground(Color.BLUE);
            setForeground(Color.WHITE);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        
        setText((value.getIme()==null ? "Nepoznato" : value.getIme().equals("") ? "XXXXXXX" :  value.getIme())
                + " " + (value.getPrezime()==null ? "Nepoznato" : value.getPrezime()));

        return this;
    }

}
