package model;

import java.io.Serializable;

public class KhachHang implements Serializable {
    private String dienThoai;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;

    public KhachHang(){
    }

    public KhachHang(String dienThoai, String hoTen, String ngaySinh, String diaChi, String maSoThue){
        this.dienThoai = dienThoai;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void printKhachHang(){
        System.out.println("Ho ten: " + this.hoTen.toString());
        System.out.println("So dien thoai: "  + this.dienThoai.toString());
        System.out.println("Dia chi: " + this.diaChi.toString());
    }
}
