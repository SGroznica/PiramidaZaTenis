/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package piramidazatenis.view;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import piramidazatenis.controller.ObradaIgrac;
import piramidazatenis.controller.ObradaTennisMatch;
import piramidazatenis.model.Igrac;
import piramidazatenis.model.TennisMatch;
import piramidazatenis.util.PiramidaZaTenisException;
import piramidazatenis.util.PiramidaZaTenisUtil;

/**
 *
 * @author stjep
 */
public class TennisMatchProzor extends javax.swing.JFrame {
    
    private ObradaTennisMatch obrada;
    /**
     * Creates new form IgracProzor
     */
    public TennisMatchProzor() {
        initComponents();
        obrada= new ObradaTennisMatch();
        setTitle(PiramidaZaTenisUtil.getNaslov("Tennis Match"));
        ucitaj();
        
        
        DefaultComboBoxModel<Igrac> ig = new DefaultComboBoxModel<>();
        Igrac igrac = new Igrac();
        igrac.setSifra(Long.valueOf(0));
        ig.addElement(igrac);
        new ObradaIgrac().read().forEach(s->{ig.addElement(s);});
        cmbIgrac1.setModel(ig);
        
        DefaultComboBoxModel<Igrac> ig1 = new DefaultComboBoxModel<>();
        igrac.setSifra(Long.valueOf(0));
        ig.addElement(igrac);
        new ObradaIgrac().read().forEach(s->{ig1.addElement(s);});
        cmbIgrac2.setModel(ig1);
        
    }
    
    public void ucitaj(){
        DefaultListModel<TennisMatch> m = new DefaultListModel<>();
        List<TennisMatch> tenismec = obrada.read();
        
        for(TennisMatch s: tenismec){
            m.addElement(s);
        }
        lstTennisMatch.setModel(m);
        
     
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
        lstTennisMatch = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnKreiraj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        cmbIgrac1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbIgrac2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTeren = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRezultat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPobjednik = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstTennisMatch.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTennisMatchValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTennisMatch);

        jLabel1.setText("Igrač 1");

        btnKreiraj.setText("Kreiraj");
        btnKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        cmbIgrac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIgrac1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Igrač 2");

        cmbIgrac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIgrac2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Datum igranja");

        jLabel4.setText("Teren");

        txtTeren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerenActionPerformed(evt);
            }
        });

        jLabel5.setText("Rezultat");

        jLabel6.setText("Pobjednik");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKreiraj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi))
                    .addComponent(cmbIgrac1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTeren, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbIgrac2, javax.swing.GroupLayout.Alignment.LEADING, 0, 199, Short.MAX_VALUE))
                    .addComponent(jLabel5)
                    .addComponent(txtRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPobjednik, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbIgrac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbIgrac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTeren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPobjednik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKreiraj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstTennisMatchValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTennisMatchValueChanged
        if (evt.getValueIsAdjusting() || lstTennisMatch.getSelectedValue() == null) {
            return;
        }
        obrada.setEntitet(lstTennisMatch.getSelectedValue());
        var e = obrada.getEntitet();
       
        
    }//GEN-LAST:event_lstTennisMatchValueChanged

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
       try {
            obrada.setEntitet(new TennisMatch());
            preuzmiVrijednosti();
            obrada.create();
            ucitaj();
        } catch (PiramidaZaTenisException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        } 
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
       if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        preuzmiVrijednosti();

        try {
            obrada.update();
            ucitaj();
        } catch (PiramidaZaTenisException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
       if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(
                getRootPane(),
                "Sigurno obrisati \"" + obrada.getEntitet() + "\"?", 
                "Brisanje", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }

        try {
            obrada.delete();
            ucitaj();
        } catch (PiramidaZaTenisException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void cmbIgrac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIgrac1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIgrac1ActionPerformed

    private void cmbIgrac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIgrac2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIgrac2ActionPerformed

    private void txtTerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerenActionPerformed

    private void preuzmiVrijednosti() {
        var e = obrada.getEntitet();
        e.setIgrac1((Igrac) cmbIgrac1.getSelectedItem());
        e.setIgrac2((Igrac) cmbIgrac2.getSelectedItem());
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Igrac> cmbIgrac1;
    private javax.swing.JComboBox<Igrac> cmbIgrac2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<TennisMatch> lstTennisMatch;
    private javax.swing.JTextField txtPobjednik;
    private javax.swing.JTextField txtRezultat;
    private javax.swing.JTextField txtTeren;
    // End of variables declaration//GEN-END:variables
}
