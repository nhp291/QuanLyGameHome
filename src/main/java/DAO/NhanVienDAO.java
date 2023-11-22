package DAO;

import Entity.NhanVien;
import Utils.JDBC;
import java.sql.ResultSet;  
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends DinoGaming<NhanVien, String> {
    
    final String INSERT_SQL = "INSERT INTO NhanVien VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE NhanVien SET TenNV = ? , Email = ?, SDT = ? , TaiKhoanNV = ?, MatKhauNV = ?, NgaySinhNV = ?, VaiTro = ? WHERE MaNV= ?";
    final String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    final String SELECT_BY_ID = "SELECT * FROM NhanVien WHERE TaiKhoanNV = ?";
    
    @Override
    public void insert(NhanVien entity) {
        JDBC.update(INSERT_SQL, entity.getMaNV(), entity.getTenNV(), entity.getEmail(), entity.getSDT(), entity.getTaiKhoanNV(), entity.getMatKhauNV(), entity.getNgaySinhNV(),entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JDBC.update(UPDATE_SQL, entity.getTenNV(), entity.getEmail(), entity.getSDT(), entity.getTaiKhoanNV(),  entity.getNgaySinhNV(), entity.isVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID, key);
        return list.size() > 0 ? list.get(0) : null;
//        List<NhanVien> list = selectBySql(SELECT_BY_ID, id);
//        if(list.isEmpty()){
//            return null;
//        }
//        return list.get(0);
    }
    

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setEmail(rs.getString("Email"));
                nv.setSDT(rs.getString("SDT"));
                nv.setTaiKhoanNV(rs.getString("TaiKhoanNV"));
                nv.setMatKhauNV(rs.getString("MatKhauNV"));
                nv.setNgaySinhNV(rs.getString("NgaySinhNV"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(nv);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    
}
