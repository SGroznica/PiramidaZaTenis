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

    public RedTablica(List<Igrac> igraci) {
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
        int x = rowIndex * 4; 
        Igrac i = igraci.get(x+ columnIndex);
        Object value = "??";
        
        switch (columnIndex) {
            case 0:
                value = i.getIme() + " " + i.getRed();
            case 1:
                value = i.getIme() + " " + i.getRed();
                break;

            case 2:
                value = i.getIme() + " " + i.getRed();
                break;

            case 3:
                value = i.getIme() + " " + i.getRed();
                break;
 
 }
 

        return value;
    }

    public Igrac getIgracAt(int red) {
        return igraci.get(red);
    }

}
