/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Entify;


public class TaiKhoan {
    private int soTaiKhoan; 
   private String matKhau; 
   private boolean loaiTaiKhoan;

    public TaiKhoan() {
    }

    public TaiKhoan(int soTaiKhoan, String matKhau, boolean loaiTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(boolean loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    
   
   
}

