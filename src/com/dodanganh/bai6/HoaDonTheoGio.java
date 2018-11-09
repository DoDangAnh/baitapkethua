package com.dodanganh.bai6;

import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;

    public HoaDonTheoGio() {
        super();
        this.soGioThue = 0;
    }

    public HoaDonTheoGio(String maHoaDon, String ngayHoaDon, String tenKh, String maPhong, double donGia, double thanhTien) {
        super(maHoaDon, ngayHoaDon, tenKh, maPhong, donGia, thanhTien);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        if(soGioThue > 30) {
            return;
        }
        this.soGioThue = soGioThue;
    }

    public void nhapHoaDonTheoGio() {
        super.nhapHoaDon();
       do {
           System.out.println("nhập số giờ thuê: ");
           this.soGioThue = new Scanner(System.in).nextInt();
       }while (soGioThue > 30 );
    }

    public void xuatHoaDonTheoGio() {
        super.xuatHoaDon();
        System.out.println("só giờ thuê: " +this.soGioThue);
    }

    public double tinhTienHoaDonTheoGio() {
        if(soGioThue < 24) {
            this.thanhTien = soGioThue*donGia;
        }
        else if (soGioThue < 30) {
            this.thanhTien = soGioThue *donGia;
        }
        else {
            System.out.println("không dùng loại hóa đơn theo giờ!");
        }
     return thanhTien;
    }
}
