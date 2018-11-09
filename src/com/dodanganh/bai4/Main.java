package com.dodanganh.bai4;

public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich ql = new QuanLyGiaoDich(2,2);
        ql.nhapDanhSachGdd();
        ql.xuatDanhSachGdd();
        System.out.println(ql.tongTienGdd());
    }
}
