/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.ChatLieu;
import entity.LopLot;
import entity.MauSac;
import entity.Size;
import entity.TrangThai;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author admin
 */
public class LSHT {
    public List<ChatLieu> selectchatlieuHD() {
        String sql = "SELECT * FROM CHATLIEU WHERE TRANGTHAI = N'1'";
        return this.selectbySQLchatlieu(sql);
    }
    public List<ChatLieu> selectchatlieuKHD() {
        String sql = "SELECT * FROM CHATLIEU WHERE TRANGTHAI = N'0'";
        return this.selectbySQLchatlieu(sql);
    }
    public void insert(ChatLieu entity) {
        String sql = "INSERT LOAI(LOAI, TRANGTHAI) VALUES (?, ?)";
        DBConnect.executeUpdate(sql, entity.getTenchatlieu(), entity.isTrangthai());
    }
    public void updateHD(ChatLieu entity){
        String sql = "UPDATE TENCHATLIEU SET TRANGTHAI = '1'";
        DBConnect.executeUpdate(sql, entity.getTenchatlieu());
    }
    public void updateKHD(ChatLieu entity){
        String sql = "UPDATE TENCHATLIEU SET TRANGTHAI = '0'";
        DBConnect.executeUpdate(sql, entity.getTenchatlieu());
    }
    
    public List<ChatLieu> getAllChatLieuHD() {
        String SQL_SELECT_ALL_HD = "SELECT * FROM CHATLIEU WHERE TRANGTHAI = N'1'";
        try {
            List<ChatLieu> lst = new ArrayList<>();
            try (Connection conn = DBConnect.getConnection(); PreparedStatement pds = conn.prepareStatement(SQL_SELECT_ALL_HD)) {
                ResultSet rs = pds.executeQuery();
                while (rs.next()) {
                    lst.add(new ChatLieu(
                            Integer.parseInt(rs.getString("IDCHATLIEU")),
                            rs.getString("MACHATLIEU"),
                            rs.getString("TENCHATLIEU"), 
                            rs.getBoolean("TRANGTHAI")));
                }
                return lst;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    protected List<ChatLieu> selectbySQLchatlieu(String sql, Object... args){
        List<ChatLieu> list = new ArrayList<>();
        try (Connection conn = DBConnect.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()){
            while (rs.next()) {                
                ChatLieu cl = new ChatLieu();
                cl.setIdchatlieu(Integer.valueOf(rs.getString("Idchatlieu")));
                cl.setTenchatlieu(rs.getString("Tenchatlieu"));
                cl.setTrangthai(Boolean.getBoolean(rs.getString("TrangThai")));
                list.add(cl);
  
            }
        } catch (Exception e) {
            
        }
        return list;
    }
    
    
    public List<Size> selectSizeHD() {
        String sql = "SELECT * FROM SIZE WHERE TRANGTHAI = N'1'";
        return this.selectBySqlSize(sql);
    }

    public List<Size> selectSizeKHD() {
        String sql = "SELECT * FROM SIZE WHERE TRANGTHAI = '0";
        return this.selectBySqlSize(sql);
    }

    public void insert(Size entity) {
        String sql = "INSERT SIZE(SIZE, TRANGTHAI) VALUES (?, ?)";
        DBConnect.executeUpdate(sql, entity.getTenSize(), entity.isTrangthai());
    }

    public void updateHD(Size entity) {
        String sql = "UPDATE SIZE SET TRANGTHAI = N'1' WHERE SIZE = ?";
        DBConnect.executeUpdate(sql, entity.getTenSize());
    }

    public void updateKHD(Size entity) {
        String sql = "UPDATE SIZE SET TRANGTHAI = N'0' WHERE SIZE = ?";
        DBConnect.executeUpdate(sql, entity.getTenSize());
    }

    public List<Size> getAllSize() {
        String SQL_SELECT_ALL = "SELECT * FROM SIZE";
        try {
            List<Size> lst = new ArrayList<>();
            try (Connection conn = DBConnect.getConnection(); PreparedStatement pds = conn.prepareStatement(SQL_SELECT_ALL)) {
                ResultSet rs = pds.executeQuery();
                while (rs.next()) {
                    lst.add(new Size(
                            rs.getInt("IDSIZE"),
                            rs.getString("MASIZE"),
                            rs.getString("TENSIZE"),
                            rs.getBoolean("TRANGTHAI")));
                }
                return lst;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected List<Size> selectBySqlSize(String sql, Object... args) {
        List<Size> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.executeQuery(sql, args);
            while (rs.next()) {
                Size l = new Size();
                l.setTenSize(rs.getString("SIZE"));
                l.setTrangthai(rs.getBoolean("TRANGTHAI"));
                list.add(l);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    //Màu sắc
    public List<MauSac> selectMauSacHD() {
        String sql = "SELECT * FROM MAUSAC WHERE TRANGTHAI = N'1'";
        return this.selectBySqlMauSac(sql);
    }
//
    public List<MauSac> selectMauSacKHD() {
        String sql = "SELECT * FROM MAUSAC WHERE TRANGTHAI = N'0'";
        return this.selectBySqlMauSac(sql);
    }
//
    public void insert(MauSac entity) {
        String sql = "INSERT MAUSAC(SIZE, TRANGTHAI) VALUES (?, ?)";
        DBConnect.executeUpdate(sql, entity.getTenmausac(), entity.isTrangthai());
    }
//
    public void updateHD(MauSac entity) {
        String sql = "UPDATE MAUSAC SET TRANGTHAI = N'1' WHERE MAUSAC = ?";
        DBConnect.executeUpdate(sql, entity.getTenmausac());
    }
//
    public void updateKHD(MauSac entity) {
        String sql = "UPDATE MAUSAC SET TRANGTHAI = N'0' WHERE MAUSAC = ?";
        DBConnect.executeUpdate(sql, entity.getMamau());
    }
//
    public List<MauSac> getAllMauSac() {
        String SQL_SELECT_ALL = "SELECT * FROM MAUSAC";
        try {
            List<MauSac> lst = new ArrayList<>();
            try (Connection conn = DBConnect.getConnection(); PreparedStatement pds = conn.prepareStatement(SQL_SELECT_ALL)) {
                ResultSet rs = pds.executeQuery();
                while (rs.next()) {
                    lst.add(new MauSac(
                            rs.getInt("IDMAUSAC"),
                            rs.getString("MAMAU"),
                            rs.getString("TENMAU"),
                            rs.getBoolean("TRANGTHAI")));
                }
                return lst;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//
    protected List<MauSac> selectBySqlMauSac(String sql, Object... args) {
        List<MauSac> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.executeQuery(sql, args);
            while (rs.next()) {
                MauSac l = new MauSac();
                l.setTenmausac(rs.getString("TENMAUSAC"));
                l.setTrangthai(rs.getBoolean("TRANGTHAI"));
                list.add(l);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    public List<LopLot> selectloplotHD() {
        String sql = "SELECT * FROM LOPLOT WHERE TRANGTHAI = N'1'";
        return this.selectBySqlloplot(sql);
    }

    public List<LopLot> selectLopLotKHD() {
        String sql = "SELECT * FROM LOPLOT WHERE TRANGTHAI = N'0'";
        return this.selectBySqlloplot(sql);
    }

    public void insert(LopLot entity) {
        String sql = "INSERT LOPLOT(SIZE, TRANGTHAI) VALUES (?, ?)";
        DBConnect.executeUpdate(sql, entity.getTenloplot(), entity.isTrangthai());
    }

    public void updateHD(LopLot entity) {
        String sql = "UPDATE LOPLOT SET TRANGTHAI = N'1' WHERE MALOPLOT = ?";
        DBConnect.executeUpdate(sql, entity.getMaloplot());
    }

    public void updateKHD(LopLot entity) {
        String sql = "UPDATE LOPLOT SET TRANGTHAI = N'0' WHERE MALOPLOT = ?";
        DBConnect.executeUpdate(sql, entity.getMaloplot());
    }

    public List<LopLot> getAllLopLot() {
        String SQL_SELECT_ALL = "SELECT * FROM LOPLOT";
        try {
            List<LopLot> lst = new ArrayList<>();
            try (Connection conn = DBConnect.getConnection(); PreparedStatement pds = conn.prepareStatement(SQL_SELECT_ALL)) {
                ResultSet rs = pds.executeQuery();
                while (rs.next()) {
                    lst.add(new LopLot(
                            rs.getInt("IDLOPLOT"),
                            rs.getString("MALOPLOT"),
                            rs.getString("TENLOPLOT"), 
                            rs.getBoolean("TRANGTHAI")));
                }
                return lst;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected List<LopLot> selectBySqlloplot(String sql, Object... args) {
        List<LopLot> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.executeQuery(sql, args);
            while (rs.next()) {
                LopLot l = new LopLot();
                l.setTenloplot(rs.getString("TENLOPLOT"));
                l.setTrangthai(rs.getBoolean("TRANGTHAI"));
                list.add(l);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    //TRangThai
     public void insert(TrangThai entity) {
        String sql = "INSERT INTO TRANGTHAI(TRANGTHAI, TRANGTHAI) VALUES (?, ?)";
        DBConnect.executeUpdate(sql, entity.getTentrangthai());
    }

    public List<TrangThai> getAllTT() {
        String SQL_SELECT_ALL = "SELECT TRANGTHAI FROM TRANGTHAI WHERE TRANGTHAI = N'Hoạt động' OR TRANGTHAI = N'Không hoạt động'";
        try {
            List<TrangThai> lst = new ArrayList<>();
            try (Connection conn = DBConnect.getConnection(); PreparedStatement pds = conn.prepareStatement(SQL_SELECT_ALL)) {
                ResultSet rs = pds.executeQuery();
                while (rs.next()) {
                    lst.add(new TrangThai(rs.getString("TRANGTHAI")));
                }
                return lst;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected List<TrangThai> selectBySqlTT(String sql, Object... args) {
        List<TrangThai> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.executeQuery(sql, args);
            while (rs.next()) {
                TrangThai tt = new TrangThai();
                tt.setTentrangthai(rs.getString("TRANGTHAI"));
                list.add(tt);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    //hihi
}
