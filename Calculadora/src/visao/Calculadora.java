/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Marcondes Araujo
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
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

        jLabelValor1 = new javax.swing.JLabel();
        jLabelValor2 = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jTextFieldValor1 = new javax.swing.JTextField();
        jTextFieldValor2 = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();
        jButtonSomar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelValor1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelValor1.setText("Valor 1:");

        jLabelValor2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelValor2.setText("Valor 2:");

        jLabelResultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelResultado.setText("Resultado:");

        jTextFieldValor1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jTextFieldValor2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setBackground(new java.awt.Color(255, 204, 204));
        jTextFieldResultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextFieldResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultadoActionPerformed(evt);
            }
        });

        jButtonSomar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonSomar.setText("+");
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });

        jButtonSubtrair.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonDividir.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonDividir.setText("/");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValor1)
                            .addComponent(jLabelValor2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldValor2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextFieldValor1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor1)
                    .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor2)
                    .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResultado)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        double total = Double.parseDouble(jTextFieldValor1.getText()) * Double.parseDouble(jTextFieldValor2.getText());
        jTextFieldResultado.setText(String.valueOf(total));
        limparCampos();
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomarActionPerformed
        double total = Double.parseDouble(jTextFieldValor1.getText()) + Double.parseDouble(jTextFieldValor2.getText());
        jTextFieldResultado.setText(String.valueOf(total));
        limparCampos();
    }//GEN-LAST:event_jButtonSomarActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        double total = Double.parseDouble(jTextFieldValor1.getText()) - Double.parseDouble(jTextFieldValor2.getText());
        jTextFieldResultado.setText(String.valueOf(total));
        limparCampos();
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        double total = Double.parseDouble(jTextFieldValor1.getText()) / Double.parseDouble(jTextFieldValor2.getText());
        jTextFieldResultado.setText(String.valueOf(total));
        limparCampos();
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jTextFieldResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultadoActionPerformed

    private void limparCampos(){
        jTextFieldValor1.setText("");
        jTextFieldValor2.setText("");
    }
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelValor1;
    private javax.swing.JLabel jLabelValor2;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldValor1;
    private javax.swing.JTextField jTextFieldValor2;
    // End of variables declaration//GEN-END:variables
}
