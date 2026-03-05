package com;

import java.util.Scanner;

public class TestRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        String email;
        while (true) {
            System.out.println("Enter your email: ");
            email = input.nextLine();
            if(email.matches(regex)) {
                break;
            } else {
                System.out.println("Wrong format!");
            }
        }
    }
}

// Nửa Buổi sau: demo luồng full (có thể có đăng ký đăng nhập) bài quản lý. Sau đó làm dự án cuối module.

