/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.SanPhamChiTiet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author admin
 */
public class SPCTRepository {

   
    
    public List<SanPhamChiTiet> SELECT_T1_search(String input) throws SQLException {
        String SELECT_T1_search = "SELECT SANPHAM.IDSANPHAM, SANPHAM.TENSP, SANPHAMCHITIET.MOTA, SANPHAMCHITIET.GIA, SANPHAMCHITIET.SOLUONG, SANPHAMCHITIET.IDSIZE, SANPHAMCHITIET.IDMAUSAC, SANPHAMCHITIET.IDLOPLOT, SANPHAMCHITIET.IDCHATLIEU FROM SANPHAMCHITIET \n"
            + "            JOIN SANPHAM ON SANPHAMCHITIET.IDSANPHAM = SANPHAM.IDSANPHAM \n"
            + "             WHERE SANPHAMCHITIET.IDSANPHAM LIKE ?\n"
            + "            OR SANPHAMCHITIET.GIA LIKE ? \n"
            + "            OR SANPHAMCHITIET.SOLUONG LIKE  ?\n"
            + "            OR SANPHAMCHITIET.SIZE LIKE ? \n"
            + "            OR SANPHAM.TENSP LIKE ?\n"
            + "            AND TRANGTHAI = ? ";
        return this.getAllSPCT(SELECT_T1_search, "%" + input + "%", "%" + input + "%", "%" + input + "%", "%" + input + "%", "%" + input + "%", "Hoạt động");
    }
        public List<SanPhamChiTiet> selectHD() throws SQLException {
//            String sql = "SELECT SANPHAM.IDSANPHAM, SANPHAM.TENSP,SANPHAMCHITIET.MOTA, SANPHAMCHITIET.GIA, SANPHAMCHITIET.SOLUONG, SANPHAMCHITIET.IDSIZE, SANPHAMCHITIET.IDMAUSAC, SANPHAMCHITIET.IDLOPLOT, SANPHAMCHITIET.IDCHATLIEU FROM SANPHAMCHITIET \n"
//                + "            JOIN SANPHAM ON SANPHAMCHITIET.IDSANPHAM = SANPHAM.IDSANPHAM \n";
            String sql = "SELECT SANPHAM.TENSP, *\n" +
                    "FROM SANPHAMCHITIET \n"  +
                    "JOIN SANPHAM on SANPHAMCHITIET.IDSANPHAM = SANPHAM.IDSANPHAM";
            return this.getAllSPCT(sql);
        }
    
//        public List<SanPhamChiTiet> selectKHD() {
//        String sql = "SELECT SANPHAM.IDSANPHAM, SANPHAM.TENSP, MOTA, GIA, SOLUONG, LOAI, SIZE, TRANGTHAI FROM SANPHAMCHITIET \n"
//            + "            JOIN SANPHAM ON SANPHAMCHITIET.IDSANPHAM = SANPHAM.IDSANPHAM \n";
//            
//        return this.getAllSPCT(sql);
//    }
//    public void InsertHD(SanPhamChiTiet entity){
//          String INSERT_SQL_SP = "INSERT INTO SANPHAMCHITIET(IDSANPHAM, TENSP) VALUES (?, ?)";
//          String idsp = String.valueOf(entity.getIdSanPham());
//        DBConnect.executeUpdate(INSERT_SQL_SP, idsp,entity.getTenSP());
//    }
    public void InsertTTSP(SanPhamChiTiet entity) {
        String INSERT_SQL_TTSP = "INSERT INTO SANPHAMCHITIET(IDSANPHAM,IDMAUSAC,IDCHATLIEU, IDMU, MOTA, SOLUONG, GIA, IDSIZE, IDLOPLOT,IDKIEUDANG, TRANGTHAI) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
        DBConnect.executeUpdate(INSERT_SQL_TTSP, entity.getIdSanPham(),
                entity.getIdMauSac(), entity.getIdChatLieu(), entity.getIdMu(),
                entity.getMoTa(), entity.getSoLuong(), entity.getGia(), entity.getIdSize(), entity.getIdLopLot(),entity.getIdKieuDang(), entity.isTrangThai());
    }
     public void UpdateSP(SanPhamChiTiet entity) {
        String UPDATE_SQL_TTSP = "UPDATE SANPHAMCHITIET SET IDSANPHAM=? ,IDMAUSAC=?,IDCHATLIEU =? , MOTA =?, SOLUONG=?, GIA=?, IDSIZE=?, IDLOPLOT=?,IDKIEUDANG=?, TRANGTHAI=?";
        DBConnect.executeUpdate(UPDATE_SQL_TTSP, entity.getIdSanPham(),
                entity.getIdMauSac(), entity.getIdChatLieu(), entity.getIdMu(),
                entity.getMoTa(), entity.getSoLuong(), entity.getGia(), entity.getIdSize(), entity.getIdLopLot(),entity.getIdKieuDang(), entity.isTrangThai());
    }   
    
      public void UpdateKHD(SanPhamChiTiet entity) {
        String sql = "UPDATE SANPHAMCHITIET SET TRANGTHAI = N'0' WHERE IDSPCT = ?";
          DBConnect.executeUpdate(sql, entity.getIdSPCT()
        );
    }
      public void UpdateHD(SanPhamChiTiet entity) {
        String sql = "UPDATE SANPHAMCHITIET SET TRANGTHAI = N'1' WHERE IDSPCT = ?";
        DBConnect.executeUpdate(sql, entity.getIdSPCT()
        );
    }
      public void SoftDelete(SanPhamChiTiet entity) {
        String UPDATE_SQL_STATUS = "UPDATE SANPHAMCHITIET SET TRANGTHAI = ? WHERE IDSPCT = ?";
        DBConnect.executeUpdate(UPDATE_SQL_STATUS, entity.isTrangThai(), entity.getIdSPCT());
    }
     public List<SanPhamChiTiet> selectAll() throws SQLException {
        String SELECT_ALL_SQL = "SELECT sp.IDSANPHAM, sp.TENSP, ms.TENMAU, cl.TENCHATLIEU, ll.TENLOPLOT, spct.SOLUONG, s.TENSIZE, spct.MOTA, spct.GIA \n" +
"FROM SANPHAM sp \n" +
"JOIN SANPHAMCHITIET spct ON sp.IDSANPHAM = spct.IDSANPHAM\n" +
"LEFT JOIN MAUSAC ms ON spct.IDMAUSAC = ms.IDMAUSAC\n" +
"LEFT JOIN CHATLIEU cl ON spct.IDCHATLIEU = cl.IDCHATLIEU\n" +
"LEFT JOIN SIZE s ON spct.IDSIZE = s.IDSIZE\n" +
"LEFT JOIN LOPLOT ll ON spct.IDLOPLOT = ll.IDLOPLOT;";
        return this.getAllSPCT(SELECT_ALL_SQL);
    }
     public SanPhamChiTiet selectByID(String key) throws SQLException {
        String SELECT_BY_ID_SQL = "SELECT sp.IDSANPHAM, sp.TENSP, ms.TENMAU, cl.TENCHATLIEU, ll.TENLOPLOT, spct.SOLUONG, s.TENSIZE, spct.MOTA, spct.GIA \n" +
    "FROM SANPHAM sp \n" +
    "JOIN SANPHAMCHITIET spct ON sp.IDSANPHAM = spct.IDSANPHAM\n" +
    "LEFT JOIN MAUSAC ms ON spct.IDMAUSAC = ms.IDMAUSAC\n" +
    "LEFT JOIN CHATLIEU cl ON spct.IDCHATLIEU = cl.IDCHATLIEU\n" +
    "LEFT JOIN SIZE s ON spct.IDSIZE = s.IDSIZE\n" +
    "LEFT JOIN LOPLOT ll ON spct.IDLOPLOT = ll.IDLOPLOT "
                + "WHERE sp.IDSANPHAM = ?";
        List<SanPhamChiTiet> lst = this.getAllSPCT(SELECT_BY_ID_SQL, key);
        if (lst.isEmpty()) {
            return null;
        }
        return lst.get(0);
    }
      public List<SanPhamChiTiet> selectbyIDSP(String key) {
        String selectMASP = "SELECT IDSANPHAM FROM SAPHAMCHITIET";
        try {
            List<SanPhamChiTiet> lst = new ArrayList<>();
            try (Connection conn = DBConnect.getConnection(); PreparedStatement pds = conn.prepareStatement(selectMASP)) {
                ResultSet rs = pds.executeQuery();
                while (rs.next()) {
                    SanPhamChiTiet spct = new SanPhamChiTiet();
                    spct.setIdSanPham(rs.getInt("IDSANPHAM"));
                    lst.add(spct);
                }
                return lst;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     
    public List<SanPhamChiTiet> getAllSPCT(String sql, Object... args) throws SQLException {
    List<SanPhamChiTiet> list = new ArrayList<>();
    
//    String sql = "SELECT SANPHAM.TENSP, *\n" +
//                    "FROM SANPHAMCHITIET \n"  +
//                    "JOIN SANPHAM on SANPHAMCHITIET.IDSANPHAM = SANPHAM.IDSANPHAM";
    try (Connection conn = DBConnect.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
   
       try( ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            SanPhamChiTiet spct = new SanPhamChiTiet();
//            spct.setIdSPCT(rs.getInt("IDSPCT"));
            spct.setIdSanPham(rs.getInt("IDSANPHAM"));
//            spct.setIdMauSac(rs.getInt("IDMAUSAC"));
//            spct.setIdChatLieu(rs.getInt("IDCHATLIEU"));
//            spct.setIdMu(rs.getInt("IDMU"));
            spct.setMoTa(rs.getString("MOTA"));
            spct.setSoLuong(rs.getInt("SOLUONG"));
            spct.setGia(rs.getDouble("GIA"));
//            spct.setNguoiTao(rs.getString("NGUOITAO"));
//            spct.setNguoiSua(rs.getString("NGUOISUA"));
//            spct.setNgayTao(rs.getDate("NGAYTAO"));
//            spct.setNgaySua(rs.getDate("NGAYSUA"));
//            spct.setTrangThai(rs.getBoolean("TRANGTHAI"));
//            spct.setIdSize(rs.getInt("IDSIZE"));
//            spct.setIdLopLot(rs.getInt("IDLOPLOT"));
//            spct.setIdKieuDang(rs.getInt("IDKIEUDANG"));
            spct.setTenSP(rs.getString("TENSP"));
            spct.setTenmausac(rs.getString("TENMAU"));
            spct.setTensize(rs.getString("TENSIZE"));
            spct.setTenchatlieu(rs.getString("TENCHATLIEU"));
            spct.setTenloplot(rs.getString("TENLOPLOT"));
            list.add(spct);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}
    }
}
  

  

