public class ChuaBaiLap {
    public static void main(String[] args) {
        /*
        // Hiển thị 20 số nguyên tố đầu tiên
        // Số nguyên tố là các sô CHỈ chia hết được 1 và chính nó (chỉ có 2 ước): 2, 3, 5, 7, 11, 13, ...
        // Kiểm tra 1 số xem có phải số nguyên tố hay k => Hiển thị 20 số nguyên tố đầu tiên

        int number = 1;
        int countPrime = 0;
        System.out.println("20 so nguyen to dau tien: ");
        while (countPrime < 20) {
            // Kieu tra number co phai snt hay k
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if(number % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(number);
                countPrime++; // neu la so nguyen to tang countPrime
            }
            number++;
        }

         */

        // Hien thi hinh
//        for (int i = 1; i <= 5; i++) { // i = 2
//            for (int j = 1; j <= i; j++) { // j = 2 ; 2 <= 1 (false)
//                System.out.print("* "); // * *
//            }
//            System.out.print("\n");
//        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
