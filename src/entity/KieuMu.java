/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class KieuMu {
    private int Idkieumu;
    private String Makieumu;
    private String tenkieumu;
    private boolean trangthai;

    public KieuMu() {
    }

    public KieuMu(int Idkieumu, String Makieumu, String tenkieumu, boolean trangthai) {
        this.Idkieumu = Idkieumu;
        this.Makieumu = Makieumu;
        this.tenkieumu = tenkieumu;
        this.trangthai = trangthai;
    }

    public int getIdkieumu() {
        return Idkieumu;
    }

    public void setIdkieumu(int Idkieumu) {
        this.Idkieumu = Idkieumu;
    }

    public String getMakieumu() {
        return Makieumu;
    }

    public void setMakieumu(String Makieumu) {
        this.Makieumu = Makieumu;
    }

    public String getTenkieumu() {
        return tenkieumu;
    }

    public void setTenkieumu(String tenkieumu) {
        this.tenkieumu = tenkieumu;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
   
}
