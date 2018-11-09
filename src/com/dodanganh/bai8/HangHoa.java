package com.dodanganh.bai8;

public class HangHoa {

    protected  String maHangHoa, tenHangHoa;
    protected  int soLuongTon;
    protected double donGia;

    public HangHoa() {
        this.maHangHoa = "";
        this.tenHangHoa = "";
        this.soLuongTon = 0;
        this.donGia = 0;
    }

    public HangHoa(String maHangHoa, String tenHangHoa, int soLuongTon, double donGia) {
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }


    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
