package com.dodanganh.bai5;

import java.util.Scanner;

public class KhachHang {
    protected String maKhachHang,ngayXuatHd,hoTenKh;
    protected double soLuong,donGia,thanhTien;

    public KhachHang() {
        this.maKhachHang = "";
        this.ngayXuatHd = "";
        this.hoTenKh = "";
        this.soLuong = 0;
        this.donGia = 0;
        this.thanhTien = 0;
    }

    public KhachHang(String maKhachHang, String ngayXuatHd, String hoTenKh, double soLuong, double donGia, double thanhTien) {
        this.maKhachHang = maKhachHang;
        this.ngayXuatHd = ngayXuatHd;
        this.hoTenKh = hoTenKh;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayXuatHd() {
        return ngayXuatHd;
    }

    public void setNgayXuatHd(String ngayXuatHd) {
        this.ngayXuatHd = ngayXuatHd;
    }

    public String getHoTenKh() {
        return hoTenKh;
    }

    public void setHoTenKh(String hoTenKh) {
        this.hoTenKh = hoTenKh;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
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
        System.out.println("nhập mã khách hàng: ");
        this.maKhachHang = new Scanner(System.in).nextLine();
        System.out.println("nhập ngày xuất hóa đơn: ");
        this.ngayXuatHd = new Scanner(System.in).nextLine();
        System.out.println("nhập họ tên khách hàng: ");
        this.hoTenKh = new Scanner(System.in).nextLine();
        System.out.println("nhập số lượng: ");
        this.soLuong = new Scanner(System.in).nextDouble();
        System.out.println("nhập đơn giá: ");
        this.donGia = new Scanner(System.in).nextDouble();
    }

    public void xuatHoaDon() {
        System.out.println("mã khách hàng " +this.maKhachHang);
        System.out.println("ngày xuất hóa đơn: " +this.ngayXuatHd);
        System.out.println("họ tên khách hàng: " +this.hoTenKh);
        System.out.println("số lượng hóa đơn: " +this.soLuong);
        System.out.println("đơn giá: " +this.donGia);
    }
}
