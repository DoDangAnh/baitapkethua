package com.dodanganh.bai3;

import java.util.Scanner;

public class GiaoDich {
    protected int soLuong;
    protected String maGiaoDich, ngayGiaoDich;
    protected double donGia, thanhTien;

    public GiaoDich() {
        this.maGiaoDich = "";
        this.ngayGiaoDich = "";
        this.donGia = 0;
        this.soLuong = 0;
        this.thanhTien = 0;
    }

    public GiaoDich(int soLuong, String maGiaoDich, String ngayGiaoDich, double donGia, double thanhTien) {
        this.soLuong = soLuong;
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapGiaoDich (){
        System.out.println("nhập mã giao dịch: ");
        this.maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("nhập ngày giao dịch: ");
        this.ngayGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("nhập vào số lượng: ");
        this.soLuong = new Scanner(System.in).nextInt();
    }

    public void xuatGiaoDich() {
        System.out.println("mã giao dịch: " + this.maGiaoDich);
        System.out.println("ngày giao dịch:  " +this.ngayGiaoDich);
        System.out.println("đơn giá: " +this.donGia);
        System.out.println("số lượng: " +this.soLuong);
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "soLuong=" + soLuong +
                ", maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
