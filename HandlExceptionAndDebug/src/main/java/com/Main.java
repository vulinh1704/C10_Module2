package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    String name;

    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        System.out.println("Start!");
        int c = a / b;
        System.out.println("Result: " + c);
        System.out.println("End");

//        Main m = null;
//        System.out.println(m.name);
//        System.out.println("End");

//        String number = "gkkdkd";
//        int n = Integer.parseInt(number);
//        System.out.println("n = " + n);

//        int[] arr = {1, 3, 34};
//        System.out.println(arr[5]);
    }

//    public static void readFile(){
//        FileReader fileReader = new FileReader("data.txt"); // Checked Exception
//    }
}

// Checked Exception: Là ngoại lệ mà trình biên dịch Java kiểm tra và yêu cầu xử lý
/*
Có 2 cách xử lý:
+ throws (Tiếp tục cảnh báo ném ngoại lệ)
+ Xử lý bằng khối try-catch
 */

// Unchecked Exceptions: Là các ngoại lệ có thể sinh ra trong quá trình chạy chương trình và trình biên dịch thì không kiểm tra
// Cách xử lý để tránh chết chương trình: Xử lý bằng khối try-catch