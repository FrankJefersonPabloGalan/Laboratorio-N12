/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio12;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ESTUDIANTE
 */
public class Calculadora extends javax.swing.JFrame {

    Operacion opera = new Operacion();
    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblError1 = new javax.swing.JLabel();
        lblError3 = new javax.swing.JLabel();
        lblError2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setBackground(new java.awt.Color(255, 255, 153));
        txtResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 240, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblresultado.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnSuma.png"))); // NOI18N
        btnSuma.setBorder(null);
        btnSuma.setContentAreaFilled(false);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnResta.png"))); // NOI18N
        btnResta.setBorder(null);
        btnResta.setContentAreaFilled(false);
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        btnDivision.setBackground(new java.awt.Color(255, 0, 0));
        btnDivision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnDivision.png"))); // NOI18N
        btnDivision.setBorder(null);
        btnDivision.setContentAreaFilled(false);
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        btnMultiplicacion.setBackground(new java.awt.Color(255, 0, 0));
        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/btnMultiplicacion.png"))); // NOI18N
        btnMultiplicacion.setBorder(null);
        btnMultiplicacion.setContentAreaFilled(false);
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        txtNum1.setBackground(new java.awt.Color(255, 255, 153));
        txtNum1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNum1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 260, 49));

        txtNum2.setBackground(new java.awt.Color(255, 255, 153));
        txtNum2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNum2.setToolTipText("");
        txtNum2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 260, 49));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblnum1.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFigma/lblnum2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lblError1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(lblError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 260, 30));

        lblError3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(lblError3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 240, 30));

        lblError2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(lblError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 260, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed

        lblError3.setText("");
        opera.setValor1DesdeCaja(txtNum1,lblError1);
        opera.setValor2DesdeCaja(txtNum2,lblError2);
        
        float mul = opera.mul();
        txtResultado.setText(mul+"");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed

        lblError3.setText("");
        opera.setValor1DesdeCaja(txtNum1,lblError1);
        opera.setValor2DesdeCaja(txtNum2,lblError2);
        
        float suma = opera.suma();
        txtResultado.setText(suma+"");
        
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed

        lblError3.setText("");
        opera.setValor1DesdeCaja(txtNum1,lblError1);
        opera.setValor2DesdeCaja(txtNum2,lblError2);
        
        float resta = opera.resta();
        txtResultado.setText(resta+"");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed

        lblError3.setText("");
        opera.setValor1DesdeCaja(txtNum1,lblError1);
        opera.setValor2DesdeCaja(txtNum2,lblError2);
        opera.mostrarResultadoDiv(txtResultado, lblError3);
    }//GEN-LAST:event_btnDivisionActionPerformed


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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError2;
    private javax.swing.JLabel lblError3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
