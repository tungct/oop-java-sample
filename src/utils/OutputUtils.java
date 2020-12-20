package utils;
import model.*;
import utils.*;

import java.util.*;
import java.io.IOException;

public class OutputUtils {
    public void inToanBoHoaDon(List<HoaDon> danhSachHoaDon) throws IOException, ClassNotFoundException {
        System.out.println("Danh sach hoa don: ");
        for (HoaDon hoaDon : danhSachHoaDon){
            hoaDon.printHoaDon();
        }
    }

    public void inHoaDonTheoNgay(List<HoaDon> danhSachHoaDon, String ngay){
        List<HoaDon> danhSachHoaDonTheoNgay = new ArrayList<>();
        for (HoaDon hoaDon : danhSachHoaDon){
            if (hoaDon.getNgayLapHoaDon().equals(ngay)){
                danhSachHoaDonTheoNgay.add(hoaDon);
                hoaDon.printHoaDon();
            }
        }
    }

    public void inHoaDonTheoKhachHang(List<HoaDon> danhSachHoaDon, String dienThoai){
        List<HoaDon> danhSachHoaDonTheoNgay = new ArrayList<>();
        for (HoaDon hoaDon : danhSachHoaDon){
            if (hoaDon.getKhachHang().getDienThoai().equals(dienThoai)){
                danhSachHoaDonTheoNgay.add(hoaDon);
                hoaDon.printHoaDon();
            }
        }
    }

    public void inTongTienHoaDon(List<HoaDon> danhSachHoaDon){
        Float tongTienHoaDon = 0f;
        for (HoaDon hoaDon : danhSachHoaDon){
            tongTienHoaDon += hoaDon.tingTongTien();
        }
        System.out.println("Tong tien hoa don: " + tongTienHoaDon.toString());
    }

    public void inTongTienHoaDonTheoNgay(List<HoaDon> danhSachHoaDon, String ngay){
        Float tongTienHoaDon = 0f;
        for (HoaDon hoaDon : danhSachHoaDon){
            if (hoaDon.getNgayLapHoaDon().equals(ngay)) {
                tongTienHoaDon += hoaDon.tingTongTien();
            }
        }
        System.out.println("Tong tien hoa don: " + tongTienHoaDon.toString());
    }

    public void inTongTienHoaDonTheoKhachHang(List<HoaDon> danhSachHoaDon, String dienThoai){
        Float tongTienHoaDon = 0f;
        for (HoaDon hoaDon : danhSachHoaDon){
            if (hoaDon.getKhachHang().getDienThoai().equals(dienThoai)) {
                tongTienHoaDon += hoaDon.tingTongTien();
            }
        }
        System.out.println("Tong tien duoc ban cho khach hang : " + dienThoai + " la : " + tongTienHoaDon.toString());
    }

    public void inDanhSachHoaDonTheoTongTien(List<HoaDon> danhSachHoaDon){
        Map<HoaDon, Float> mapHoaDon = new HashMap<HoaDon, Float>();
        List<Float> danhSachTongTien = new ArrayList<>();
        List<Float> danhSachTongTienSapXep = new ArrayList<>();
        List<HoaDon> danhSachHoaDonTheoTongTien = new ArrayList<>();
        for (HoaDon hoaDon : danhSachHoaDon){
            Float tongTien = hoaDon.tingTongTien();
            danhSachTongTien.add(tongTien);
            mapHoaDon.put(hoaDon, tongTien);
        }
        Collections.sort(danhSachTongTien);
        System.out.println("Danh sach hoa don sap xep:");
        for (Float tongTien: danhSachTongTien){
            for (HoaDon hoaDon : danhSachHoaDon){
                if (hoaDon.tingTongTien().equals(tongTien)){
                    if (!danhSachHoaDonTheoTongTien.contains(hoaDon)) {
                        danhSachHoaDonTheoTongTien.add(hoaDon);
                        hoaDon.printHoaDon();
                    }
                }
            }
        }
    }

}
