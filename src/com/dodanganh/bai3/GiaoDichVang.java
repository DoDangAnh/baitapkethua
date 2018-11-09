package com.dodanganh.bai3;

import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang() {
        super();
        this.loaiVang = "";
    }

    public GiaoDichVang(int soLuong, String maGiaoDich, String ngayGiaoDich, double donGia, double thanhTien) {
        super(soLuong, maGiaoDich, ngayGiaoDich, donGia, thanhTien);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public void nhapGiaoDichVang(){
        super.nhapGiaoDich();
        System.out.println("nhập vào loại vàng: ");
        this.loaiVang = new Scanner(System.in).nextLine();
    }

    public void xuatGiaoDichVang() {
        super.xuatGiaoDich();
        System.out.println("loại vàng: " +this.loaiVang);
    }

    public double tinhTienGiaoDichVang(){
        return this.thanhTien = soLuong*donGia;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" +
                "loaiVang='" + loaiVang + '\'' +
                ", soLuong=" + soLuong +
                ", maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
