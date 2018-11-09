package com.dodanganh.bai7;

public class Customer extends Person {
    private String tenCongTy,danhGia;
    private double triGiaHd;

    public Customer() {
        super();
        this.tenCongTy = "";
        this.triGiaHd = 0;
        this.danhGia = "";
    }

    public Customer(String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHd = triGiaHd;
        this.danhGia = danhGia;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    public double getTriGiaHd() {
        return triGiaHd;
    }

    public void setTriGiaHd(double triGiaHd) {
        this.triGiaHd = triGiaHd;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
