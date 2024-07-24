/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Dao;

import com.mycompany.qlatm.Entify.NguoiDung;
import com.mycompany.qlatm.Until.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author GIGABYTE
 */
public class NguoiDungDAO extends ATMDao<NguoiDung, String> {

//    final String INSERT_SQL = "insert into TaiKhoan(SoTaiKhoan,MatKhau,LoaiTaiKhoan) values (?,?,?);insert into NguoiDung(TenNguoiDung, MaPin,SoTaiKhoan,CCCD,SoDu,LienHe) values (?,?,?,?,?,?)";
        final String INSERT_SQL = "insert into NguoiDung(TenNguoiDung, MaPin,SoTaiKhoan,CCCD,SoDu,LienHe) values (?,?,?,?,?,?)";
    final String UPDATE_SQL = "update NguoiDung set MaPin=? where SoTaiKhoan = ?;";
    final String Delete_SQL = "delete from NguoiDung where SoTaiKhoan=?;delete from TaiKhoan where SoTaiKhoan=?";
    final String SELECT_ALL_SQL = "select * from NguoiDung";
    final String SELECT_BY_ID_SQL = "select * from NguoiDung where SoTaiKhoan =?;";

    @Override
    public void insert(NguoiDung entity) {
        JdbcHelper.update(INSERT_SQL, entity.getTenND(), entity.getPin(),entity.getStk(), entity.getCCCD(), entity.getSodu(), entity.getLienHe());
    }

    @Override
    public void update(NguoiDung entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getPin(), entity.getStk());

    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(Delete_SQL, id);

    }

    @Override
    public List<NguoiDung> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiDung selectById(String id) {
         List<NguoiDung> list = selectBySql(SELECT_BY_ID_SQL, id);
            if(list.isEmpty()){
                return null;
            }
            return list.get(0);
    }

    @Override
    public List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                NguoiDung entity = new NguoiDung();
                
               entity.setTenND(rs.getString("TenNguoiDung"));
                entity.setPin(rs.getInt("MaPin"));
                entity.setStk(rs.getInt("SoTaiKhoan"));
                entity.setCCCD(rs.getInt("CCCD"));
                entity.setSodu(rs.getDouble("SoDu"));//sua trong sql
                entity.setLienHe(rs.getString("LienHe"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
