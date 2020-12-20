package utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;

public class InputUtils {
    public KhachHang inputKhachHang(Scanner scanner){
        System.out.println("Nhap thong tin khach hang: \n");
        System.out.println("dien Thoai:");
        String dienThoai = scanner.nextLine();
        System.out.println("ho Ten:");
        String hoTen = scanner.nextLine();
        System.out.println("ngay Sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("dia Chi:");
        String diaChi = scanner.nextLine();
        System.out.println("ma So Thue:");
        String maSoThue = scanner.nextLine();
        KhachHang khachHang = new KhachHang(dienThoai, hoTen, ngaySinh, diaChi, maSoThue);

        return khachHang;
    }

    public NhanVien inputNhanVien(Scanner scanner){
        System.out.println("Nhap thong tin nhan vien: \n");
        System.out.println("cmtnd:");
        String cmtnd = scanner.nextLine();
        System.out.println("ho Ten:");
        String hoTen = scanner.nextLine();
        System.out.println("ngay Sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("dien thoai:");
        String dienThoai = scanner.nextLine();
        System.out.println("he so luong:");
        Float heSoLuong = Float.parseFloat(scanner.nextLine());
        System.out.println("luong co ban:");
        Float luongCoBan = Float.parseFloat(scanner.nextLine());
        NhanVien nhanVien = new NhanVien(cmtnd, hoTen, ngaySinh, dienThoai, heSoLuong, luongCoBan);

        return nhanVien;
    }

    public MyPham inputMyPham(Scanner scanner){
        System.out.println("Nhap thong tin my pham: \n");
        System.out.println("Ten my pham:");
        String tenMyPham = scanner.nextLine();
        System.out.println("Nuoc san xuat:");
        String nuocSanXuat = scanner.nextLine();
        System.out.println("Soo luong:");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Don gia:");
        float donGia = Float.parseFloat(scanner.nextLine());
        MyPham myPham = new MyPham(tenMyPham, nuocSanXuat, soLuong, donGia);
        return myPham;
    }

    public HoaDon inputHoaDon(Scanner scanner){
        System.out.println("Nhap thong tin don hang: \n");
        System.out.println("ngay lap hoa don:");
        String ngayLapHoaDon = scanner.nextLine();
        System.out.println("So hoa don:");
        Integer soHoaDon = Integer.parseInt(scanner.nextLine());
        System.out.println("Thong tin nhan vien:");
        NhanVien nhanVien = this.inputNhanVien(scanner);
        System.out.println("Thong tin khach hang:");
        KhachHang khachHang = this.inputKhachHang(scanner);
        List<MyPham> danhSachMyPham = new ArrayList<>();

        while (true){
            System.out.println("thong tin my pham:");
            MyPham myPham = this.inputMyPham(scanner);
            danhSachMyPham.add(myPham);
            System.out.println("Ban co muon nhap tiep khong (y/n):");
            String response = scanner.nextLine();
            if (response.equals("y")){
                continue;
            }else {
                break;
            }
        }
        HoaDon hoaDon = new HoaDon(ngayLapHoaDon, soHoaDon, nhanVien, khachHang, danhSachMyPham);
        return hoaDon;
    }
}
