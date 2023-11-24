package DAO;

import Entity.KhachHang;
//import Entyti.KhachHang;
//import Entity.KhachHang;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO extends DinoGaming<KhachHang, String>{
    final String INSERT_SQL = "INSERT INTO KhachHang VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE KhachHang TenKH = ?, TaiKhoanKH = ?, MatKhauKH = ?, NgaySinhKH = ?, SoDu = ?, MaNV = ?, sdt = ?, Email = ? WHERE MaKH";
    final String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM MaKH = ?";
    final String SELECT_BY_ID = "SELECT * FROM KhachHang WHERE TaiKhoanKH = ?";

    @Override
    public void insert(KhachHang entity) {
        JDBC.update(INSERT_SQL, entity.getMaKH(), entity.getTenKH(), entity.getTaiKhoanKH(), entity.getMatKhauKH(), entity.getNgaySinhKH(), entity.getSoDu(), entity.getMaNV(), entity.getSdt(), entity.getEmail());
    }

    @Override
    public void update(KhachHang entity) {
        JDBC.update(UPDATE_SQL, entity.getEmail(), entity.getTenKH(), entity.getTaiKhoanKH(), entity.getMatKhauKH(), entity.getNgaySinhKH(), entity.getSoDu(), entity.getMaNV(), entity.getSdt(), entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = selectBySql(SELECT_BY_ID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try{
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setTaiKhoanKH(rs.getString("TaiKhoanKH"));
                kh.setMatKhauKH(rs.getString("MatKhauKH"));
                kh.setNgaySinhKH(rs.getString("NgaySinhKH"));
                kh.setSoDu(rs.getDouble("SoDu"));
                kh.setMaNV(rs.getString("MaNV"));
                kh.setSdt(rs.getString("sdt"));
                kh.setEmail(rs.getString("Email"));
                list.add(kh);
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return list;
        }
    }
