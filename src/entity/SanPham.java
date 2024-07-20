/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Dat
 */
public class SanPham {
    
    private Integer id;
    private String maSP;
    private String tenSP;
    private Integer trangThai;

    public SanPham() {
    }

    public SanPham(Integer id, String maSP, String tenSP, Integer trangThai) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", maSP=" + maSP + ", tenSP=" + tenSP + ", trangThai=" + trangThai + '}';
    }
    
    
    
}
