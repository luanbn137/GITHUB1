/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class ChatLieu {
    private int idchatlieu;
    private String tenchatlieu;
    private String machatlieu;
    private boolean trangthai;

    public ChatLieu() {
    }

    public ChatLieu(int idchatlieu, String tenchatlieu, String machatlieu, boolean trangthai) {
        this.idchatlieu = idchatlieu;
        this.tenchatlieu = tenchatlieu;
        this.machatlieu = machatlieu;
        this.trangthai = trangthai;
    }

    public int getIdchatlieu() {
        return idchatlieu;
    }

    public void setIdchatlieu(int idchatlieu) {
        this.idchatlieu = idchatlieu;
    }

    public String getTenchatlieu() {
        return tenchatlieu;
    }

    public void setTenchatlieu(String tenchatlieu) {
        this.tenchatlieu = tenchatlieu;
    }

    public String getMachatlieu() {
        return machatlieu;
    }

    public void setMachatlieu(String machatlieu) {
        this.machatlieu = machatlieu;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
