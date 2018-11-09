package com.dodanganh.bai5;

public class Main {
    public static void main(String[] args) {
        QuanLyHoaDon qlhd = new QuanLyHoaDon(2,2);
        qlhd.nhapDanhSachKhVn();
        qlhd.xuatDanhSachKhVn();
        System.out.println(qlhd.tongHdKhVn());
        qlhd.xuatHdTheoYeuCau();
    }
}
