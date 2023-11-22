/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.TheNap;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TheNapDAO extends DinoGaming<TheNap, String> {
    final String INSERT_SQL = "INSERT INTO TheNap VALUES (?, ?, ?)";
    final String UPDATE_SQL = "UPDATE TheNap SET LoaiThe = ? , GiaThe = ?, SoLuong = ? WHERE MaThe= ?";
    final String DELETE_SQL = "DELETE FROM TheNap WHERE MaThe = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM TheNap";
    final String SELECT_BY_ID = "SELECT * FROM TheNap WHERE MaThe = ?";
    
    @Override
    public void insert(TheNap entity) {
        JDBC.update(INSERT_SQL, entity.getMaThe(), entity.getLoaiThe(), entity.getGiaThe(), entity.getSoLuong());
    }

    @Override
    public void update(TheNap entity) {
        JDBC.update(UPDATE_SQL, entity.getLoaiThe(), entity.getGiaThe(), entity.getSoLuong(), entity.getMaThe());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<TheNap> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public TheNap selectById(String id) {
        List<TheNap> list = selectBySql(SELECT_BY_ID, id);
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<TheNap> selectBySql(String sql, Object... args) {
        List<TheNap> list = new ArrayList<>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()){ //int string double double
                TheNap tn = new TheNap();
                tn.setMaThe(rs.getInt("MaThe"));
                tn.setLoaiThe(rs.getString("LoaiThe"));
                tn.setGiaThe(rs.getDouble("GiaThe"));
                tn.setSoLuong(rs.getDouble("SoLuong"));
                list.add(tn);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
}
