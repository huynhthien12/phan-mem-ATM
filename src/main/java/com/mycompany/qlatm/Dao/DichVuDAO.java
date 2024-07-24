/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Dao;

import com.mycompany.qlatm.Entify.DichVu;
import com.mycompany.qlatm.Until.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author GIGABYTE
 */
public class DichVuDAO extends ATMDao<DichVu,String>{
    final String INSERT_SQL = "insert into DichVu(TenDichVu,GiaTien) values (?,?)";
    final String UPDATE_SQL="update DichVu set GiaTien=? where TenDichVu = ?";
    final String Delete_SQL="delete from DichVu where TenDichVu =?" ;
    final String SELECT_ALL_SQL="select * from DichVu";
    final String SELECT_BY_ID_SQL="select * from DichVu where TenDichVu =?";


    @Override
    public void insert(DichVu entity) {
        JdbcHelper.update(INSERT_SQL, entity.getTenDichVu(), entity.getGiaTien());
    }

    @Override
    public void update(DichVu entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getGiaTien(), entity.getTenDichVu());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(Delete_SQL, id);
    }

    @Override
    public List<DichVu> selectAll() {
         return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DichVu selectById(String id) {
        List<DichVu> list = selectBySql(SELECT_BY_ID_SQL, id);
            if(list.isEmpty()){
                return null;
            }
            return list.get(0);
    }

    @Override
    public List<DichVu> selectBySql(String sql, Object... args) {
         List<DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                DichVu entity = new DichVu();
                entity.setTenDichVu(rs.getString("TenDichVu"));
                entity.setGiaTien(rs.getFloat("GiaTien"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    
    }
    
}
