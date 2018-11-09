package com.dodanganh.bai5;

import java.util.Scanner;

public class KhachHangVn extends KhachHang {
    private int loaiKh;
    private double dinhMuc;


    public KhachHangVn() {
        super();
        this.loaiKh = 0;
        this.dinhMuc = 0;
    }

    public KhachHangVn(String maKhachHang, String ngayXuatHd, String hoTenKh, double soLuong, double donGia, double thanhTien) {
        super(maKhachHang, ngayXuatHd, hoTenKh, soLuong, donGia, thanhTien);
        this.loaiKh = loaiKh;
        this.dinhMuc = dinhMuc;
    }

    public int getLoaiKh() {
        return loaiKh;
    }

    public void setLoaiKh(int loaiKh) {
        if (loaiKh != 1 && loaiKh != 2 && loaiKh != 3) {
            return;
        }
        this.loaiKh = loaiKh;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public void nhapKhachHangVn() {
        super.nhapHoaDon();
        do {
            System.out.println("nhập loại khách hàng (1:Sinh hoạt, 2:KinhDoanh, 3:Sanxuat): ");
            this.loaiKh = new Scanner(System.in).nextInt();
        } while (loaiKh != 1 && loaiKh != 2 && loaiKh != 3);
        System.out.println("nhập định mức: ");
        this.dinhMuc = new Scanner(System.in).nextDouble();
    }

    public void xuatKhachHangVn() {
        super.xuatHoaDon();
        if(loaiKh == 1) {
            System.out.println("khách hàng: Sinh hoạt" +this.loaiKh);
        }
        else if(loaiKh == 2 ) {
            System.out.println("khách hàng: Kinh Doanh" +this.loaiKh);
        }
        else {
            System.out.println("khách hàng: Sản xuất" +this.loaiKh);
        }
        System.out.println("định mức: " + this.dinhMuc);
    }

    public double tinhTienKhachHangVn() {
       if(soLuong <= dinhMuc){
           this.thanhTien = soLuong*donGia;
       }
       else {
           this.thanhTien = soLuong*donGia*dinhMuc+((soLuong-dinhMuc)*donGia*2.5);
       }
       return thanhTien;
    }
}
