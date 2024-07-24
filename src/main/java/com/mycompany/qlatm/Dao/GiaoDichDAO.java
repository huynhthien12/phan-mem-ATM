/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Dao;

import com.mycompany.qlatm.Entify.GiaoDich;
import com.mycompany.qlatm.Until.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author GIGABYTE
 */
public class GiaoDichDAO extends ATMDao<GiaoDich,Integer>{
    final String INSERT_SQL = "insert into GiaoDich(MaGiaoDich, SoTaiKhoan, SoTaiKhoanGiaoDich, LoaiGiaoDich, SoTienGiaoDich, NgayGioGiaoDich, ThongTinChiTietGiaoDich ) values (?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update GiaoDich set LoaiGiaoDich='?' where MaGiaoDich = ?;";
    final String Delete_SQL = "delete from GiaoDich where MaGiaoDich=?";
    final String SELECT_ALL_SQL = "select * from GiaoDich";
    final String SELECT_BY_ID_SQL = "select * from GiaoDich where MaGiaoDich =?;";


    @Override
    public void insert(GiaoDich entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaGiaoDich(), entity.getSoTaiKhoan(), entity.getSoTaiKhoanGiaoDich(), entity.getLoaiGiaoDich(), entity.getSoTienGiaoDich(), entity.getNgayGioGiaoDich(), entity.getThongTinChiTietGiaoDich());
    }

    @Override
    public void update(GiaoDich entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getLoaiGiaoDich(), entity.getMaGiaoDich());
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(Delete_SQL, id);
    }

    @Override
    public List<GiaoDich> selectAll() {
         return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public GiaoDich selectById(Integer id) {
        List<GiaoDich> list = new ArrayList<>();
            if(list.isEmpty()){
                return null;
            }
            return list.get(0);
    }

    @Override
    public List<GiaoDich> selectBySql(String sql, Object... args) {
         List<GiaoDich> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                GiaoDich entity = new GiaoDich();
                entity.setMaGiaoDich(rs.getInt("MaGiaoDich"));
                entity.setSoTaiKhoan(rs.getInt("SoTaiKhoan"));
                entity.setSoTaiKhoanGiaoDich(rs.getInt("SoTaiKhoanGiaoDich"));
                entity.setLoaiGiaoDich(rs.getString("LoaiGiaoDich"));
                entity.setSoTienGiaoDich(rs.getFloat("SoTienGiaoDich"));
                entity.setNgayGioGiaoDich(rs.getDate("NgayGioGiaoDich"));
                entity.setThongTinChiTietGiaoDich(rs.getString("ThongTinChiTietGiaoDich"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    
}
