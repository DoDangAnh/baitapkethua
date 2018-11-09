package com.dodanganh.bai3;

import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    private float tiGia;
    private int loaiTienTe;

    public GiaoDichTienTe() {
        super();
        this.tiGia = 0;
        this.loaiTienTe = 0;
    }

    public GiaoDichTienTe(int soLuong, String maGiaoDich, String ngayGiaoDich, double donGia, double thanhTien) {
        super(soLuong, maGiaoDich, ngayGiaoDich, donGia, thanhTien);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public int getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        if(loaiTienTe !=1 && loaiTienTe !=2){
            return;
        }
        this.loaiTienTe = loaiTienTe;
    }

    public void nhapGiaoDichTienTe() {
        super.nhapGiaoDich();
        do {
            System.out.println("nhập vào loại tiền tệ: ");
            this.loaiTienTe = new Scanner(System.in).nextInt();
        }while (this.loaiTienTe !=1 && this.loaiTienTe!=2);
        System.out.println("nhập vào tỉ giá tiền tệ: ");
        this.tiGia = new Scanner(System.in).nextFloat();
    }

    public void xuatGiaoDichTienTe() {
        super.xuatGiaoDich();
        System.out.println("loại tiền tệ: " +this.loaiTienTe);
        System.out.println("tỉ giá: " +this.tiGia);
    }
    public double tinhTienGiaoDichTienTe() {
       if(this.loaiTienTe == 1){
           this.thanhTien = soLuong*donGia*tiGia;
       }
       else {
           this.thanhTien = soLuong*donGia;
       }
       return thanhTien;
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +
                "tiGia=" + tiGia +
                ", loaiTienTe=" + loaiTienTe +
                ", soLuong=" + soLuong +
                ", maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
