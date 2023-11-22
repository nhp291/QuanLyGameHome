/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author Phong
 */
public class MaySuDung {
    private String MaMay;
    private Date GioBatDau;
    private double GiaMay;
    private String MaNV;
    private String MaKH;

    public MaySuDung() {
    }

    public MaySuDung(String MaMay, Date GioBatDau, double GiaMay, String MaNV, String MaKH) {
        this.MaMay = MaMay;
        this.GioBatDau = GioBatDau;
        this.GiaMay = GiaMay;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public Date getGioBatDau() {
        return GioBatDau;
    }

    public void setGioBatDau(Date GioBatDau) {
        this.GioBatDau = GioBatDau;
    }

    public double getGiaMay() {
        return GiaMay;
    }

    public void setGiaMay(double GiaMay) {
        this.GiaMay = GiaMay;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }
    
    
}
