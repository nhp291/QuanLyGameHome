/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String Email;
    private String SDT;
    private String TaiKhoanNV;
    private String MatKhauNV;
    private String NgaySinhNV;
    private boolean VaiTro;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String Email, String SDT, String TaiKhoanNV, String MatKhauNV, String NgaySinhNV, boolean VaiTro) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.Email = Email;
        this.SDT = SDT;
        this.TaiKhoanNV = TaiKhoanNV;
        this.MatKhauNV = MatKhauNV;
        this.NgaySinhNV = NgaySinhNV;
        this.VaiTro = VaiTro;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTaiKhoanNV() {
        return TaiKhoanNV;
    }

    public void setTaiKhoanNV(String TaiKhoanNV) {
        this.TaiKhoanNV = TaiKhoanNV;
    }

    public String getMatKhauNV() {
        return MatKhauNV;
    }

    public void setMatKhauNV(String MatKhauNV) {
        this.MatKhauNV = MatKhauNV;
    }

    public String getNgaySinhNV() {
        return NgaySinhNV;
    }

    public void setNgaySinhNV(String NgaySinhNV) {
        this.NgaySinhNV = NgaySinhNV;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }
    
    
}
