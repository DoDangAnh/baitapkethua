package com.dodanganh.bai6;

public class QuanLyHoaDon {
    private HoaDonTheoGio [] hdg;
    private HoaDonTheoNgay [] hdn;
    private  int soLuongHdg,soLuongHdn;

    public QuanLyHoaDon(int soLuongHdg, int soLuongHdn) {
        this.soLuongHdg = soLuongHdg;
        this.soLuongHdn = soLuongHdn;
        this.hdg = new HoaDonTheoGio[this.soLuongHdg];
        this.hdn = new HoaDonTheoNgay[this.soLuongHdn];
    }

    public void nhapHdg() {
        for (int i = 0; i < this.soLuongHdg ; i++) {
            this.hdg[i] = new HoaDonTheoGio();
            this.hdg[i].nhapHoaDonTheoGio();
        }
    }

    public void xuatHdg() {
        for (int i = 0; i < this.soLuongHdg ; i++) {
            this.hdg[i].xuatHoaDonTheoGio();
        }
    }

    public void nhapHdn() {
        for (int i = 0; i < this.soLuongHdn ; i++) {
            this.hdn[i] = new HoaDonTheoNgay();
            this.hdn[i].nhapHoaDonTheoNgay();
        }
    }

    public void xuatHdn() {
        for (int i = 0; i < this.soLuongHdn; i++) {
            this.hdn[i].xuatHoaDonTheoNgay();
        }
    }

    public double tongHdg() {
        double tong1 = 0;
        for (int i = 0; i < this.soLuongHdg ; i++) {
            tong1 += this.hdg[i].tinhTienHoaDonTheoGio();
        }
        return tong1;
    }

    public double tongHdn() {
        double tong2 = 0;
        for (int i = 0; i < this.soLuongHdn; i++) {
            tong2 += this.hdn[i].tinhTienHoaDonTheoNgay();
        }
        return tong2;
    }
}
