package Entity;

import java.sql.Date;

public class HoaDon {
    private String MaHD;
    private double TongTien;
    private Date ThoiGianXuatHD;
    private String MaMay;
    private String MaKH;
    private String MaNV;
    private String MaMA;
    private String MaDU;
    private String MaThe;

    public HoaDon() {
    }

    public HoaDon(String MaHD, double TongTien, Date ThoiGianXuatHD, String MaMay, String MaKH, String MaNV, String MaMA, String MaDU, String MaThe) {
        this.MaHD = MaHD;
        this.TongTien = TongTien;
        this.ThoiGianXuatHD = ThoiGianXuatHD;
        this.MaMay = MaMay;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.MaMA = MaMA;
        this.MaDU = MaDU;
        this.MaThe = MaThe;
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

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaMA() {
        return MaMA;
    }

    public void setMaMA(String MaMA) {
        this.MaMA = MaMA;
    }

    public String getMaDU() {
        return MaDU;
    }

    public void setMaDU(String MaDU) {
        this.MaDU = MaDU;
    }

    public String getMaThe() {
        return MaThe;
    }

    public void setMaThe(String MaThe) {
        this.MaThe = MaThe;
    }

}
