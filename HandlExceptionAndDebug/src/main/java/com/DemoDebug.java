package com;

public class DemoDebug {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = {1, 4, 5, 3};
        int c = 0;
        for (int i = 0; i < 10; i++) {
            c += a + b;
            System.out.println("i: " + i + "c: " + c);
            showData(c);
        }
        System.out.println(c);
    }

    static void showData(int data) {
        int c = 10;
        System.out.println("Data: " + data);
        System.out.println("Data increment 10: " + data + c);
    }
}
