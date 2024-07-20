/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class Size {
    private int Idsize;
    private String Masize;
    private String TenSize;
    private boolean trangthai;

    public Size() {
    }

    public Size(int Idsize, String Masize, String TenSize, boolean trangthai) {
        this.Idsize = Idsize;
        this.Masize = Masize;
        this.TenSize = TenSize;
        this.trangthai = trangthai;
    }

    public int getIdsize() {
        return Idsize;
    }

    public void setIdsize(int Idsize) {
        this.Idsize = Idsize;
    }

    public String getMasize() {
        return Masize;
    }

    public void setMasize(String Masize) {
        this.Masize = Masize;
    }

    public String getTenSize() {
        return TenSize;
    }

    public void setTenSize(String TenSize) {
        this.TenSize = TenSize;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
