/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class MauSac {
    private int Idmausac;
    private String Mamau;
    private String Tenmausac;
    private boolean trangthai;

    public MauSac() {
    }

    public MauSac(int Idmausac, String Mamau, String Tenmausac, boolean trangthai) {
        this.Idmausac = Idmausac;
        this.Mamau = Mamau;
        this.Tenmausac = Tenmausac;
        this.trangthai = trangthai;
    }

    public int getIdmausac() {
        return Idmausac;
    }

    public void setIdmausac(int Idmausac) {
        this.Idmausac = Idmausac;
    }

    public String getMamau() {
        return Mamau;
    }

    public void setMamau(String Mamau) {
        this.Mamau = Mamau;
    }

    public String getTenmausac() {
        return Tenmausac;
    }

    public void setTenmausac(String Tenmausac) {
        this.Tenmausac = Tenmausac;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
