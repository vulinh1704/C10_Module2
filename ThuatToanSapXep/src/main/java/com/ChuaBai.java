package com;

public class ChuaBai {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 84, 3, 4, 6, 81};
        int[] numbers2 = {2, 84, -2, 1, 0, 3};

        int[] arrMin = {};
        int[] arrMax = {};
        if (numbers.length < numbers2.length) {
            arrMin = numbers;
            arrMax = numbers2;
        } else {
            arrMin = numbers2;
            arrMax = numbers;
        }

        for (int i = 0; i < arrMin.length; i++) {
            for (int j = 0; j < arrMax.length; j++) {
                if (arrMin[i] == arrMax[j]) {
                    System.out.println(arrMin[i]);
                }
            }
        }

        // Quy luật
        // Vẽ step ra giấy, draw.io
        // Lần mò viết code các step
        // Viết logic
        // Tối ưu code
//        for (int i = 1; i < numbers.length; i++) {
//            boolean isMax = true;
//            int numberCheck = numbers[i];
//            for (int j = i - 1; j >= 0 ; j--) {
//                if(numbers[j] > numberCheck) {
//                    isMax = false;
//                    break;
//                }
//            }
//            if(isMax) {
//                System.out.println("Index: " + i + " - Value: " + numberCheck);
//            }
//        }

//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] % 2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }
        //
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] < 0) {
//                System.out.println(numbers[i]);
//            }
//        }

    }
}
