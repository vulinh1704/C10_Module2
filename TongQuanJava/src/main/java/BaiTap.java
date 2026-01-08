import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        /*
        // Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không
        // code bài 1
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = input.nextInt();
        System.out.println("Nhập b: ");
        int b = input.nextInt();
        int c = a % b;
//        boolean coChiaHet = c == 0;
//        System.out.println("a chia hết cho b: " + coChiaHet);
        if (c == 0) { // thử cú pháp cấu trúc điều kiện
            System.out.println("a chia hết cho b");
        } else {
            System.out.println("a không chia hết cho b");
        }

         */

        // Bài 2


        /*
       Cài đặt chương trinh
       Viết 1 số đoạn code đơn giản
       + Tìm hiểu biến
       + Tìm hiểu về kiểu  dữ liệu
       + In/out (Nhập xuất dữ liệu)

         */

//       Servlet
        // Java Là ngôn ngữ lập trình hướng đối tượng
        // Js, C++ ngôn ngữ lập trình hướng sự kiện (code theo hướng đối tượng)
//        int (interger)

        /*
        // Khai báo nhiê biến
        int number1, number = 2;
        // int number1 = 1; // Không thể khai báo biến đã tồn tại;
        // Có thể dùng 2 ký tự đặc biệt để đặt tên $ _
        String $ = "Linh";
        System.out.println($);

        String _name = "Long"; // int name_of_class
        System.out.println(_name);

        // Nên đặt tên biến = tiếng Anh, camelCase
        String nameOfClass = "C10";
        String tenCuaLop = "C10";
        final double PI = 3.14; // (Hằng số)
        */

        int a = 10;
        // int b = ++a; // Tiền tố: Ưu tiên cộng trước và thực các phép khác sau
        int b = a++; // Hậu tố: Ưu tiên thực hiện cac phép khác trước và tăng sau;
//        System.out.println("b = " + b); // 10
//        System.out.println("a = " + a); // 11

//        for (int i = 0; i <= 10; i++) { // i = 1
//            System.out.println("i = " + i); // 0 1
//        }
//
//        boolean d = true;
//        if(a > b) { // giá trị trong điều kiện bắt buộc phải là boolean
//            System.out.println("Hi");
//        } else { // a <= b
//            System.out.println("Hello");
//        }

//        int diem = 100;
//        if(diem <= 100 && diem >= 80) {
//            System.out.println("Giỏi");
//        } else if(diem < 80 && diem >= 65) {
//            System.out.println("Khá");
//        } else if(diem >= 50 && diem < 65) {
//            System.out.println("Trung bình");
//        }

        int thu = 10;
        switch (thu) {
            case 1: // so sánh bằng: thu == 1 (2 == 1 => false)
                System.out.println("Chủ nhật");
                break;
            case 2: // (2 == 2 => true)
                System.out.println("Thu 2");
                // Nếu k có break thì nếu vào được case này thì sẽ chạy đến khi gặp break hoặc hết câu lệnh
                break;
            case 3:
                System.out.println("Thu 3");
                break;
            default:
                System.out.println("Không có");
        }

        switch (thu) {
            case 2:
            case 3:
            case 4:
                System.out.println("Ngày trong tuần");
                break;
            case 7:
            case 1:
                System.out.println("Cuối tuần");
                break;
            default:
                System.out.println("Khong co");
        }


    }
}
