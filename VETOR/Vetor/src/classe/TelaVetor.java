/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classe;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author danie
 */
public class TelaVetor extends javax.swing.JFrame {
    int[] vetor = new int[10];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    
    public TelaVetor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtN1 = new javax.swing.JSpinner();
        btnAdi = new javax.swing.JButton();
        btnRem = new javax.swing.JButton();
        btnOrd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listVetor = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblX1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtN1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        btnAdi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdi.setForeground(new java.awt.Color(0, 102, 0));
        btnAdi.setText("Adicionar");
        btnAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btnRem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRem.setForeground(new java.awt.Color(255, 0, 0));
        btnRem.setText("Remover");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });
        getContentPane().add(btnRem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnOrd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOrd.setForeground(new java.awt.Color(0, 0, 255));
        btnOrd.setText("Ordenar");
        btnOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        listVetor.setModel(lista);
        listVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listVetorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listVetorMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(listVetor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 100, 210));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("VETOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        lblX1.setText("[0]");
        getContentPane().add(lblX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/imagem.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdActionPerformed
        Arrays.sort(vetor);
        lista.removeAllElements();
        for(int c =0; c< vetor.length;c++ ){
          lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnOrdActionPerformed

    private void btnAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiActionPerformed
        vetor[selecionado] =Integer.parseInt(txtN1.getValue().toString());
        lista.removeAllElements();
        for(int c =0; c< vetor.length;c++ ){
            lista.addElement(vetor[c]);
        
        }
        
    }//GEN-LAST:event_btnAdiActionPerformed

    private void listVetorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVetorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_listVetorMouseEntered

    private void listVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVetorMouseClicked
       selecionado = listVetor.getSelectedIndex();
       lblX1.setText("[" +selecionado+ "]");
    }//GEN-LAST:event_listVetorMouseClicked

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
          vetor[selecionado] = 0;
          lista.removeAllElements();
          for(int c =0; c< vetor.length;c++ ){
          lista.addElement(vetor[c]);
            }
    }//GEN-LAST:event_btnRemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdi;
    private javax.swing.JButton btnOrd;
    private javax.swing.JButton btnRem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblX1;
    private javax.swing.JList<String> listVetor;
    private javax.swing.JSpinner txtN1;
    // End of variables declaration//GEN-END:variables
}
