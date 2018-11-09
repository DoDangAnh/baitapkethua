package com.dodanganh.bai7;

public class Student extends Person {
    private double diemMon1, diemMon2;

    public Student() {
        super();
        this.diemMon1 = 0;
        this.diemMon2 = 0;
    }

    public Student(String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double diemTb() {
        double tb;
         return tb = (diemMon1+diemMon1)/2;
    }

    public void danhGia() {
        if(this.diemTb() <= 5) {
            System.out.println("Học sinh xếp loại trung bình!");
        }
        else if(this.diemTb() <= 7) {
            System.out.println("Học sinh xếp loại khá!");
        }
        else {
            System.out.println("Học sinh xếp loại giỏi! ");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
