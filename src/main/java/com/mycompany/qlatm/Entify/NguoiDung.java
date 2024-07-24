    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Entify;

/**
 *
 * @author vinh
 */
public class NguoiDung {

    private String tenND;
    private Integer pin;
    private Integer stk;
    private Integer CCCD;
    private double sodu;
    private String lienHe;

    public NguoiDung() {
    }

    public NguoiDung(String tenND, Integer pin, Integer stk, Integer CCCD, double sodu, String lienHe) {
        this.tenND = tenND;
        this.pin = pin;
        this.stk = stk;
        this.CCCD = CCCD;
        this.sodu = sodu;
        this.lienHe = lienHe;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Integer getStk() {
        return stk;
    }

    public void setStk(Integer stk) {
        this.stk = stk;
    }

    public Integer getCCCD() {
        return CCCD;
    }

    public void setCCCD(Integer CCCD) {
        this.CCCD = CCCD;
    }

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    public String getLienHe() {
        return lienHe;
    }

    public void setLienHe(String lienHe) {
        this.lienHe = lienHe;
    }
    public void congsodu(Double amount){
        sodu += amount;
    }
    public void trusodu(Double amount){
        sodu-=amount;
    }
    public String getaccinfor(){
        return "Name: "+tenND+", Account Number: "+stk+", So du: "+sodu;
    }
}
