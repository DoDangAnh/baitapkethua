package com.dodanganh.bai4;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private int loaiDat;

    public GiaoDichDat() {
        super();
        this.loaiDat = 0;
    }

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(char loaiDat) {
        if (loaiDat != 0 && loaiDat != 1) {
            return;
        }
        this.loaiDat = loaiDat;
    }

    public void nhapGiaoDichDat() {
        super.nhapGiaoDich();
        do {
            System.out.println("nhập loại đất : ");
            this.loaiDat = new Scanner(System.in).nextInt();
        } while (loaiDat != 0 && loaiDat != 1);
    }

    public void xuatGiaoDichDat() {
        super.xuatGiaoDich();
        System.out.println("loại đất: " + this.loaiDat);
    }


    public double tinhTienGiaoDichDat(){
        if(loaiDat == 0){
            this.thanhTien = dienTich*donGia;
        }
        else {
            this.thanhTien = dienTich*donGia*1.5;
        }
        return thanhTien;
    }
}
