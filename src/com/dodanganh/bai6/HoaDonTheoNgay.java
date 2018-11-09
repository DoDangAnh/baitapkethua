package com.dodanganh.bai6;

import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;

    public HoaDonTheoNgay() {
        super();
        this.soNgayThue = 0;
    }

    public HoaDonTheoNgay(String maHoaDon, String ngayHoaDon, String tenKh, String maPhong, double donGia, double thanhTien) {
        super(maHoaDon, ngayHoaDon, tenKh, maPhong, donGia, thanhTien);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public void nhapHoaDonTheoNgay() {
        super.nhapHoaDon();
        System.out.println("nhập số ngày thuê: ");
        this.soNgayThue = new Scanner(System.in).nextInt();
    }

    public void xuatHoaDonTheoNgay() {
        super.xuatHoaDon();
        System.out.println("số ngày thuê: " +this.soNgayThue);
    }

    public double tinhTienHoaDonTheoNgay() {
        if(soNgayThue > 7) {
            this.thanhTien = soNgayThue*donGia+((soNgayThue -7)*donGia*0.8);
        }
        else {
            this.thanhTien = soNgayThue*donGia;
        }
        return thanhTien;
    }
}
