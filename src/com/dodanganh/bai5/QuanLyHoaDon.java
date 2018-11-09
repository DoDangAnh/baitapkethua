package com.dodanganh.bai5;

public class QuanLyHoaDon {
    private KhachHangVn [] khvn;
    private KhachHangNuocNgoai [] khnn;
    private int soKhVn,soKhnn;

    public QuanLyHoaDon( int soKhVn, int soKhnn) {
        this.soKhVn = soKhVn;
        this.soKhnn = soKhnn;
        this.khvn = new KhachHangVn[this.soKhVn];
        this.khnn = new KhachHangNuocNgoai[this.soKhnn];
    }

    public KhachHangVn[] getKhvn() {
        return khvn;
    }

    public void setKhvn(KhachHangVn[] khvn) {
        this.khvn = khvn;
    }

    public KhachHangNuocNgoai[] getKhnn() {
        return khnn;
    }

    public void setKhnn(KhachHangNuocNgoai[] khnn) {
        this.khnn = khnn;
    }

    public int getSoKhVn() {
        return soKhVn;
    }

    public void setSoKhVn(int soKhVn) {
        this.soKhVn = soKhVn;
    }

    public int getSoKhnn() {
        return soKhnn;
    }

    public void setSoKhnn(int soKhnn) {
        this.soKhnn = soKhnn;
    }

    public void nhapDanhSachKhVn() {
        for (int i = 0; i < this.soKhVn ; i++) {
            this.khvn[i] = new KhachHangVn();
            this.khvn[i].nhapKhachHangVn();
        }
    }

    public void xuatDanhSachKhVn() {
        for (int i = 0; i < this.soKhVn ; i++) {
            this.khvn[i].xuatKhachHangVn();
        }
    }

    public void nhapDanhSachKhnn() {
        for (int i = 0; i < this.soKhnn ; i++) {
            this.khnn[i] = new KhachHangNuocNgoai();
            this.khnn[i].nhapKhachHangNuocNgoai();
        }
    }

    public void xuatDanhSachKhnn() {
        for (int i = 0; i < this.soKhnn ; i++) {
            this.khnn[i].xuatKhachHangNuocNgoai();
        }
    }

    public double tongHdKhVn() {
        double tong = 0;
        for (int i = 0; i < this.soKhVn ; i++) {
            tong += this.khvn[i].tinhTienKhachHangVn();
        }
        return tong;
    }

    public double tongHdKhnn() {
        double tong = 0;
        for (int i = 0; i < this.soKhnn ; i++) {
            tong += this.khnn[i].tinhTienHdKhachHangNuocNgoai();
        }
        return tong;
    }

    public double tongTbHdKhnn() {
        double tb;
        return tb = this.tongHdKhnn()/this.soKhnn;
    }

    public void xuatHdTheoYeuCau() {
        for (int i = 0; i < this.soKhVn ; i++) {
            if(this.khvn[i].getNgayXuatHd().equals("092013")){
                this.khvn[i].xuatKhachHangVn();
            }
        }

        for (int i = 0; i < this.soKhnn ; i++) {
            if(this.khnn[i].getNgayXuatHd().equals("092013")) {
                this.khnn[i].xuatKhachHangNuocNgoai();
            }
        }
    }
}
