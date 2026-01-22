package com;

public class HinhChuNhat {
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() {
        double S = this.chieuDai * this.chieuRong;
        return S;
    }

    public  double tinhChuVi() {
        double C = (this.chieuRong + this.chieuDai) / 2;
        return C;
    }

    @Override
    public String toString() {
        return "Hình chu nhat co chieu dai: " + this.chieuDai + ", Chieu rong: " + this.chieuRong;
    }
}
