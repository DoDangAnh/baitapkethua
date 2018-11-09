package com.dodanganh.bai3;

public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich ql = new QuanLyGiaoDich(2,2);
        ql.nhapDanhSachGdVang();
        ql.xuatDanhSachGdVang();
        System.out.println("Tổng tiền giao dịch vàng là: " +ql.tongTienGdVang());
        ql.xuatGdHonMotTy();
    }
}
