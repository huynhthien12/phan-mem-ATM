/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Entify;

/**
 *
 * @author GIGABYTE
 */
public class DichVu {
    private String TenDichVu;
    private float GiaTien;

    public DichVu() {
    }

    public DichVu(String TenDichVu, float GiaTien) {
        this.TenDichVu = TenDichVu;
        this.GiaTien = GiaTien;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float GiaTien) {
        this.GiaTien = GiaTien;
    }
    
   
    
}
