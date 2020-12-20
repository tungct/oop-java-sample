package model;

import java.io.Serializable;

public class NhanVien implements Serializable {
    private String cmtnd;
    private String hoTen;
    private String ngaySinh;
    private String dienThoai;
    private Float heSoLuong;
    private Float luong;
    private Float luongCoBan;
    public NhanVien(){

    }
    public NhanVien(String cmtnd, String hoTen, String ngaySinh, String dienThoai, Float heSoLuong, Float luongCoBan){
        this.cmtnd = cmtnd;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.setLuong();
    }

    public void setCmtnd(String cmtnd) {
        this.cmtnd = cmtnd;
    }
    public String getCmtnd(){
        return this.cmtnd;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getHoTen(){
        return this.hoTen;
    }

    public void setNgaySinh (String ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    public String getNgaySinh(){
        return this.ngaySinh;
    }

    public void setDienThoai (String dienThoai){
        this.dienThoai = dienThoai;
    }
    public String getDienThoai(){
        return this.dienThoai;
    }

    public void setHeSoLuong(Float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public Float getHeSoLuong(){
        return this.heSoLuong;
    }

    public void setLuong(){
        this.luong = this.heSoLuong * this.luongCoBan;
    }
    public Float getLuongCoBan(){
        return this.luongCoBan;
    }

    public void setLuongCoBan(Float luongCoBan){
        this.luongCoBan = luongCoBan;
    }
    public Float getLuongCoban(){
        return this.luongCoBan;
    }

    public void printNhanvien(){
        System.out.println("CMTND: " + this.cmtnd.toString());
        System.out.println("Ho Ten: " + this.hoTen.toString());
        System.out.println("Dien thoai: " + this.dienThoai.toString());
    }
}

