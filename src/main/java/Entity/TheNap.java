/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Phong
 */
public class TheNap {
    private int MaThe;
    private String LoaiThe;
    private double GiaThe;
    private double SoLuong;

    public TheNap() {
    }

    public TheNap(int MaThe, String LoaiThe, double GiaThe, double SoLuong) {
        this.MaThe = MaThe;
        this.LoaiThe = LoaiThe;
        this.GiaThe = GiaThe;
        this.SoLuong = SoLuong;
    }

    public int getMaThe() {
        return MaThe;
    }

    public void setMaThe(int MaThe) {
        this.MaThe = MaThe;
    }

    public String getLoaiThe() {
        return LoaiThe;
    }

    public void setLoaiThe(String LoaiThe) {
        this.LoaiThe = LoaiThe;
    }

    public double getGiaThe() {
        return GiaThe;
    }

    public void setGiaThe(double GiaThe) {
        this.GiaThe = GiaThe;
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
