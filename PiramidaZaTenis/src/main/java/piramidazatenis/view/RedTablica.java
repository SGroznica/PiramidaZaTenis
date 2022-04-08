/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramidazatenis.view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import piramidazatenis.model.Igrac;

/**
 *
 * @author stjep
 */
public class RedTablica extends AbstractTableModel {

    private List<Igrac> igraci;    

  
    
    public RedTablica(List<Igrac> igraci){
        this.igraci=igraci;
    }
    
    @Override
    public int getRowCount() {
         return igraci==null ? 0 : igraci.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Igrac i = igraci.get(rowIndex);
         Object value = "??";
        switch (columnIndex) {
            case 0:     
           for(int j=0; j<4 ;j++) {
               if((i.getRed().contains("1"))) {
                value=i.getIme() + " " + i.getPrezime();
                break;
             }
        }
                
         
        }
        return value;
    }
    
    
     public Igrac getIgracAt(int red){
        return igraci.get(red);
    }
    
}
