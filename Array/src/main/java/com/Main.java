package com;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 10;

        // KN: là 1 biến chứa tâp hợp cac giá trị liên quan đến nhau
        // Cách khai báo Java
        int[] numbers = {1, 2, 10};
        // index         0  1   2
        // chỉ số(index): Là vị trí của các phần từ trong mảng, bắt đầu từ 0, vị trí cuôi luôn là length - 1
        // Phẩn tử(Element): Các giá trị ở trong mảng
        System.out.println(numbers[2]); // 10
        // Độ dài mảng (length): số lượng phần tử có trong mảng
        System.out.println(numbers.length);
        // Thay đổi giá trị phần tử tại 1 vị trí
        numbers[2] = 4;
        System.out.println(numbers[2]); // 4
        // Duyệt mảng
        System.out.println("Duyet mang");
        // Cách 1: dùng fori
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Cách 2: dùng for each
        System.out.println("Duyet mang bang for each");
        for(int element: numbers) { // Duyet qua và lấy từng phần tử gán cho element
            System.out.println(element);
        }

        //System.out.println(numbers[10]); // err
        System.out.println("Duyet mang khai bao moi");
        int[] arr = new int[10]; // Khai báo khác: Đang khai 1 mảng 10 phần tử
        // Tùy theo kiểu dữ liệu của mảng khi khai báo như trên các phần tử sẽ có giá trị mặc đinh
        // int ~ 0, double ~ 0.0, String hoặc các kiểu định nghĩa bằng class ~ null, boolean ~ false
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr)); // In nhanh 1 mảng

        showHello(); // Gói hàm

        int number1 = 1;
        int number2 = 2;
        int total = getTotal(number1, number2); // number1 và number2 Đối số: Giá trị thực sự sử dụng thay cho tham số truyền vào
        // gọi hàm và hứng giá trị trả về
        System.out.println("total " + total);
    }

    public static void showHello() {
        System.out.println("Hello world");
    }

    public static int getTotal(int a, int b) { // a, b: Tham số truyền vào: là các biến giả định cho dữ liệu truyền vào
        int sum = a + b;
        return sum;
    }
}