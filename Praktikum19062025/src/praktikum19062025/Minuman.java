/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum19062025;

/**
 *
 * @author nofri
 */
public class Minuman extends javax.swing.JFrame {

    /**
     * Creates new form Minuman
     */
    private MenuUtama utama;
    
    public Minuman() {
        initComponents();
    }
    public Minuman(MenuUtama utama){
        this.utama = utama;
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

        txtIceTea = new javax.swing.JTextField();
        btnTotHarga = new javax.swing.JButton();
        txtCapcin = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFanSu = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        cbLemonTea = new javax.swing.JComboBox<>();
        txtTotMinuman = new javax.swing.JTextField();
        cbIceTea = new javax.swing.JComboBox<>();
        cbCapcin = new javax.swing.JComboBox<>();
        chkLemonTea = new javax.swing.JCheckBox();
        cbFanSu = new javax.swing.JComboBox<>();
        chkIceTea = new javax.swing.JCheckBox();
        txtTotLemonTea = new javax.swing.JTextField();
        chkCapcin = new javax.swing.JCheckBox();
        txtTotIceTea = new javax.swing.JTextField();
        chkFanSu = new javax.swing.JCheckBox();
        txtTotCapcin = new javax.swing.JTextField();
        txtLemonTea = new javax.swing.JTextField();
        txtTotFanSu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIceTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtIceTea.setText("0");

        btnTotHarga.setBackground(new java.awt.Color(102, 204, 0));
        btnTotHarga.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnTotHarga.setText("Total Harga");
        btnTotHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotHargaActionPerformed(evt);
            }
        });

        txtCapcin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtCapcin.setText("0");

        btnReset.setBackground(new java.awt.Color(102, 204, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DAFTAR MENU MINUMAN");

        txtFanSu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtFanSu.setText("0");

        btnBack.setBackground(new java.awt.Color(102, 204, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBack.setText("Kembali Ke Menu Utama");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbLemonTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbLemonTea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbLemonTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLemonTeaActionPerformed(evt);
            }
        });

        txtTotMinuman.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTotMinuman.setText("0");

        cbIceTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbIceTea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbIceTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIceTeaActionPerformed(evt);
            }
        });

        cbCapcin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbCapcin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbCapcin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCapcinActionPerformed(evt);
            }
        });

        chkLemonTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkLemonTea.setText("Lemon Tea");
        chkLemonTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLemonTeaActionPerformed(evt);
            }
        });

        cbFanSu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbFanSu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbFanSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFanSuActionPerformed(evt);
            }
        });

        chkIceTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkIceTea.setText("Ice Tea");
        chkIceTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIceTeaActionPerformed(evt);
            }
        });

        txtTotLemonTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTotLemonTea.setText("0");

        chkCapcin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkCapcin.setText("Capcin");
        chkCapcin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCapcinActionPerformed(evt);
            }
        });

        txtTotIceTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTotIceTea.setText("0");

        chkFanSu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkFanSu.setText("Fanta Susu");
        chkFanSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFanSuActionPerformed(evt);
            }
        });

        txtTotCapcin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTotCapcin.setText("0");

        txtLemonTea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtLemonTea.setText("0");

        txtTotFanSu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTotFanSu.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkLemonTea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkIceTea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkFanSu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCapcin, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnReset)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCapcin)
                        .addComponent(txtIceTea)
                        .addComponent(txtFanSu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbIceTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCapcin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFanSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTotHarga))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotLemonTea)
                            .addComponent(txtTotIceTea)
                            .addComponent(txtTotCapcin)
                            .addComponent(txtTotFanSu)
                            .addComponent(txtTotMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkLemonTea)
                    .addComponent(txtLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkIceTea)
                    .addComponent(txtIceTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIceTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotIceTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCapcin)
                    .addComponent(txtCapcin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCapcin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotCapcin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFanSu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFanSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFanSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotFanSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTotHarga)
                    .addComponent(txtTotMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnReset))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotHargaActionPerformed
        double lemonTea = Double.parseDouble(txtTotLemonTea.getText());
        double iceTea = Double.parseDouble(txtTotIceTea.getText());
        double Capcin = Double.parseDouble(txtTotCapcin.getText());
        double FanSu = Double.parseDouble(txtTotFanSu.getText());
        double total = lemonTea+iceTea+Capcin+FanSu;
        txtTotMinuman.setText(Double.toString(total));
    }//GEN-LAST:event_btnTotHargaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtCapcin.setText("0");
        txtLemonTea.setText("0");
        txtIceTea.setText("0");
        txtFanSu.setText("0");
        txtTotMinuman.setText("0");
        cbCapcin.setSelectedIndex(0);
        cbLemonTea.setSelectedIndex(0);
        cbIceTea.setSelectedIndex(0);
        cbFanSu.setSelectedIndex(0);

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        String total = txtTotMinuman.getText();
        utama.setTotalMinuman(total);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbLemonTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLemonTeaActionPerformed
        int jml = (int)cbLemonTea.getSelectedIndex();
        double harga = Double.parseDouble(txtLemonTea.getText());
        double total = jml*harga;
        txtTotLemonTea.setText(Double.toString(total));
    }//GEN-LAST:event_cbLemonTeaActionPerformed

    private void cbIceTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIceTeaActionPerformed
        int jml = (int)cbIceTea.getSelectedIndex();
        double harga = Double.parseDouble(txtIceTea.getText());
        double total = jml*harga;
        txtTotIceTea.setText(Double.toString(total));
    }//GEN-LAST:event_cbIceTeaActionPerformed

    private void cbCapcinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCapcinActionPerformed
        int jml = (int)cbCapcin.getSelectedIndex();
        double harga = Double.parseDouble(txtCapcin.getText());
        double total = jml*harga;
        txtTotCapcin.setText(Double.toString(total));
    }//GEN-LAST:event_cbCapcinActionPerformed

    private void chkLemonTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLemonTeaActionPerformed
        txtLemonTea.setText("8000");
    }//GEN-LAST:event_chkLemonTeaActionPerformed

    private void cbFanSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFanSuActionPerformed
        int jml = (int)cbFanSu.getSelectedIndex();
        double harga = Double.parseDouble(txtFanSu.getText());
        double total = jml*harga;
        txtTotFanSu.setText(Double.toString(total));
    }//GEN-LAST:event_cbFanSuActionPerformed

    private void chkIceTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIceTeaActionPerformed
        txtIceTea.setText("5000");
    }//GEN-LAST:event_chkIceTeaActionPerformed

    private void chkCapcinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCapcinActionPerformed
        txtCapcin.setText("10000");
    }//GEN-LAST:event_chkCapcinActionPerformed

    private void chkFanSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFanSuActionPerformed
        txtFanSu.setText("12000");
    }//GEN-LAST:event_chkFanSuActionPerformed

    
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
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Minuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotHarga;
    private javax.swing.JComboBox<String> cbCapcin;
    private javax.swing.JComboBox<String> cbFanSu;
    private javax.swing.JComboBox<String> cbIceTea;
    private javax.swing.JComboBox<String> cbLemonTea;
    private javax.swing.JCheckBox chkCapcin;
    private javax.swing.JCheckBox chkFanSu;
    private javax.swing.JCheckBox chkIceTea;
    private javax.swing.JCheckBox chkLemonTea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCapcin;
    private javax.swing.JTextField txtFanSu;
    private javax.swing.JTextField txtIceTea;
    private javax.swing.JTextField txtLemonTea;
    private javax.swing.JTextField txtTotCapcin;
    private javax.swing.JTextField txtTotFanSu;
    private javax.swing.JTextField txtTotIceTea;
    private javax.swing.JTextField txtTotLemonTea;
    private javax.swing.JTextField txtTotMinuman;
    // End of variables declaration//GEN-END:variables
}
