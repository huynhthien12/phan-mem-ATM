/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Entify;

import java.sql.Date;

/**
 *
 * @author GIGABYTE
 */
public class GiaoDich {
    private int MaGiaoDich;
    private int SoTaiKhoan;
    private int SoTaiKhoanGiaoDich;
    private String LoaiGiaoDich;
    private float SoTienGiaoDich;
    private Date NgayGioGiaoDich;
    private String ThongTinChiTietGiaoDich;

    public GiaoDich() {
    }

    public GiaoDich(int MaGiaoDich, int SoTaiKhoan, int SoTaiKhoanGiaoDich, String LoaiGiaoDich, float SoTienGiaoDich, Date NgayGioGiaoDich, String ThongTinChiTietGiaoDich) {
        this.MaGiaoDich = MaGiaoDich;
        this.SoTaiKhoan = SoTaiKhoan;
        this.SoTaiKhoanGiaoDich = SoTaiKhoanGiaoDich;
        this.LoaiGiaoDich = LoaiGiaoDich;
        this.SoTienGiaoDich = SoTienGiaoDich;
        this.NgayGioGiaoDich = NgayGioGiaoDich;
        this.ThongTinChiTietGiaoDich = ThongTinChiTietGiaoDich;
    }

    public int getMaGiaoDich() {
        return MaGiaoDich;
    }

    public void setMaGiaoDich(int MaGiaoDich) {
        this.MaGiaoDich = MaGiaoDich;
    }

    public int getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(int SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public int getSoTaiKhoanGiaoDich() {
        return SoTaiKhoanGiaoDich;
    }

    public void setSoTaiKhoanGiaoDich(int SoTaiKhoanGiaoDich) {
        this.SoTaiKhoanGiaoDich = SoTaiKhoanGiaoDich;
    }

    public String getLoaiGiaoDich() {
        return LoaiGiaoDich;
    }

    public void setLoaiGiaoDich(String LoaiGiaoDich) {
        this.LoaiGiaoDich = LoaiGiaoDich;
    }

    public float getSoTienGiaoDich() {
        return SoTienGiaoDich;
    }

    public void setSoTienGiaoDich(float SoTienGiaoDich) {
        this.SoTienGiaoDich = SoTienGiaoDich;
    }

    public Date getNgayGioGiaoDich() {
        return NgayGioGiaoDich;
    }

    public void setNgayGioGiaoDich(Date NgayGioGiaoDich) {
        this.NgayGioGiaoDich = NgayGioGiaoDich;
    }

    public String getThongTinChiTietGiaoDich() {
        return ThongTinChiTietGiaoDich;
    }

    public void setThongTinChiTietGiaoDich(String ThongTinChiTietGiaoDich) {
        this.ThongTinChiTietGiaoDich = ThongTinChiTietGiaoDich;
    }
    
}
