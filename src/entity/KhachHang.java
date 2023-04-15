/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author My PC
 */
public class KhachHang {
    private String maKH, tenKH, diaChi, soDT;
    
    public KhachHang(){
        
    }
    public KhachHang(String maKH){
        this.maKH = maKH;
    }

    public KhachHang(String maKH, String tenKH, String diaChi, String soDT) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.maKH);
        hash = 13 * hash + Objects.hashCode(this.tenKH);
        hash = 13 * hash + Objects.hashCode(this.diaChi);
        hash = 13 * hash + Objects.hashCode(this.soDT);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KhachHang other = (KhachHang) obj;
        return true;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", soDT=" + soDT + '}';
    }  
}

