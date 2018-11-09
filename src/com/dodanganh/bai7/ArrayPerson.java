package com.dodanganh.bai7;

public class ArrayPerson {
    private Student [] sv;
    private Employee [] cn;
    private Customer [] kh;
    private int soLuongsv, soLuongcn, soLuongkh;

    public ArrayPerson( int soLuongsv, int soLuongcn, int soLuongkh) {
        this.soLuongsv = soLuongsv;
        this.soLuongcn = soLuongcn;
        this.soLuongkh = soLuongkh;
        this.sv = new Student[this.soLuongsv];
        this.cn = new Employee[this.soLuongcn];
        this.kh = new Customer[this.soLuongkh];
    }


}
