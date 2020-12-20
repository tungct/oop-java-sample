package model;
import model.*;

import java.io.Serializable;
import java.util.List;

public class HoaDon implements Serializable {
    private String ngayLapHoaDon;
    private Integer soHoaDon;
    private NhanVien nhanVien;
    private KhachHang khachHang;
    private List<MyPham> danhSachMyPham;
    public HoaDon(){
    }
    public HoaDon(String ngayLapHoaDon, Integer soHoaDon, NhanVien nhanVien, KhachHang khachHang,List<MyPham> danhSachMyPham){
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.soHoaDon = soHoaDon;
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
        this.danhSachMyPham = danhSachMyPham;
    }

    public void setNgayLapHoaDon(String ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public String getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setSoHoaDon(Integer soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public Integer getSoHoaDon() {
        return soHoaDon;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setDanhSachMyPham(List<MyPham> danhSachMyPham) {
        this.danhSachMyPham = danhSachMyPham;
    }

    public List<MyPham> getDanhSachMyPham() {
        return danhSachMyPham;
    }

    public Float tingTongTien(){
        Float tongTien = 0.0F;
        for (MyPham myPham: this.danhSachMyPham){
            tongTien += myPham.getSoLuong() * myPham.getDonGia();
        }
        return tongTien;
    }

    public Integer tinhSoLuong(){
        Integer soLuong = 0;
        for (MyPham myPham: this.danhSachMyPham){
            soLuong += myPham.getSoLuong();
        }
        return soLuong;
    }

    public void printHoaDon(){
        System.out.println("So hoa don: " + this.soHoaDon.toString());
        System.out.println("Ngay lap hoa don: " + this.ngayLapHoaDon.toString());
        System.out.println("Nhan vien lap hoa don: ");
        this.nhanVien.printNhanvien();
        System.out.println("Khach hang: ");
        this.khachHang.printKhachHang();
        System.out.println("Danh sach my pham: ");
        for (MyPham myPham: danhSachMyPham){
            myPham.printMyPham();
        }
        System.out.println("Tong tien thanh toan: " + this.tingTongTien().toString());
    }
}
