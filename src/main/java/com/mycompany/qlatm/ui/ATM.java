/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlatm.ui;

import com.mycompany.qlatm.Until.Auth;
import com.mycompany.qlatm.Until.MsgBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


/**
 *
 * @author GIGABYTE
 */
public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form ATM
     */
      void init(){
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHO1.setText(format.format(new Date()));
            }
        }).start();
       this.openWelcom();
//       this.opengioithieu();
       this.openLogin();
    }
    public ATM() {
        initComponents();
        setLocationRelativeTo(null);
        init();       
    }
// void opengioithieu(){
//     new GioiThieu(this, true).setVisible(true);
// }
void openWelcom(){
    new ChaoDialog(this, true).setVisible(true);
}
void openLogin(){
    new DangNhapDiaLog(this, true).setVisible(true);
}
void thongTinTaiKhoan(){
    if(Auth.isLogin()){
      new Thongtintaikhoan(this, true).setVisible(true);
    }else{
        MsgBox.alter(this, "Vui long dang nhap");
    }   
}
void dichVu(){
    if(Auth.isLogin()){
        new DichVuNapCard(this, true).setVisible(true);
    }else{
        MsgBox.alter(this, "Vui long dang nhap");
    }
}
void rutTien(){
    if(Auth.isLogin()){
        new RutTien().setVisible(true);
    }else{
        MsgBox.alter(this, "Vui long dang nhap");
    }
}

void napTien(){
     if(Auth.isLogin()){
        new NapTien(this, true).setVisible(true);
    }else{
        MsgBox.alter(this, "Vui long dang nhap");
    }
}
void chuyenTien(){
    if(Auth.isLogin()){
        new ChuyenTien(this, true).setVisible(true);
    }else{
        MsgBox.alter(this, "Vui long Dang Nhap");
    }
    
}
void dangXuat(){
    Auth.clear(); 
    openLogin();
}
void doimk(){
    new DoiMatKhau().setVisible(true);
}
void doiMaPin(){
    new DoiMaPin(this, true).setVisible(true);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDongHO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRutTien = new javax.swing.JButton();
        btnChuyenTien = new javax.swing.JButton();
        btnThongTinKH = new javax.swing.JButton();
        btnPin = new javax.swing.JButton();
        btnSoDu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lblDongHO1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DichVu = new javax.swing.JButton();

        lblDongHO.setText("00:00:00  AM");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NGÂN HÀNG STARBANK XIN CHÀO QUÝ KHÁCH");

        btnRutTien.setText("Rút tiền");
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        btnChuyenTien.setText("Chuyển tiền");
        btnChuyenTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenTienActionPerformed(evt);
            }
        });

        btnThongTinKH.setText("Thông tin khách hàng");
        btnThongTinKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinKHActionPerformed(evt);
            }
        });

        btnPin.setText("Pin");
        btnPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinActionPerformed(evt);
            }
        });

        btnSoDu.setText("Số dư");
        btnSoDu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoDuActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jButton7.setText("Đổi mật khẩu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        lblDongHO1.setText("00:00:00  AM");

        jButton1.setText("Nạp tiền");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DichVu.setText("Dich vu card");
        DichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DichVuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnThongTinKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRutTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChuyenTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSoDu, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(btnPin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDongHO1)
                        .addGap(71, 71, 71)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(DichVu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRutTien)
                    .addComponent(btnPin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChuyenTien)
                    .addComponent(btnSoDu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThongTinKH)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DichVu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(lblDongHO1)
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        doimk();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
dangXuat();        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
rutTien();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void btnChuyenTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenTienActionPerformed
chuyenTien();        // TODO add your handling code here:
    }//GEN-LAST:event_btnChuyenTienActionPerformed

    private void btnThongTinKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinKHActionPerformed
      thongTinTaiKhoan();
    }//GEN-LAST:event_btnThongTinKHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       napTien();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSoDuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoDuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSoDuActionPerformed

    private void btnPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinActionPerformed
        doiMaPin();
    }//GEN-LAST:event_btnPinActionPerformed

    private void DichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DichVuActionPerformed
dichVu();        // TODO add your handling code here:
    }//GEN-LAST:event_DichVuActionPerformed

    void Exit(){
        if (MsgBox.confirm(this, "bạn muốn thoát ứng dụng? ")) {
            System.exit(0);
        }
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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DichVu;
    private javax.swing.JButton btnChuyenTien;
    private javax.swing.JButton btnPin;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JButton btnSoDu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongTinKH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDongHO;
    private javax.swing.JLabel lblDongHO1;
    // End of variables declaration//GEN-END:variables
}