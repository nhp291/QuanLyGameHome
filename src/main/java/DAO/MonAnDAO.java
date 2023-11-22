/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.MonAn;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MonAnDAO extends DinoGaming<MonAn, String>{
    final String INSERT_SQL = "INSERT INTO MonAn VALUES (?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE MonAn SET TenMA = ?, SoLuongMA = ?, GiaMA = ? WHERE MaMA = ?";
    final String DELETE_SQL = "DELETE FROM MonAn WHERE MaMA = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM MonAn";
    final String SELECT_BY_ID = "SELECT * FROM MonAn WHERE MaMA = ?";
    
    @Override
    public void insert(MonAn entity) {
        JDBC.update(INSERT_SQL, entity.getMaMA(), entity.getTenMA(), entity.getSoLuongMA(), entity.getGiaMA());
    }

    @Override
    public void update(MonAn entity) {
        JDBC.update(UPDATE_SQL, entity.getTenMA(), entity.getSoLuongMA(), entity.getGiaMA(), entity.getMaMA());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<MonAn> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MonAn selectById(String id) {
        List<MonAn> list = selectBySql(SELECT_BY_ID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<MonAn> selectBySql(String sql, Object... args) {
        List<MonAn> list = new ArrayList<>(); //int string int double
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                MonAn ma = new MonAn();
                ma.setMaMA(rs.getInt("MaMA"));
                ma.setTenMA(rs.getString("TenMA"));
                ma.setSoLuongMA(rs.getInt("SoLuongMA"));
                ma.setGiaMA(rs.getDouble("GiaMA"));
                list.add(ma);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
}
