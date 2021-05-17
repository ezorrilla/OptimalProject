package view;

import controller.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author elder
 */
public class frmProcesamiento extends javax.swing.JFrame {

    public frmProcesamiento() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblImagenEmpresa1 = new javax.swing.JLabel();
        lblSugerencia = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        pnlGrafico = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnMaximizar = new javax.swing.JButton();
        spnCoefXObjetivo = new javax.swing.JSpinner();
        spnCoefYObjetivo = new javax.swing.JSpinner();
        txtDescripcionZ = new javax.swing.JTextField();
        lblVariableX = new javax.swing.JLabel();
        lblVariableY = new javax.swing.JLabel();
        lblVariableY1 = new javax.swing.JLabel();
        lblRestricciones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setText("Optimiza tu Objetivo");

        lblImagenEmpresa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/undraw_winners.png"))); // NOI18N
        lblImagenEmpresa1.setInheritsPopupMenu(false);
        lblImagenEmpresa1.setMaximumSize(new java.awt.Dimension(981, 768));

        lblSugerencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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

        javax.swing.GroupLayout pnlGraficoLayout = new javax.swing.GroupLayout(pnlGrafico);
        pnlGrafico.setLayout(pnlGraficoLayout);
        pnlGraficoLayout.setHorizontalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlGraficoLayout.setVerticalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(0, 0, 255));
        btnMinimizar.setText("Minimizar");
        btnMinimizar.setToolTipText("Minimiza tu objetivo");
        btnMinimizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMinimizar.setFocusCycleRoot(true);
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnMaximizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMaximizar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnMaximizar.setForeground(new java.awt.Color(0, 0, 255));
        btnMaximizar.setText("Maximizar");
        btnMaximizar.setToolTipText("Maximiza tu objetivo");
        btnMaximizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMaximizar.setFocusCycleRoot(true);
        btnMaximizar.setFocusPainted(false);
        btnMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizarActionPerformed(evt);
            }
        });

        txtDescripcionZ.setToolTipText("Describe lo que vas a minimizar o maximizar");

        lblVariableX.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVariableX.setText("Variable1");

        lblVariableY.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVariableY.setText("Variable2");

        lblVariableY1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVariableY1.setText("Descripción objetivo");

        lblRestricciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Interpretación:");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ejemplo: Ganancia neta en S/.");

        btnReiniciar.setBackground(new java.awt.Color(204, 0, 0));
        btnReiniciar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar Proyecto");
        btnReiniciar.setToolTipText("");
        btnReiniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReiniciar.setBorderPainted(false);
        btnReiniciar.setFocusCycleRoot(true);
        btnReiniciar.setFocusPainted(false);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblImagenEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVariableX, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCoefXObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnCoefYObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVariableY, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVariableY1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionZ, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVariableY1)
                            .addComponent(lblVariableY)
                            .addComponent(lblVariableX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnCoefYObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCoefXObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionZ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSugerencia, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(lblRestricciones, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImagenEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ProcesamientoController.ocultar();
        AsignacionRecursosController.mostrar();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizarActionPerformed
        ProcesamientoController.maximizar();
    }//GEN-LAST:event_btnMaximizarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        ProcesamientoController.minimizar();
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        ProcesamientoController.ocultar();
        AsignacionRecursosController.reiniciado();
        InicioProyectoController.reiniciado();   
        ProcesamientoController.reiniciado();
        PanelInicioController.reiniciado();
        RecursosController.reiniciado();
        PanelInicioController.mostrar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    public JPanel getPnlGrafico() {
        return pnlGrafico;
    }

    public JSpinner getSpnCoefXObjetivo() {
        return spnCoefXObjetivo;
    }

    public JSpinner getSpnCoefYObjetivo() {
        return spnCoefYObjetivo;
    }

    public JTextField getTxtDescripcionZ() {
        return txtDescripcionZ;
    }

    public JLabel getLblVariableX() {
        return lblVariableX;
    }

    public JLabel getLblVariableY() {
        return lblVariableY;
    }

    public void setPnlGrafico(JPanel pnlGrafico) {
        this.pnlGrafico = pnlGrafico;
    }

    public JLabel getLblRestricciones() {
        return lblRestricciones;
    }

    public JLabel getLblSugerencia() {
        return lblSugerencia;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMaximizar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblImagenEmpresa1;
    private javax.swing.JLabel lblRestricciones;
    private javax.swing.JLabel lblSugerencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVariableX;
    private javax.swing.JLabel lblVariableY;
    private javax.swing.JLabel lblVariableY1;
    private javax.swing.JPanel pnlGrafico;
    private javax.swing.JSpinner spnCoefXObjetivo;
    private javax.swing.JSpinner spnCoefYObjetivo;
    private javax.swing.JTextField txtDescripcionZ;
    // End of variables declaration//GEN-END:variables
}
