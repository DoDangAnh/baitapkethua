package com.dodanganh.bai3;

public class QuanLyGiaoDich {
    private GiaoDichVang [] gdv;
    private GiaoDichTienTe [] gdtt;
    private int soLuongGdVang, soLuongGdTienTe;


    public QuanLyGiaoDich(int soLuongGdVang, int soLuongGdTienTe) {
        this.soLuongGdVang = soLuongGdVang;
        this.soLuongGdTienTe = soLuongGdTienTe;
        this.gdv = new GiaoDichVang[this.soLuongGdVang];
        this.gdtt = new GiaoDichTienTe[this.soLuongGdTienTe];
    }

    public void nhapDanhSachGdVang() {
        for (int i = 0; i < this.soLuongGdVang ; i++) {
            this.gdv[i] = new GiaoDichVang();
            this.gdv[i].nhapGiaoDichVang();
        }
    }

    public void xuatDanhSachGdVang() {
        for (int i = 0; i < this.soLuongGdVang ; i++) {
            this.gdv[i].xuatGiaoDichVang();
        }
    }

    public void nhapDanhSachGdTienTe() {
        for (int i = 0; i < this.soLuongGdTienTe ; i++) {
            this.gdtt[i] = new GiaoDichTienTe();
            this.gdtt[i].nhapGiaoDichTienTe();
        }
    }

    public void xuatDanhSachGdTienTe() {
        for (int i = 0; i < this.soLuongGdTienTe ; i++) {
            this.gdtt[i].xuatGiaoDichTienTe();
        }
    }

    public double tongSoLuongGdVang() {
        double tong = 0;
        for (int i = 0; i < this.soLuongGdVang ; i++) {
            tong += this.gdv[i].tinhTienGiaoDichVang();
        }
        return tong;
    }

    public double tongTienGdTienTe() {
       double tong = 0;
        for (int i = 0; i < this.soLuongGdTienTe ; i++) {
            tong += this.gdtt[i].tinhTienGiaoDichTienTe();
        }
        return tong;
    }

    public double tinhtienTbGdTienTe() {
        double tongTb;
        return tongTb =this.tongTienGdTienTe()/this.soLuongGdTienTe;
    }

    public void xuatGdHonMotTy() {
        for (int i = 0; i < this.soLuongGdVang ; i++) {
            if(this.gdv[i].getDonGia() > 1000000000) {
                this.gdv[i].xuatGiaoDichVang();
            }
        }

        for (int i = 0; i < this.soLuongGdTienTe ; i++) {
            if(this.gdtt[i].getDonGia() > 100000000) {
                this.gdtt[i].xuatGiaoDichTienTe();
            }
        }
    }
}
