package view;

import controller.AsignacionRecursosController;
import controller.ProcesamientoController;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;

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

        jLabel1 = new javax.swing.JLabel();
        lblImagenEmpresa1 = new javax.swing.JLabel();
        lblSugerencia = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        pnlGrafico = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnMaximizar = new javax.swing.JButton();
        lblRestricciones = new javax.swing.JLabel();
        spnCoefXObjetivo = new javax.swing.JSpinner();
        spnCoefYObjetivo = new javax.swing.JSpinner();
        txtVariableX = new javax.swing.JTextField();
        lblVariableX = new javax.swing.JLabel();
        lblVariableY = new javax.swing.JLabel();
        lblVariableY1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Optimiza tu Objetivo");

        lblImagenEmpresa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/undraw_winners.png"))); // NOI18N
        lblImagenEmpresa1.setInheritsPopupMenu(false);
        lblImagenEmpresa1.setMaximumSize(new java.awt.Dimension(981, 768));

        lblSugerencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSugerencia.setText("Si quieres minimizar el costo tendras que trabajar 12 casas y 10 Departamentos");

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
            .addGap(0, 476, Short.MAX_VALUE)
        );
        pnlGraficoLayout.setVerticalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(0, 0, 255));
        btnMinimizar.setText("Minimizar");
        btnMinimizar.setToolTipText("");
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
        btnMaximizar.setToolTipText("");
        btnMaximizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMaximizar.setFocusCycleRoot(true);
        btnMaximizar.setFocusPainted(false);
        btnMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizarActionPerformed(evt);
            }
        });

        lblRestricciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRestricciones.setText("Si quieres minimizar el costo tendras que trabajar 12 casas y 10 Departamentos");

        txtVariableX.setToolTipText("Nombra a tu ");

        lblVariableX.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVariableX.setText("Variable1");

        lblVariableY.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVariableY.setText("Variable2");

        lblVariableY1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVariableY1.setText("Descripción objetivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
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
                            .addComponent(txtVariableX, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRestricciones)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSugerencia)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lblImagenEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVariableY1)
                            .addComponent(lblVariableY)
                            .addComponent(lblVariableX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnCoefYObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCoefXObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVariableX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSugerencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRestricciones)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblImagenEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(pnlGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizarActionPerformed

    public JPanel getPnlGrafico() {
        return pnlGrafico;
    }

    public JLabel getLblRestricciones() {
        return lblRestricciones;
    }

    public JSpinner getSpnCoefXObjetivo() {
        return spnCoefXObjetivo;
    }

    public JSpinner getSpnCoefYObjetivo() {
        return spnCoefYObjetivo;
    }

    public JLabel getLblVariableX() {
        return lblVariableX;
    }

    public JLabel getLblVariableY() {
        return lblVariableY;
    }

    public JLabel getLblSugerencia() {
        return lblSugerencia;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMaximizar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImagenEmpresa1;
    private javax.swing.JLabel lblRestricciones;
    private javax.swing.JLabel lblSugerencia;
    private javax.swing.JLabel lblVariableX;
    private javax.swing.JLabel lblVariableY;
    private javax.swing.JLabel lblVariableY1;
    private javax.swing.JPanel pnlGrafico;
    private javax.swing.JSpinner spnCoefXObjetivo;
    private javax.swing.JSpinner spnCoefYObjetivo;
    private javax.swing.JTextField txtVariableX;
    // End of variables declaration//GEN-END:variables
}
