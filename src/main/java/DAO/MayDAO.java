/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.May;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MayDAO extends DinoGaming<May, String>{
    final String INSERT_SQL = "INSERT INTO May VALUES (?, ?, ?, ?)"; //MaMay, TrangThai, LoaiMay, MaNV
    final String UPDATE_SQL = "UPDATE May SET TrangThai = ?, LoaiMay = ?, MaNV = ? WHERE MaMay = ?;";
    final String DELETE_SQL = "DELETE FROM May WHERE MaMay = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM May";
    final String SELECT_BY_ID = "SELECT * FROM May WHERE MaMay = ?";
    @Override
    public void insert(May entity) {
        JDBC.update(INSERT_SQL, entity.getMaMay(), entity.getTrangThai(), entity.getLoaiMay(), entity.getMaNV());
    }

    @Override
    public void update(May entity) {
        JDBC.update(INSERT_SQL, entity.getTrangThai(), entity.getLoaiMay(), entity.getMaNV(), entity.getMaMay());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<May> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public May selectById(String id) {
        List<May> list = selectBySql(SELECT_BY_ID, id);
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<May> selectBySql(String sql, Object... args) {
        List<May> list = new ArrayList<>();
        
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                May ma = new May();
                ma.setMaMay(rs.getString("MaMay"));
                ma.setTrangThai(rs.getString("TrangThai"));
                ma.setLoaiMay(rs.getString("LoaiMay"));
                ma.setMaNV(rs.getString("MaNV"));
                list.add(ma);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
}
