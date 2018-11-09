package com.dodanganh.bai4;

public class QuanLyGiaoDich {
    private GiaoDichDat[] gdd;
    private GiaoDichNha[] gdn;
    private int soLuongGdd, soLuongGdn;

    public QuanLyGiaoDich(int soLuongGdd, int soLuongGdn) {
        this.soLuongGdd = soLuongGdd;
        this.soLuongGdn = soLuongGdn;
        this.gdd = new GiaoDichDat[this.soLuongGdd];
        this.gdn = new GiaoDichNha[this.soLuongGdn];
    }

    public void nhapDanhSachGdd() {
        for (int i = 0; i < this.soLuongGdd; i++) {
            this.gdd[i] = new GiaoDichDat();
            this.gdd[i].nhapGiaoDichDat();
        }
    }

    public void xuatDanhSachGdd() {
        for (int i = 0; i < this.soLuongGdd; i++) {
            this.gdd[i].xuatGiaoDichDat();
        }
    }

    public void nhapDanhSachGdn() {
        for (int i = 0; i < this.soLuongGdn; i++) {
            this.gdn[i] = new GiaoDichNha();
            this.gdn[i].nhapGiaoDichNha();
        }
    }

    public void xuatDanhSachGdn() {
        for (int i = 0; i < this.soLuongGdn; i++) {
            this.gdn[i].xuatGiaoDichNha();
        }
    }

    public double tongTienGdd() {
        double tong = 0;
        for (int i = 0; i < this.soLuongGdd ; i++) {
            tong += this.gdd[i].tinhTienGiaoDichDat();
        }
        return tong;
    }

    public double tongTienGdn() {
        double tong = 0;
        for (int i = 0; i < this.soLuongGdn ; i++) {
            tong += this.gdn[i].tinhTienGiaoDichNha();
        }
       return tong;
    }

    public double tongTienTbGdd() {
        double tb;
        return  tb = this.tongTienGdd()/this.soLuongGdd;
    }

    public void xuatGiaoDichTheoYeuCau() {
        for (int i = 0; i < this.soLuongGdd ; i++) {
            if(this.gdd[i].getNgayGiaoDich().equals("09-2013")){
                this.gdd[i].xuatGiaoDichDat();
            }
        }

        for (int i = 0; i < this.soLuongGdn; i++) {
            if(this.gdn[i].getNgayGiaoDich().equals("09-2013")){
                this.gdn[i].xuatGiaoDichNha();
            }
        }
    }
}
