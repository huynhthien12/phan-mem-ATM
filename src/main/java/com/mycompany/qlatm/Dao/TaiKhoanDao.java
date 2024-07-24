/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Dao;

import com.mycompany.qlatm.Entify.TaiKhoan;
import com.mycompany.qlatm.Until.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class TaiKhoanDao extends ATMDao<TaiKhoan, Integer>{
    
    final String INSERT_SQL="insert into TaiKhoan (SoTaiKhoan,MatKhau,LoaiTaiKhoan) values (?,?,?)";
    final String UPDATE_SQL="update TaiKhoan set MatKhau = ?, LoaiTaiKhoan= ? where SoTaiKhoan = ?";
    final String DELETE_SQL="DELETE from TaiKhoan WHERE SoTaiKhoan = ?";
    final String SELECT_ALL_SQL="select * from  TaiKhoan"; 
    final String SELECT_BY_ID_SQL="select * from  TaiKhoan where SoTaiKhoan=?";
    @Override
    public void insert(TaiKhoan entity) {
        JdbcHelper.update(INSERT_SQL, entity.getSoTaiKhoan(), entity.getMatKhau(),entity.isLoaiTaiKhoan());
    }

    @Override
    public void update(TaiKhoan entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMatKhau(), entity.isLoaiTaiKhoan(), entity.getSoTaiKhoan());
    }

    @Override
    public void delete(Integer id) {
       JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<TaiKhoan> selectAll() {
        return selectBySql(SELECT_ALL_SQL); 
    }

    @Override
    public TaiKhoan selectById(Integer id) {
      List<TaiKhoan> list = selectBySql(SELECT_BY_ID_SQL, id); 
      if(list.isEmpty()){
          return null;
      }
      return list.get(0);
    }

    @Override
    public List<TaiKhoan> selectBySql(String sql, Object... args) {
      List<TaiKhoan> list = new ArrayList<>(); 
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                TaiKhoan entity = new TaiKhoan(); 
                entity.setSoTaiKhoan(rs.getInt("SoTaiKhoan"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setLoaiTaiKhoan(rs.getBoolean("LoaiTaiKhoan"));
                list.add(entity); 
            }
        } catch (Exception e) {
            throw  new RuntimeException(e); 
        }
        return list;
    }

   

   
    
}
