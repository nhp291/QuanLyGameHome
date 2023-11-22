/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.MaySuDung;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MaySuDungDAO extends DinoGaming<MaySuDung, String> {
    final String INSERT_SQL = "INSERT INTO MaySuDung VALUES (?, ?, ?, ?, ?)"; 
//    private String MaMay;
//    private Date GioBatDau;
//    private double GiaMay;
//    private String MaNV;
//    private String MaKH;
    final String UPDATE_SQL = "UPDATE MaySuDung SET GioBatDau = ?, GiaMay = ?, MaNV = ?, MaKH = ? WHERE MaMay = ?;";
    final String DELETE_SQL = "DELETE FROM MaySuDung WHERE MaMay = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM MaySuDung";
    final String SELECT_BY_ID = "SELECT * FROM MaySuDung WHERE MaMay = ?";
    
    @Override
    public void insert(MaySuDung entity) {
        JDBC.update(INSERT_SQL, entity.getMaMay(), entity.getGioBatDau(), entity.getGiaMay(), entity.getMaNV(), entity.getMaKH());
    }

    @Override
    public void update(MaySuDung entity) {
        JDBC.update(UPDATE_SQL, entity.getGioBatDau(), entity.getGiaMay(), entity.getMaNV(), entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<MaySuDung> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MaySuDung selectById(String id) {
        List<MaySuDung> list = selectBySql(SELECT_BY_ID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

//    private String MaMay;
//    private Date GioBatDau;
//    private double GiaMay;
//    private String MaNV;
//    private String MaKH;
    
    @Override
    public List<MaySuDung> selectBySql(String sql, Object... args) {
        List<MaySuDung> list = new ArrayList<>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                MaySuDung sd = new MaySuDung();
                sd.setMaMay(rs.getString("MaMay"));
                sd.setGioBatDau(rs.getDate("GioBatDau"));
                sd.setGiaMay(rs.getDouble("GiaMay"));
                sd.setMaNV(rs.getString("MaNV"));
                sd.setMaKH(rs.getString("MaKH"));
                list.add(sd);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
}
