package com.dodanganh.bai4;

import java.util.Scanner;

public class GiaoDich {
    protected String maGiaoDich,ngayGiaoDich;
    protected double donGia,dienTich,thanhTien;

    public GiaoDich() {
        this.maGiaoDich = "";
        this.ngayGiaoDich = "";
        this.donGia = 0;
        this.dienTich = 0;
    }

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapGiaoDich() {
        System.out.println("nhập vào mã giao dịch: ");
        this.maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("nhập vào ngày giao dịch: ");
        this.ngayGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("nhập vào diện tích: ");
        this.dienTich = new Scanner(System.in).nextDouble();
    }

    public void xuatGiaoDich() {
        System.out.println("mã giao dịch: " +this.maGiaoDich);
        System.out.println("ngày giao dịch: " +this.ngayGiaoDich);
        System.out.println("đơn giá :" +this.donGia);
        System.out.println("diện tích: " +this.dienTich);
    }
}
