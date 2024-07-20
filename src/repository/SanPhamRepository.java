/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Dat
 */
public class SanPhamRepository {
    
    public List<SanPham> getAll(){
        List<SanPham> lists = new ArrayList<>();
        String sql = "select IDSANPHAM ,MASP, TENSP, TRANGTHAI from SANPHAM";
        try(Connection con = DBConnect.getConnection();
                PreparedStatement pstm = con.prepareStatement(sql)) {
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                lists.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
    
    public SanPham getSanPhamByMa(String ma){
        String sql = "select IDSANPHAM, MASP, TENSANPHAM, TRANGTHAI"
                + "from SANPHAM"
                + "WHERE MASP = ?";
        try(Connection con = DBConnect.getConnection();
                PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setObject(1, ma);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                return new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean add(SanPham sp){
        int check = 0;
        String sql = "insert into SANPHAM(MASP, TENSANPHAM, TRANGTHAI) "
                + "values(?, ?, ?)";
        try(Connection con = DBConnect.getConnection();
                PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setObject(1, sp.getMaSP());
            pstm.setObject(2, sp.getTenSP());
            pstm.setObject(3, sp.getTrangThai());
            check = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    
     
}
