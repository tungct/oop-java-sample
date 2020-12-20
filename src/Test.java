import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.HoaDon;
import utils.*;

public class Test implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        InputUtils inputUtils = new InputUtils();
        OutputUtils outputUtils = new OutputUtils();
        BinaryUtils binaryUtils = new BinaryUtils();
        List<HoaDon> danhSachHoaDon = new ArrayList<>();
        String select = new String();
        try {
            while (true) {
                System.out.println("Chon chuc nang ban muon thuc hien: ");
                System.out.println("1: Nhap hoa don");
                System.out.println("2: In danh sach toan bo hoa don:");
                System.out.println("3: In danh sach hoa don tang theo tong tien");
                System.out.println("4: In danh sach toan bo hoa don theo ngay:");
                System.out.println("5: In danh sach hoa don theo khach hang:");
                System.out.println("6: Tinh tong tien da ban:");
                System.out.println("7: Tinh tong tien theo ngay");
                System.out.println("8: Tinh tong tien theo khach hang");
                System.out.println("other: Exit");

                select = scanner.nextLine();
                switch (select) {
                    case "1":
                        HoaDon hoaDon = inputUtils.inputHoaDon(scanner);
                        danhSachHoaDon.add(hoaDon);
                        binaryUtils.writeHoaDon(danhSachHoaDon);
                        continue;
                    case "2":
                        danhSachHoaDon = binaryUtils.readHoaDon();
                        outputUtils.inToanBoHoaDon(danhSachHoaDon);
                        continue;
                    case "3":
                        danhSachHoaDon = binaryUtils.readHoaDon();
                        outputUtils.inDanhSachHoaDonTheoTongTien(danhSachHoaDon);
                        continue;
                    case "4":
                        danhSachHoaDon = binaryUtils.readHoaDon();
                        System.out.println("Ban nhap ngay muon tra cuu:");
                        String ngay = scanner.nextLine();
                        outputUtils.inHoaDonTheoNgay(danhSachHoaDon, ngay);
                        continue;
                    case "5":
                        danhSachHoaDon = binaryUtils.readHoaDon();
                        System.out.println("Ban nhap sdt khach hang muon tra cuu hoa don:");
                        String sdt = scanner.nextLine();
                        outputUtils.inHoaDonTheoKhachHang(danhSachHoaDon, sdt);
                        continue;
                    case "6":
                        danhSachHoaDon = binaryUtils.readHoaDon();
                        outputUtils.inTongTienHoaDon(danhSachHoaDon);
                        continue;
                    case "7":
                        danhSachHoaDon = binaryUtils.readHoaDon();
                        System.out.println("Ban nhap ngay muon tra cuu:");
                        String ngayTraCuuTongTien = scanner.nextLine();
                        outputUtils.inTongTienHoaDonTheoNgay(danhSachHoaDon, ngayTraCuuTongTien);
                        continue;
                    case "8":
                        danhSachHoaDon = binaryUtils.readHoaDon();
                        System.out.println("Ban nhap sdt khach hang muon tra cuu:");
                        String sdtTraCuuTongTien = scanner.nextLine();
                        outputUtils.inTongTienHoaDonTheoKhachHang(danhSachHoaDon, sdtTraCuuTongTien);
                        continue;
                    default:
                        System.exit(1);
                }

            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
