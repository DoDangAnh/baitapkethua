package com.dodanganh.bai5;

import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai() {
        super();
        this.quocTich = "";
    }

    public KhachHangNuocNgoai(String maKhachHang, String ngayXuatHd, String hoTenKh, double soLuong, double donGia, double thanhTien) {
        super(maKhachHang, ngayXuatHd, hoTenKh, soLuong, donGia, thanhTien);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void nhapKhachHangNuocNgoai() {
        super.nhapHoaDon();
        System.out.println("nhập quốc tịch khách hàng: ");
        this.quocTich = new Scanner(System.in).nextLine();
    }

    public void xuatKhachHangNuocNgoai() {
        super.xuatHoaDon();
        System.out.println("quốc tịch khách hàng: " +this.quocTich);
    }

    public double tinhTienHdKhachHangNuocNgoai() {
        return thanhTien = donGia*soLuong;
    }
}
