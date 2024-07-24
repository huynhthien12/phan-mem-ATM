    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author vinh
 */
public class soDu {

    public double getBalanceByAccountNumber(int stk) {
        double soDu = 0; // Biến lưu trữ số dư
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLATMM", "sa", "123");
            // Tạo đối tượng PreparedStatement để thực hiện truy vấn
            String sql = "Select soDu from NguoiDung where soTaiKhoan = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            // Thiết lập tham số cho câu truy vấn
            ps.setInt(1, stk);
            // Thực hiện truy vấn và lấy kết quả
            ResultSet rs = ps.executeQuery();
            // Nếu có kết quả, gán số dư vào biến balance
            if (rs.next()) {
                soDu = rs.getDouble("Sodu");

            }

        } catch (Exception e) {
            // In thông báo lỗi
            System.out.println("Lấy số dư thất bại!");
            e.printStackTrace();
        }
        // Trả về số dư
        return soDu;

    }

    public static void savebalance(double soDu, int stk) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLATMM", "sa", "123");
            String sql="UPDATE NguoiDung SET SoDu = ? WHERE SoTaiKhoan = ?;";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setDouble(1, soDu);
            ps.setInt(2, stk);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(soDu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
