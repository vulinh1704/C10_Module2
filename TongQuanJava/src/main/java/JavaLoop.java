import java.util.Scanner;

public class JavaLoop {
    /*
    for
    while
    do...while
     */
    public static void main(String[] args) {
//        for(int i = 1; i <= 5; i++) { // khởi tạo i = 1 => B2: i <- 5 (6 <= 5: false); Bước 4: Tăng biến đếm i = 1 -> 3
//            System.out.println("Hoc module " + i); // B3: thưc thi khối lệnh
//        }
//        System.out.println("End ");
        /*
        int i = 1;
        for(;i <= 5;) {
            System.out.println("haha");
            i++;
        }
         */

//        int i = 1;
//        while (i <= 5) { // VÒng lặp while chỉ quan tâm đk lặp true thì chạy, false thì dừng
//            System.out.println("Hoc module " + i);
//            i++;
//        }

       /*
        int i = 1;
        do {
            System.out.println("Hoc module: " + i);
            i++; // 2
        } while (i > 5); // 2 > 5: false
        // Vòng lặp do...while => LÀM gì đó KHI <điều kiện>
        // Vòng lặp do while sẽ thực hiện ít nhất 1 lần <Khoi lenh thuc thi>

        // Cho người dùng nhập 1 số, đến khi nhập 0 thì kết thúc chương trình còn nếu nhập các số khác thì bắt nhập lại. (Bai Menu)
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("==== Menu ==========\n1.Them moi\n2.Hien thi\n0.Thoat");
            // code xử lý cho option 1 và 2
            System.out.println("Nhập lua chon: ");
            choice = input.nextInt();
        } while (choice != 0);
        System.out.println("End");
        */

//         Cú pháp viết nhanh: fori + tab
        // Ctr + /: Comment Code

        // break: khi gặp break vòng lặp bọc ngoài nó lập tức dừng lại
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//            if(i == 5) {
//                break;
//            }
//        }
        // continue: Khi gặp từ khóa này nó sẽ bỏ qua đoạn code thực thi bên dưới của lần lặp hiện tại
//        for (int i = 1; i < 10; i++) {
//            if(i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        for (int i = 1; i <= 10; i++) { //
            System.out.println("======> I = " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println("J = " + j); // j = 1
            }
            break;
        }

    }
}
