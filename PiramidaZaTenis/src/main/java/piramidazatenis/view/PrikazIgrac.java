/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidazatenis.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import piramidazatenis.model.TennisMatch;

/**
 *
 * @author CP
 */
public class PrikazIgrac extends JLabel implements ListCellRenderer<TennisMatch> {
    
    private String ime;
    private DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
    private int maksimalnoZnakovaIme = 12;

    public PrikazIgrac() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends TennisMatch> list,
            TennisMatch value, int index, boolean isSelected, boolean cellHasFocus) {

        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index,
                isSelected, cellHasFocus);
        
        renderer.setFont(new Font("Courier new", Font.BOLD, 12));
        
        if (isSelected) {
            setBackground(Color.BLUE);
            setForeground(Color.WHITE);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }

   //     setText((value.getIgrac1().getIme() == null ? "Nepoznato" : value.getIgrac1().getIme().equals("") ? "XXXXXXX" : value.getIgrac1().getIme())
//                + " " + (value.getIgrac2().getPrezime() == null ? "Nepoznato" : value.getPrezime()));

  //      ime = value.getIme();
        for (int i = 0; i < maksimalnoZnakovaIme; i++) {
            ime += " ";
        }

        ime = ime.substring(0, maksimalnoZnakovaIme);

 //       renderer.setText(ime + value.getPrezime());
        
        return this;
    }

}
