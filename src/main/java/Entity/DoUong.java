/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;


public class DoUong {
    private int MaDU;
    private String TenDU;
    private int SoLuongDU;
    private double GiaDU;

    public DoUong() {
    }

    public DoUong(int MaDU, String TenDU, int SoLuongDU, double GiaDU) {
        this.MaDU = MaDU;
        this.TenDU = TenDU;
        this.SoLuongDU = SoLuongDU;
        this.GiaDU = GiaDU;
    }

    public int getMaDU() {
        return MaDU;
    }

    public void setMaDU(int MaDU) {
        this.MaDU = MaDU;
    }

    public String getTenDU() {
        return TenDU;
    }

    public void setTenDU(String TenDU) {
        this.TenDU = TenDU;
    }

    public int getSoLuongDU() {
        return SoLuongDU;
    }

    public void setSoLuongDU(int SoLuongDU) {
        this.SoLuongDU = SoLuongDU;
    }

    public double getGiaDU() {
        return GiaDU;
    }

    public void setGiaDU(double GiaDU) {
        this.GiaDU = GiaDU;
    }
    
    
}
