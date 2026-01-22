package com;

public class Main {
//    public static void main(String[] args) {
//        int a; // biến cục bộ: các biến nằm trong hàm, khối
//
//        Person p1 = new Person(1, 29, "Linh");
//        // Đối tượng là các thực thể được sinh ra từ lớp
//        // Khởi tạo 1 đối tượng Person
//        System.out.println(p1.name); // Truy xuất thuộc tính đối tượng
//        System.out.println(p1.age);
//        p1.name = "Vu Linh";
//        System.out.println(p1.name);
//        p1.run(); // gọi phương thức bởi đối tượng
//        Person p2 = new Person(2, 30, "Long");
//        System.out.println(p2.name);
//        p2.run();
//

    /// /        Person p1 = new Person();
    /// /        System.out.println(p1.name);
//    }

    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(4, 3);
        System.out.println(hinhChuNhat);
        double dienTich = hinhChuNhat.tinhDienTich();
        System.out.println("Dien tich: " + dienTich);
        double chuVi = hinhChuNhat.tinhChuVi();
        System.out.println("Chu vi: " + chuVi);

        hinhChuNhat.chieuDai = 5;
        hinhChuNhat.chieuRong = 4;
        System.out.println("Sau cap nhat: ");
        System.out.println(hinhChuNhat);
        double dienTich2 = hinhChuNhat.tinhDienTich();
        System.out.println("Dien tich: " + dienTich2);
        double chuVi2 = hinhChuNhat.tinhChuVi();
        System.out.println("Chu vi: " + chuVi2);
    }
}

