/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Entify;

/**
 *
 * @author GIGABYTE
 */
public class PhanHoi {
     private int SoTaiKhoan;
    private String NoiDung;

    public PhanHoi() {
    }

    public PhanHoi(int SoTaiKhoan, String NoiDung) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.NoiDung = NoiDung;
    }

    public int getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(int SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }
    
}
