/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import piramidazatenis.model.Igrac;

/**
 *
 * @author stjep
 */
public class RedTablica extends AbstractTableModel {
    
    private List<Igrac> igraci;
    private int red;

    public RedTablica(List<Igrac> igraci) {
        red=1;
        
        
        this.igraci = igraci;
    }

    @Override
    public int getRowCount() {
        return 30;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int  rowIndex, int columnIndex) {
        
        // 0 0 1
        // 0 1 1
        // 0 2 1
        // 0 3 1
        
        // 1 0 2
        // 1 1 2
        // 1 2 2
        // 1 3 2
        Object value = "??";
try {
     List<Igrac> igraciReda = igraciReda();
        Igrac i = igraciReda.get(columnIndex);
        
        
     
        value = i.getIme() + " " + i.getRed();
       
        } catch (Exception e) {
            value="Nešto ne valja";
        }

       
   if(columnIndex==3){
            red++;
            System.out.println(red);
        }
          
              

        return value;
    }
    
    private List<Igrac> igraciReda(){
        List<Igrac> igraci = new ArrayList<>();
        for(Igrac i : this.igraci){
            if(i.getRed()==red){
                igraci.add(i);
            }
        }
        System.out.println("Ukupno: " + igraci.size());
        return igraci;
    }

    public Igrac getIgracAt(int red) {
        return igraci.get(red);
    }

}
