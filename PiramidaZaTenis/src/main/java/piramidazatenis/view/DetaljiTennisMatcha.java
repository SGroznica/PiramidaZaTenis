/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package piramidazatenis.view;

import java.time.ZoneId;
import piramidazatenis.controller.ObradaTennisMatch;
import piramidazatenis.model.Igrac;
import piramidazatenis.model.TennisMatch;
import piramidazatenis.util.PiramidaZaTenisUtil;

/**
 *
 * @author stjep
 */
public class DetaljiTennisMatcha extends javax.swing.JFrame {
 
    private TennisMatch tennisMatch;
    private ObradaTennisMatch obradaTennisMatch;
    
    /**
     * Creates new form DetaljiTennisMatcha
     */
    
    /*public DetaljiTennisMatcha() {
        initComponents();
        this.tennisMatch=tennisMatch;
        obradaTennisMatch = new ObradaTennisMatch();
        setTitle(PiramidaZaTenisUtil.getNaslov("Detalji tenis meča"));
        ucitaj();
    }*/
    
    public DetaljiTennisMatcha(TennisMatch tennisMatch) {
        initComponents();
        this.tennisMatch=tennisMatch;
        obradaTennisMatch = new ObradaTennisMatch();
        setTitle(PiramidaZaTenisUtil.getNaslov("Detalji tenis meča"));
        ucitaj();
    }

  
    
    
    public void ucitaj() {

        String napada = String.valueOf(tennisMatch.getIgrac1());    
        String brani = String.valueOf(tennisMatch.getIgrac2());
        String red = String.valueOf(tennisMatch.getRed());
        String datumIgranja = String.valueOf(tennisMatch.getDatumigranja());
        String pobjendik = String.valueOf(tennisMatch.getPobjednik());
        
        
        txtNapada.setText(napada);
        txtBrani.setText(brani);
        txtRed.setText(red);
        txtDatumIgranja.setText(datumIgranja);
        txtTeren.setText(tennisMatch.getTeren());
        txtRezultat.setText(tennisMatch.getRezultat());
        txtPobjednik.setText(pobjendik);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRed = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTeren = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRezultat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNapada = new javax.swing.JTextField();
        txtBrani = new javax.swing.JTextField();
        txtDatumIgranja = new javax.swing.JTextField();
        txtPobjednik = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Napada:");

        jLabel2.setText("Brani:");

        jLabel7.setText("Red");

        txtRed.setEditable(false);

        jLabel3.setText("Datum igranja");

        jLabel4.setText("Teren");

        txtTeren.setEditable(false);

        jLabel5.setText("Rezultat");

        txtRezultat.setEditable(false);

        jLabel6.setText("Pobjednik");

        txtNapada.setEditable(false);

        txtBrani.setEditable(false);

        txtDatumIgranja.setEditable(false);

        txtPobjednik.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtRezultat, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtTeren)
                    .addComponent(jLabel7)
                    .addComponent(txtRed, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNapada)
                    .addComponent(txtBrani)
                    .addComponent(txtDatumIgranja)
                    .addComponent(txtPobjednik))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNapada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(txtBrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDatumIgranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
   
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtBrani;
    private javax.swing.JTextField txtDatumIgranja;
    private javax.swing.JTextField txtNapada;
    private javax.swing.JTextField txtPobjednik;
    private javax.swing.JTextField txtRed;
    private javax.swing.JTextField txtRezultat;
    private javax.swing.JTextField txtTeren;
    // End of variables declaration//GEN-END:variables
}
