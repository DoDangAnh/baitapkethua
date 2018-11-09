package com.dodanganh.bai4;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    private String diaChi;
    private int loaiNha;

    public GiaoDichNha() {
        super();
        this.loaiNha = 0;
        this.diaChi = "";
    }

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String diaChi, int loaiNha) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        if(loaiNha != 1 && loaiNha != 2){
            return;
        }
        this.loaiNha = loaiNha;
    }

    public void nhapGiaoDichNha() {
        super.nhapGiaoDich();
        do {
            System.out.println("nhập loại nhà: ");
            this.loaiNha = new Scanner(System.in).nextInt();
        }while (loaiNha !=1 && loaiNha !=2);
        System.out.println("nhập địa chỉ nhà: ");
        this.diaChi = new Scanner(System.in).nextLine();
    }

    public void xuatGiaoDichNha() {
        super.xuatGiaoDich();
        System.out.println("loại nhà: " +this.loaiNha);
        System.out.println("địa chỉ nhà: " +this.diaChi);
    }

    public double tinhTienGiaoDichNha() {
        if(loaiNha == 1 ){
            this.thanhTien = dienTich*donGia;
        }
        else {
            this.thanhTien = dienTich*donGia*0.9;
        }
        return thanhTien;
    }
}
