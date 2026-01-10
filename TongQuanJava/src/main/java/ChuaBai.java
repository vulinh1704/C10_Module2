import java.util.Scanner;

public class ChuaBai {

    public static void main(String[] args) {
        /*
        // Bai 1: Chuyen tu do C => do F
        Scanner input = new Scanner(System.in);
        System.out.println("Vui long nhap do C: ");
        double doC = input.nextDouble();
        //  °C  x  9/5 + 32 = °F
        double doF = doC * 9/5 + 32;
        System.out.println("=> Do F: " +  doF);
         */

        // Tim so lon nhat trong 3 so
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = input.nextInt();
        System.out.println("Nhap b: ");
        int b = input.nextInt();
        System.out.println("Nhap c: ");
        int c = input.nextInt();
        /*
        if(a >= b) {
            if (a >= c) {
                System.out.println("Max = " + a);
            }
        } else if (a >= c) {
            if()
        }
         */
        int max = a; // max = 3
        if(max < b) { // 3 < 4 (true)
            max = b; // max = 4
        }
        if(max < c) { // 4 < 1 (false)
            max = c;
        }
        System.out.println("Max = " + max);
//        System.out.printf(max, );
        double balance = 12345.6789;
        System.out.printf("Your balance is $%,.2f.%n", balance);
        System.out.print("He");



//        int a = 5; int b = 7; int c = a++ + ++b;
        // c = 5 + 8 = 13
        // a = 6
        // b = 8
    }
}
