/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Phong
 */
public class MonAn {
    private int MaMA;
    private String TenMA;
    private int SoLuongMA;
    private double GiaMA;

    public MonAn() {
    }

    public MonAn(int MaMA, String TenMA, int SoLuongMA, double GiaMA) {
        this.MaMA = MaMA;
        this.TenMA = TenMA;
        this.SoLuongMA = SoLuongMA;
        this.GiaMA = GiaMA;
    }

    public int getMaMA() {
        return MaMA;
    }

    public void setMaMA(int MaMA) {
        this.MaMA = MaMA;
    }

    public String getTenMA() {
        return TenMA;
    }

    public void setTenMA(String TenMA) {
        this.TenMA = TenMA;
    }

    public int getSoLuongMA() {
        return SoLuongMA;
    }

    public void setSoLuongMA(int SoLuongMA) {
        this.SoLuongMA = SoLuongMA;
    }

    public double getGiaMA() {
        return GiaMA;
    }

    public void setGiaMA(double GiaMA) {
        this.GiaMA = GiaMA;
    }
    
    
    
}
