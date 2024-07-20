/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class LopLot {
    private int IDLOPLOT;
    private String Maloplot;
    private String Tenloplot;
    private boolean trangthai;

    public LopLot() {
    }

    public LopLot(int IDLOPLOT, String Maloplot, String Tenloplot, boolean trangthai) {
        this.IDLOPLOT = IDLOPLOT;
        this.Maloplot = Maloplot;
        this.Tenloplot = Tenloplot;
        this.trangthai = trangthai;
    }

    public int getIDLOPLOT() {
        return IDLOPLOT;
    }

    public void setIDLOPLOT(int IDLOPLOT) {
        this.IDLOPLOT = IDLOPLOT;
    }

    public String getMaloplot() {
        return Maloplot;
    }

    public void setMaloplot(String Maloplot) {
        this.Maloplot = Maloplot;
    }

    public String getTenloplot() {
        return Tenloplot;
    }

    public void setTenloplot(String Tenloplot) {
        this.Tenloplot = Tenloplot;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
