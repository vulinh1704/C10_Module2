package com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Lin"; // là 1 immutable class
        name = "Huong";

//        char[] nameChars = {'L', 'i', 'n'};
//        String name = new String(nameChars);
//        System.out.println(name);

//        MutableExample s = new MutableExample("Linh");
//        s.setValue("Truong");
//        s.setValue("Long");
        // Là class cho phép thay đổi thông tin của đối tượng (Thay doi giá trị thuộc tính)

//        ImmutableExample im = new ImmutableExample("Linh");
//        System.out.println(im.getValue());
        // Là class không cho phép thay đổi thông tin của đối tượng (Chỉ get k set)

        // Cơ chế lưu trữ giá trị của string (mềm dẻo và hiệu suất cao)
//
//        String s1 = "Hello";            // String literal
//        String s2 = "Hello";            // String literal
//        System.out.println(s1 == s2);
        /*
        so sánh 2 đối tượng => true (Cùng lưu trữ địa chỉ ô nhớ của chuỗi "Hello" trong String pool trong Heap Memory
        */
//        String s3 = s1;                // Cùng tham chiếu (trỏ tới cùng một vị trí)
        String s4 = new String("Hello");  // Tạo mới một đối tượng String (String object)
        String s5 = new String("Hello");  // Tạo mới một đối tượng String
//        System.out.println(s4 == s5); // false (lưu trữ 2 địa chỉ ô nhớ khác nhau)
//        System.out.println(s4 == s1);
//
//        String name2 = " Vu " + " Linh";
//        System.out.println(name2);

        String s = "C10 Class";
        String s2 = "c10 class";
        String fullName = " Lin h    ";
//        length()
        System.out.println(s.length());
//        charAt(index)
        char c = s.charAt(4);
        System.out.println(c);
//        equals()
        System.out.println(s4.equals(s5)); // chỉ so sánh value không so sánh object.
//        equalsIgnoreCase()
        System.out.println(s.equalsIgnoreCase(s2)); // so sánh không phân biệt hoa thường
//        concat()
        System.out.println(s.concat(fullName)); // nối chuỗi
//        contains()
        System.out.println(s.contains("x")); // có chứa chuỗi con hay ko
//        indexOf()
        System.out.println(s.indexOf("x")); // trả lại vị trí của chuỗi con, nếu k có trả lại -1
//        substring()
        System.out.println(s.substring(0, 3)); // lấy ra chuỗi con: "C10"
//        toUpperCase()
        System.out.println(s2.toUpperCase());
//        toLowerCase()
        System.out.println(s.toLowerCase());
//        trim()
        System.out.println(fullName.trim()); // xóa dấu cách ở 2 đầu
//        Split
        String[] strs = s.split(" ");
        System.out.println(Arrays.toString(strs));

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
        System.out.println("fullName = " + fullName);

        StringBuilder sb = new StringBuilder("Vu Linh");
        System.out.println(sb);
        sb.append(" C10");
        System.out.println(sb); // mubable class


    }
}