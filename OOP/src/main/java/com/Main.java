package com;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, 29, "Linh");
        // Đối tượng là các thực thể được sinh ra từ lớp
        // Khởi tạo 1 đối tượng Person
        System.out.println(p1.name); // Truy xuất thuộc tính đối tượng
        System.out.println(p1.age);
        p1.name = "Vu Linh";
        System.out.println(p1.name);
        p1.run(); // gọi phương thức bởi đối tượng
        Person p2 = new Person(2, 30, "Long");
        System.out.println(p2.name);
        p2.run();

//        Person p1 = new Person();
//        System.out.println(p1.name);
    }
}

