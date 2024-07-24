/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.qlatm.ui;

import com.mycompany.qlatm.Dao.NguoiDungDAO;
import com.mycompany.qlatm.Dao.TaiKhoanDao;
import com.mycompany.qlatm.Entify.NguoiDung;
import com.mycompany.qlatm.Until.Auth;
import com.mycompany.qlatm.Until.MsgBox;
import com.mycompany.qlatm.Until.soDu;


/**
 *
 * @author GIGABYTE
 */
public class ChuyenTien extends javax.swing.JDialog {

    NguoiDungDAO dao = new NguoiDungDAO();
    TaiKhoanDao tkdao = new TaiKhoanDao();
    NguoiDung nguoidung= new NguoiDung();
    /**
     * Creates new form ChuyenTien
     */
    soDu sd = new soDu();

    public ChuyenTien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("STARBANK-Chuyển tiền");
//        txtSoTaiKhoan.setText(String.valueOf(Auth.getstk()));
//        txtSoTaiKhoan.setVisible(false);
        txtsodu.setText(String.valueOf(sd.getBalanceByAccountNumber(Auth.getstk())));
        txtSoTaiKhoan.setEnabled(false);
        txtsodu.setEnabled(false);
        fill();
    }
//     public void ketThuc(){
//         if(Msgbox.confirm(this, "Ban co muon ket thuc ung dung khong")){
//          System.exit(0);
//      }
//    }
//    void ChuyenTien(){
//        soDu sd = new soDu(); 
//        double soDuChuyen = sd.getBalanceByAccountNumber(Auth.getstk()); 
//        if(soDuChuyen==0){
//            Msgbox.alert(this, "Khong du tien");
//        }else{
//            int stk = Integer.valueOf(txtSoTaiKhoan.getText()); 
//             TaiKhoan tk = tkdao.selectById(stk); 
//             double soDunhan= sd.getBalanceByAccountNumber(Auth.getstk());
//             double soTien = Double.valueOf(txtSoTien.getText()); 
//             sd.savebalance(soDuChuyen-soTien, Auth.getstk());
//             sd.savebalance(soDunhan+soTien, Auth.getstk());
//        }
//    }

    void fill() {
        int stk = Auth.getstk();
        txtSoTaiKhoan.setText(String.valueOf(stk));
        txtsodu.setText(String.valueOf(sd.getBalanceByAccountNumber(stk)));
//        txtTenND.setText(String.valueOf());
    }

    public void ketThuc() {
        dispose();
//          System.exit(0);

    }

    void clearForm() {
        txtstkchuyen.setText("");
        txtSoTien.setText("");
        txtMaPin.setText("");
    }

    void ChuyenTien() {
        int stk = Auth.getstk();
        int pin = Integer.valueOf(txtMaPin.getText());
        NguoiDung nd = dao.selectById(String.valueOf(stk));
        int a=nd.getPin();
        double soTien = Double.valueOf(txtSoTien.getText());
        double soDuTaiKhoanRut = sd.getBalanceByAccountNumber(Auth.getstk());
        double soDuTaiKhoanNhan = sd.getBalanceByAccountNumber(Integer.valueOf(txtstkchuyen.getText()));

        if (soDuTaiKhoanRut <= 0) {
            MsgBox.alter(this, "Khong du tien");
        } else if(soTien < soDuTaiKhoanRut){
//            TaiKhoan tkc = tkdao.selectById(Integer.valueOf(txtstkchuyen.getText()));
                if (pin == a) {
                    sd.savebalance(soDuTaiKhoanRut - soTien, Auth.getstk());
                    sd.savebalance(soTien + soDuTaiKhoanNhan, Integer.valueOf(txtstkchuyen.getText()));
                    MsgBox.alter(this, "Chuyển thành công");
                    clearForm();
                    fill();
                }else{
                MsgBox.alter(this, "Sai mã pin");
                }
            } else {
                MsgBox.alter(this, "Số tiền không hợp lệ");
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtstkchuyen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsodu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSoTaiKhoan = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaPin = new javax.swing.JTextField();
        btnChuyen = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Số tài khoản cần chuyển: ");

        jLabel6.setText("Số dư");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Chuyển tiền");

        jLabel2.setText("Số tài khoản");

        jLabel3.setText("Số tiền");

        jLabel4.setText("Mã pin");

        btnChuyen.setText("Chuyển");
        btnChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaPin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnChuyen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtstkchuyen)
                            .addComponent(txtsodu))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtSoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtstkchuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChuyen)
                    .addComponent(btnThoat))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenActionPerformed
        ChuyenTien();
    }//GEN-LAST:event_btnChuyenActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        ketThuc();
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChuyenTien dialog = new ChuyenTien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyen;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtMaPin;
    private javax.swing.JTextField txtSoTaiKhoan;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtsodu;
    private javax.swing.JTextField txtstkchuyen;
    // End of variables declaration//GEN-END:variables
}