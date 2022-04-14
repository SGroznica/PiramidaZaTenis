/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package piramidazatenis.view;

import piramidazatenis.controller.ObradaIgrac;

import piramidazatenis.model.Igrac;
import piramidazatenis.util.PiramidaZaTenisUtil;

/**
 *
 * @author stjep
 */
public class RedProzor extends javax.swing.JFrame {

    private ObradaIgrac obrada;

    /**
     * Creates new form RedProzor
     */
    public RedProzor() {
        initComponents();
        obrada = new ObradaIgrac();
        setTitle(PiramidaZaTenisUtil.getNaslov("Redovi"));

        RedTablica m = new RedTablica(new ObradaIgrac().read());

        jtRed.setModel(m);

        jtRed.getColumnModel().getColumn(0).setHeaderValue("Igrač");
        jtRed.getColumnModel().getColumn(1).setHeaderValue("Igrač 2");
        jtRed.getColumnModel().getColumn(2).setHeaderValue("Igrač 3");
        jtRed.getColumnModel().getColumn(3).setHeaderValue("Igrač 4");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtRed = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtRed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null},
                {"2", null, null, null, null},
                {"3", null, null, null, null},
                {"4", null, null, null, null},
                {"5", null, null, null, null},
                {"6", null, null, null, null},
                {"7", null, null, null, null},
                {"8", null, null, null, null},
                {"9", null, null, null, null},
                {"10", null, null, null, null},
                {"11", null, null, null, null},
                {"12", null, null, null, null},
                {"13", null, null, null, null},
                {"14", null, null, null, null},
                {"15", null, null, null, null},
                {"16", null, null, null, null},
                {"17", null, null, null, null},
                {"18", null, null, null, null},
                {"19", null, null, null, null},
                {"20", null, null, null, null},
                {"21", null, null, null, null},
                {"22", null, null, null, null},
                {"23", null, null, null, null},
                {"24", null, null, null, null},
                {"25", null, null, null, null},
                {"26", null, null, null, null},
                {"27", null, null, null, null},
                {"28", null, null, null, null},
                {"29", null, null, null, null},
                {"30", null, null, null, null}
            },
            new String [] {
                "Broj reda", "Igrač", "Igrač", "Igrač", "Igrač"
            }
        ));
        jtRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtRedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtRed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtRedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRedMouseClicked
        RedTablica m = (RedTablica) jtRed.getModel();
        Igrac i = m.getIgracAt(jtRed.getSelectedRow());


    }//GEN-LAST:event_jtRedMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRed;
    // End of variables declaration//GEN-END:variables
}
