package model;

import java.io.Serializable;

public class MyPham implements Serializable {
    private String tenMyPham;
    private String nuocSanXuat;
    private Integer soLuong;
    private Float donGia;
    public MyPham(){
    }
    public MyPham(String tenMyPham, String nuocSanXuat, Integer soLuong, Float donGia){
        this.tenMyPham = tenMyPham;
        this.nuocSanXuat = nuocSanXuat;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void setTenMyPham(String tenMyPham) {
        this.tenMyPham = tenMyPham;
    }

    public String getTenMyPham() {
        return tenMyPham;
    }

    public void setNuocSanXuat(String nuocSanXuat) {
        this.nuocSanXuat = nuocSanXuat;
    }

    public String getNuocSanXuat() {
        return nuocSanXuat;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void printMyPham(){
        System.out.println("My pham: " + this.tenMyPham.toString());
        System.out.println("Nuoc san xuat: " + this.nuocSanXuat.toString());
        System.out.println("So luong: " + this.soLuong.toString());
        System.out.println("Don gia: " + this.donGia.toString());
    }
}
