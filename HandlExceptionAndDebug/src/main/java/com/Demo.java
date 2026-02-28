package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try {
            findById(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        Scanner input = new Scanner(System.in);
//
//        try {
//            System.out.println("Enter a: ");
//            int a = input.nextInt();
//            System.out.println("Enter b: ");
//            int b = input.nextInt();
//            int c = a / b;
//            System.out.println("Result: " + c);
//        } catch (ArithmeticException a) {
//            System.out.println("Bi loi " + a.getMessage());
//        } catch (InputMismatchException i) {
//            System.out.println("Loi format");
//        } catch (Exception e) {
//            System.out.println("Bi loi: " + e.getMessage());
//        } finally {
//            System.out.println("Finally!");
//        }
//        System.out.println("End!");

    }

    public static void findById(int id){ // throws: khi báo cùng tên hàm, có nhiệm vụ cảnh báo những ngoại lệ có thể ném
        int[] ids = {1, 4, 10};
        for (int i = 0; i < ids.length; i++) {
            if (id == ids[i]) {
                System.out.println("Index: " + i);
                return;
            }
        }
        throw new RuntimeException("Data not found"); // throw: ném 1 ngoại lệ cụ thể, sử dụng trong hàm
    }
}

// Khi xử lý khối try catch nên bắt các lỗi con trước và để Exception ở cuối
// Luôn luôn phải có code trong khối catch, ít nhất là sout tránh giấu bug.
// finally: Dù tung ra ngoại lệ hay không thì khối finally luôn chạy. Thường được sử dụng để đóng các connection (file, database,...)