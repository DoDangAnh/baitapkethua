package com.dodanganh.bai6;

import java.util.Scanner;

public class HoaDon {
    protected String maHoaDon,ngayHoaDon,tenKh,maPhong;
    protected double donGia,thanhTien;

    public HoaDon() {
        this.maHoaDon = "";
        this.ngayHoaDon = "";
        this.tenKh = "";
        this.donGia = 0;
        this.thanhTien = 0;
    }

    public HoaDon(String maHoaDon, String ngayHoaDon, String tenKh, String maPhong, double donGia, double thanhTien) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKh = tenKh;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapHoaDon() {
        System.out.println("nhập mã hóa đơn: ");
        this.maHoaDon = new Scanner(System.in).nextLine();
        System.out.println("nhập ngày xuất hóa đơn: ");
        this.ngayHoaDon = new Scanner(System.in).nextLine();
        System.out.println("nhập tên khách hàng:  ");
        this.tenKh = new Scanner(System.in).nextLine();
        System.out.println("nhập mã phòng: ");
        this.maPhong = new Scanner(System.in).nextLine();
        System.out.println("nhập đơn giá: ");
        this.donGia = new Scanner(System.in).nextDouble();
    }

    public void xuatHoaDon() {
        System.out.println("mã hóa đơn: " +this.maHoaDon);
        System.out.println("ngày xuất hóa đơn: " +this.ngayHoaDon);
        System.out.println("tên khách hàng: " +this.tenKh);
        System.out.println("mã phòng: " +this.maPhong);
        System.out.println("đơn giá: " +this.donGia);
    }
}
