import java.util.Scanner;

public class Demo { // Tên file trun tên class
    // psvm + tab: cú pháp tạo hàm để chạy chương trình
    // main + tab
    public static void main(String[] args) {
        System.out.println("Hello C10"); // sout + tab
        // code ở đây

        // Biến, Kiểu dữ liệu, Toán tử, Cấu trúc điều kiện, Vòng Lặp, Hàm (Function, Method)
        // let a = 1; Js
        // a = "Linh"

        // Biến: Là tên gọi của 1 vùng nhớ chứa dữ liệu
        // java rất chi tiết
        /*
        Khai báo 1 biến trong Java:
        <kieu_du_lieu> <ten_bien> = <giá_tri>;
         */
        // Số (Number): số nguyên (integer - int, long, byte, short), số thực (double, float)
        float k = 5.3f;
        double h2 = 5.4;
        // Chuỗi (String)
        String st = "Hello";
        // Ký tự (Character - char)
        char l = 'K';
        // Logic (Boolean)
        boolean isGood = true;
        int a;
        a = 3;
        double c = 3.4;
        String name = "Linh"; // chuỗi trong Java: ""
        char d = 'c'; // kiểu ký tự
        boolean isSick = true; // 2 loại giá trị true or false

        // Toán tử: là các ký hiệu cho phép tương tác với giá trị của các biến:
        /*
        Toán tử gán: =  +=  -=  *=  /=  %=
        Toán tử toán học: +  -  *  /  %  ++  --
        Toán tử so sánh: ==  >  <  >=  <=  != (Luôn luôn trả lại giá trị boolean)
        Toán tử logic: &&  ||  ! (trả lại giá trị boolean => sử dụng cho cấu trúc điều kiện)
         */
        int f = 10;
        f %= 2; // <=> f = 10 % 2
        System.out.println("f = " + f); // f = 0

        boolean g = 5 > 3;
        System.out.println("5 > 3: " + g);

        int diem = 6;
        boolean i = diem < 10 && diem >= 5; // trick: khi sử dụng && chỉ cần 1 vế false => trả về false;
        System.out.println("i = " + i); // false

        boolean isPassCase = false;
        boolean h = diem >= 5 || isPassCase; // trick: khi sử dụng || chỉ cần 1 vế là true => trả về true;
        System.out.println("Qua module: " + h); // false

        // Kiểu hỗ trợ cho nhập xuất dữ liệu
        Scanner input = new Scanner(System.in); // System.in: đại diện cho dữ liệu lầy từ bàn phím;
//        System.out.println("Vui long nhap ten: ");
//        String fullName = input.nextLine(); // nextLine(): Hàm cho phép nhập chuỗi
//        System.out.println("Full Name: " + fullName);
        System.out.println("Nhập tuổi của bạn: ");
        int age = input.nextInt(); // nhập số nguyên
        System.out.println("Tuổi của bạn là: " + age);

        // Ctrl + Space: Bật gợi ý
    }

// Sắp xếp code: Ctrl + Alt + L
}
