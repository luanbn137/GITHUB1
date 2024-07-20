/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
import java.sql.Date;

public class SanPhamChiTiet {
    private int idSPCT;
    private int idSanPham;
    private String tenSP;
    private int idMauSac;
    private String tenmausac;
    private int idChatLieu;
    private String tenchatlieu;
    private int idMu;
    private String moTa;
    private int soLuong;
    private double gia;
    private String nguoiTao;
    private String nguoiSua;
    private Date ngayTao;
    private Date ngaySua;
    private boolean trangThai;
    private int idSize;
    private String tensize;
    private int idLopLot;
    private String tenloplot;
    private int idKieuDang;

    // Constructors

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int idSPCT, int idSanPham, String tenSP, int idMauSac, String tenmausac, int idChatLieu, String tenchatlieu, int idMu, String moTa, int soLuong, double gia, String nguoiTao, String nguoiSua, Date ngayTao, Date ngaySua, boolean trangThai, int idSize, String tensize, int idLopLot, String tenloplot, int idKieuDang) {
        this.idSPCT = idSPCT;
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.idMauSac = idMauSac;
        this.tenmausac = tenmausac;
        this.idChatLieu = idChatLieu;
        this.tenchatlieu = tenchatlieu;
        this.idMu = idMu;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.gia = gia;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
        this.idSize = idSize;
        this.tensize = tensize;
        this.idLopLot = idLopLot;
        this.tenloplot = tenloplot;
        this.idKieuDang = idKieuDang;
    }

    public int getIdSPCT() {
        return idSPCT;
    }

    public void setIdSPCT(int idSPCT) {
        this.idSPCT = idSPCT;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getTenmausac() {
        return tenmausac;
    }

    public void setTenmausac(String tenmausac) {
        this.tenmausac = tenmausac;
    }

    public int getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(int idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    public String getTenchatlieu() {
        return tenchatlieu;
    }

    public void setTenchatlieu(String tenchatlieu) {
        this.tenchatlieu = tenchatlieu;
    }

    public int getIdMu() {
        return idMu;
    }

    public void setIdMu(int idMu) {
        this.idMu = idMu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public String getTensize() {
        return tensize;
    }

    public void setTensize(String tensize) {
        this.tensize = tensize;
    }

    public int getIdLopLot() {
        return idLopLot;
    }

    public void setIdLopLot(int idLopLot) {
        this.idLopLot = idLopLot;
    }

    public String getTenloplot() {
        return tenloplot;
    }

    public void setTenloplot(String tenloplot) {
        this.tenloplot = tenloplot;
    }

    public int getIdKieuDang() {
        return idKieuDang;
    }

    public void setIdKieuDang(int idKieuDang) {
        this.idKieuDang = idKieuDang;
    }

    
}
