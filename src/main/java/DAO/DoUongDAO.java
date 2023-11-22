/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.DoUong;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoUongDAO extends DinoGaming<DoUong, String>{
    final String INSERT_SQL = "INSERT INTO DoUong VALUES (?, ?, ?)";
    final String UPDATE_SQL = "UPDATE DoUong SET TenDU = ?, SoLuongDU = ?, GiaDU = ?";
    final String DELETE_SQL = "DELETE FROM DoUong WHERE MaDU = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM DoUong";
    final String SELECT_BY_ID = "SELECT * FROM DoUong WHERE MaDU = ?";
    @Override
    public void insert(DoUong entity) {
        JDBC.update(INSERT_SQL, entity.getTenDU(), entity.getSoLuongDU(), entity.getGiaDU());
    }

    @Override
    public void update(DoUong entity) {
        JDBC.update(UPDATE_SQL, entity.getTenDU(), entity.getSoLuongDU(), entity.getGiaDU());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<DoUong> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DoUong selectById(String id) {
        List<DoUong> list = selectBySql(SELECT_BY_ID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DoUong> selectBySql(String sql, Object... args) {
        List<DoUong> list = new ArrayList<>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                DoUong du = new DoUong();
                du.setMaDU(rs.getInt("MaDU"));
                du.setTenDU(rs.getString("TenDU"));
                du.setSoLuongDU(rs.getInt("SoLuongDU"));
                du.setGiaDU(rs.getDouble("GiaDU"));
                list.add(du);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        return list;
    }
    
}
