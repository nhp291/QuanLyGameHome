/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.HoaDon;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO extends DinoGaming<HoaDon, String>{
    final String INSERT_SQL = "INSERT INTO HoaDon VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE HoaDon SET TongTien = ?, ThoiGianXuatHD = ?, MaMay = ?, TenKH = ?, TenNV = ?, TenMA = ?, TenDU = ?, LoaiThe = ?";
    final String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHD = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM HoaDon";
    final String SELECT_BY_ID = "SELECT * FROM HoaDon WHERE MaHD = ?";
    @Override
    public void insert(HoaDon entity) {
        JDBC.update(INSERT_SQL, entity.getMaHD(), entity.getTongTien(), entity.getThoiGianXuatHD(), entity.getMaMay(), entity.getTenKH(), entity.getTenNV(), entity.getTenMA(), entity.getTenDU(), entity.getLoaiThe());
    }

    @Override
    public void update(HoaDon entity) {
        JDBC.update(UPDATE_SQL,  entity.getMaHD(), entity.getTongTien(), entity.getThoiGianXuatHD(), entity.getMaMay(), entity.getTenKH(), entity.getTenNV(), entity.getTenMA(), entity.getTenDU(), entity.getLoaiThe());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectById(String id) {
        List<HoaDon> list = selectBySql(SELECT_BY_ID, id);
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
    List<HoaDon> list = new ArrayList<>();
    try {
        ResultSet rs = JDBC.query(sql, args);
        while(rs.next()){
            HoaDon hd = new HoaDon();
            hd.setMaHD(rs.getString("MaHD"));
            hd.setTongTien(rs.getDouble("TongTien"));
            hd.setThoiGianXuatHD(rs.getDate("ThoiGianXuatHD"));
            hd.setMaMay(rs.getString("MaMay"));
            hd.setTenKH(rs.getString("TenKH"));
            hd.setTenNV(rs.getString("TenNV"));
            hd.setTenMA(rs.getString("TenMA"));
            hd.setTenDU(rs.getString("TenDU"));
            hd.setLoaiThe(rs.getString("LoaiThe"));
            list.add(hd);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return list;
}

    
}
