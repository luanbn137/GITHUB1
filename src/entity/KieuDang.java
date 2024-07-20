/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class KieuDang {
    private int Idkieudang;
    private String Makieudang;
    private String Tenkieudang;
    private boolean trangthai;

    public KieuDang() {
    }

    public KieuDang(int Idkieudang, String Makieudang, String Tenkieudang, boolean trangthai) {
        this.Idkieudang = Idkieudang;
        this.Makieudang = Makieudang;
        this.Tenkieudang = Tenkieudang;
        this.trangthai = trangthai;
    }

    public int getIdkieudang() {
        return Idkieudang;
    }

    public void setIdkieudang(int Idkieudang) {
        this.Idkieudang = Idkieudang;
    }

    public String getMakieudang() {
        return Makieudang;
    }

    public void setMakieudang(String Makieudang) {
        this.Makieudang = Makieudang;
    }

    public String getTenkieudang() {
        return Tenkieudang;
    }

    public void setTenkieudang(String Tenkieudang) {
        this.Tenkieudang = Tenkieudang;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
    
}
