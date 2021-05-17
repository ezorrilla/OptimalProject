
package view;

import controller.AsignacionRecursosController;
import controller.ProcesamientoController;
import controller.RecursosController;
import controller.RestriccionesAdController;
import java.awt.Color;
import javax.swing.JLabel;


public class frmAsignacionRecursos extends javax.swing.JFrame {

    public frmAsignacionRecursos() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblVariable1X = new javax.swing.JLabel();
        lblVariable1Y = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spnMaterialV1 = new javax.swing.JSpinner();
        spnMaterialV2 = new javax.swing.JSpinner();
        lblVariable2Y = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnRRHHV1 = new javax.swing.JSpinner();
        spnRRHHV2 = new javax.swing.JSpinner();
        lblVariable2X = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnRestriccionesAd = new javax.swing.JButton();
        lblImagenEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Asigna tus recursos");

        lblVariable1X.setForeground(new java.awt.Color(102, 102, 102));
        lblVariable1X.setText("Varable 1");

        lblVariable1Y.setForeground(new java.awt.Color(102, 102, 102));
        lblVariable1Y.setText("Variable 2");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Material");

        lblVariable2Y.setForeground(new java.awt.Color(102, 102, 102));
        lblVariable2Y.setText("Variable 2");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Recurso Humano");

        lblVariable2X.setForeground(new java.awt.Color(102, 102, 102));
        lblVariable2X.setText("Varable 1");

        btnProcesar.setBackground(new java.awt.Color(0, 0, 255));
        btnProcesar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setText("Procesar Proyecto");
        btnProcesar.setToolTipText("");
        btnProcesar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcesar.setBorderPainted(false);
        btnProcesar.setFocusCycleRoot(true);
        btnProcesar.setFocusPainted(false);
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(51, 0, 255));
        btnAtras.setText("Atrás");
        btnAtras.setToolTipText("");
        btnAtras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAtras.setBorderPainted(false);
        btnAtras.setFocusCycleRoot(true);
        btnAtras.setFocusPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnRestriccionesAd.setBackground(new java.awt.Color(255, 255, 255));
        btnRestriccionesAd.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnRestriccionesAd.setForeground(new java.awt.Color(0, 0, 255));
        btnRestriccionesAd.setText("Restricciones Adicionales");
        btnRestriccionesAd.setToolTipText("");
        btnRestriccionesAd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRestriccionesAd.setFocusCycleRoot(true);
        btnRestriccionesAd.setFocusPainted(false);
        btnRestriccionesAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestriccionesAdActionPerformed(evt);
            }
        });

        lblImagenEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/undraw_game_world.png"))); // NOI18N
        lblImagenEmpresa.setInheritsPopupMenu(false);
        lblImagenEmpresa.setMaximumSize(new java.awt.Dimension(981, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblImagenEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblVariable2X)
                                        .addComponent(spnRRHHV1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblVariable1X)
                                        .addComponent(spnMaterialV1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRestriccionesAd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVariable2Y)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnRRHHV2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMaterialV2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVariable1Y))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(lblImagenEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVariable1X)
                    .addComponent(lblVariable1Y, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spnMaterialV1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMaterialV2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVariable2X)
                    .addComponent(lblVariable2Y, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnRRHHV1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnRRHHV2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRestriccionesAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        AsignacionRecursosController.btnSiguiente();
        AsignacionRecursosController.ocultar();
        ProcesamientoController.mostrar();       
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        RecursosController.mostrar();
        AsignacionRecursosController.ocultar();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnRestriccionesAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestriccionesAdActionPerformed
        RestriccionesAdController.mostrarDialogo(this);
    }//GEN-LAST:event_btnRestriccionesAdActionPerformed

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
            java.util.logging.Logger.getLogger(frmAsignacionRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAsignacionRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAsignacionRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAsignacionRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAsignacionRecursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnRestriccionesAd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblImagenEmpresa;
    private javax.swing.JLabel lblVariable1X;
    private javax.swing.JLabel lblVariable1Y;
    private javax.swing.JLabel lblVariable2X;
    private javax.swing.JLabel lblVariable2Y;
    private javax.swing.JSpinner spnMaterialV1;
    private javax.swing.JSpinner spnMaterialV2;
    private javax.swing.JSpinner spnRRHHV1;
    private javax.swing.JSpinner spnRRHHV2;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JSpinner getSpnMaterialV1() {
        return spnMaterialV1;
    }

    public javax.swing.JSpinner getSpnMaterialV2() {
        return spnMaterialV2;
    }

    public javax.swing.JSpinner getSpnRRHHV1() {
        return spnRRHHV1;
    }

    public JLabel getLblVariable1X() {
        return lblVariable1X;
    }

    public JLabel getLblVariable1Y() {
        return lblVariable1Y;
    }

    public JLabel getLblVariable2X() {
        return lblVariable2X;
    }

    public JLabel getLblVariable2Y() {
        return lblVariable2Y;
    }

    public javax.swing.JSpinner getSpnRRHHV2() {
        return spnRRHHV2;
    }
}
