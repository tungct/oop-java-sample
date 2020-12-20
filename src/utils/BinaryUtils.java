package utils;

import model.HoaDon;
import model.KhachHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryUtils implements Serializable {
    public void writeKhachHang(List<KhachHang> listKhachHang) throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listKhachHang);
        oos.close();
    }

    public List<KhachHang> readKhachHang() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<KhachHang> listKhachHang = (List<KhachHang>) ois.readObject();
        ois.close();
        return listKhachHang;
    }

    public void writeHoaDon(List<HoaDon> listHoaDon) throws IOException {
        FileOutputStream fos = new FileOutputStream("hoadon.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listHoaDon);
        oos.close();
    }
    public List<HoaDon> readHoaDon() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("hoadon.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<HoaDon> listHoaDon = (List<HoaDon>) ois.readObject();
        ois.close();
        return listHoaDon;
    }


}
