package com.dodanganh.bai7;

public class Employee extends Person {
    private double heSoLuong;
    public static final double TIEN_LUONG_CB = 500.0f;

    public Employee() {
        super();
        this.heSoLuong = 0;
    }

    public Employee(String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public  double tinhTienLuong() {
        double thanhTien;
        return thanhTien = heSoLuong*TIEN_LUONG_CB;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
