package Entity;

import java.sql.Date;

public class HoaDon {
    private String MaHD;
    private double TongTien;
    private Date ThoiGianXuatHD;
    private String MaMay;
    private String tenKH;
    private String tenNV;
    private String tenMA;
    private String tenDU;
    private String loaiThe;

    public HoaDon() {
    }

    public HoaDon(String MaHD, double TongTien, Date ThoiGianXuatHD, String MaMay, String tenKH, String tenNV, String tenMA, String tenDU, String loaiThe) {
        this.MaHD = MaHD;
        this.TongTien = TongTien;
        this.ThoiGianXuatHD = ThoiGianXuatHD;
        this.MaMay = MaMay;
        this.tenKH = tenKH;
        this.tenNV = tenNV;
        this.tenMA = tenMA;
        this.tenDU = tenDU;
        this.loaiThe = loaiThe;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getThoiGianXuatHD() {
        return ThoiGianXuatHD;
    }

    public void setThoiGianXuatHD(Date ThoiGianXuatHD) {
        this.ThoiGianXuatHD = ThoiGianXuatHD;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenMA() {
        return tenMA;
    }

    public void setTenMA(String tenMA) {
        this.tenMA = tenMA;
    }

    public String getTenDU() {
        return tenDU;
    }

    public void setTenDU(String tenDU) {
        this.tenDU = tenDU;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }
}
