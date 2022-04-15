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
    
    private final List<Red> redovi;

    public RedTablica(List<Igrac> igraci) {
        this.redovi = definirajRedove(igraci);
    }

    private List<Red> definirajRedove(List<Igrac> igraci) {
        List<Red> redoviLista = new ArrayList<>();
        int red = 1;
        Red r;
        List<Igrac> igraciReda;
        while (true) {
            r = new Red();
            igraciReda = new ArrayList<>();
            for (Igrac i : igraci) {
                if (i.getRed() == red) {
                    igraciReda.add(i);
                }
                if (igraciReda.size() == 4) {
                    break;
                }
            }
            if (igraciReda.isEmpty()) {
                break;
            }
            r.setRed(red++);
            r.setIgraci(igraciReda);
            redoviLista.add(r);

        }
        return redoviLista;
    }

    @Override
    public int getRowCount() {
        return redovi.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
   
    public Igrac getIgracAt(int rowIndex, int columnIndex){
        return redovi.get(rowIndex).getIgraci().get(columnIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value="??";
        try {
            value = redovi.get(rowIndex).getIgraci().get(columnIndex).getIme() + " " + redovi.get(rowIndex).getIgraci().get(columnIndex).getPrezime();
        } catch (Exception e) {
        }
        return value;
    }

    private class Red {

        private int red;
        private List<Igrac> igraci;

        public int getRed() {
            return red;
        }

        public void setRed(int red) {
            this.red = red;
        }

        public List<Igrac> getIgraci() {
            return igraci;
        }

        public void setIgraci(List<Igrac> igraci) {
            this.igraci = igraci;
        }

    }

}
