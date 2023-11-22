/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Phong
 */
public class KhachHang {
    private String MaKH;
    private String TenKH;
    private String TaiKhoanKH;
    private String MatKhauKH;
    private double NgaySinhKH;
    private double SoDu;
    private String MaNV;
    private String sdt;
    private String Email;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String TaiKhoanKH, String MatKhauKH, double NgaySinhKH, double SoDu, String MaNV, String sdt, String Email) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.TaiKhoanKH = TaiKhoanKH;
        this.MatKhauKH = MatKhauKH;
        this.NgaySinhKH = NgaySinhKH;
        this.SoDu = SoDu;
        this.MaNV = MaNV;
        this.sdt = sdt;
        this.Email = Email;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getTaiKhoanKH() {
        return TaiKhoanKH;
    }

    public void setTaiKhoanKH(String TaiKhoanKH) {
        this.TaiKhoanKH = TaiKhoanKH;
    }

    public String getMatKhauKH() {
        return MatKhauKH;
    }

    public void setMatKhauKH(String MatKhauKH) {
        this.MatKhauKH = MatKhauKH;
    }

    public double getNgaySinhKH() {
        return NgaySinhKH;
    }

    public void setNgaySinhKH(double NgaySinhKH) {
        this.NgaySinhKH = NgaySinhKH;
    }

    public double getSoDu() {
        return SoDu;
    }

    public void setSoDu(double SoDu) {
        this.SoDu = SoDu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
