/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Dao;

import com.mycompany.qlatm.Entify.PhanHoi;
import com.mycompany.qlatm.Until.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author GIGABYTE
 */
public class PhanHoiDAO extends ATMDao<PhanHoi, Integer> {

    final String INSERT_SQL = "insert into PhanHoi(SoTaiKhoan, NoiDung) values (?,?)";
    final String UPDATE_SQL = "update PhanHoi set NoiDung='?' where SoTaiKhoan = ?";
    final String Delete_SQL = "delete from PhanHoi  where SoTaiKhoan=?";
    final String SELECT_ALL_SQL = "select * from PhanHoi";
    final String SELECT_BY_ID_SQL = "select * from PhanHoi where SoTaiKhoan =?";

    @Override
    public void insert(PhanHoi entity) {
        JdbcHelper.update(INSERT_SQL, entity.getSoTaiKhoan(), entity.getNoiDung());
    }

    @Override
    public void update(PhanHoi entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getNoiDung(), entity.getSoTaiKhoan());
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(Delete_SQL, id);
    }

    @Override
    public List<PhanHoi> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public PhanHoi selectById(Integer id) {
        List<PhanHoi> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<PhanHoi> selectBySql(String sql, Object... args) {
        List<PhanHoi> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                PhanHoi entity = new PhanHoi();
                entity.setSoTaiKhoan(rs.getByte("SoTaiKhoan"));
                entity.setNoiDung(rs.getString("NoiDung"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
