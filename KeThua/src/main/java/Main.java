public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Micky", 2, "Den");
//        System.out.println(dog.getName());
        System.out.println(dog.name);
        dog.eat();
        System.out.println(dog.mauLong);
        dog.bark();

        Animal a = new Dog("Micky", 2, "Vang");
//      kiểu khai báo    Kiểu thực tế
//      Kiểu dữ liệu class tham chiếu đến đối tượng class con
        a.eat();
    }
}

/*
- Nạp chồng (Overload): là các phương thức trong cùng 1 class,
cùng tên, khác tham số truyền vào.
- Thể hiện đa hình lúc compile.
*/

/*
- Ghi đè phương thức(Override): là ca phương thức xảy ra trong
mối quan hệ kế thừa, cùng tên, cùng tham số truyền vào,
cùng giá trị trả về, nằm ở 2 class khác nhau và có thể
khác chi tiết triển khai
- Ghi đè phương thức là đa hình lúc runtime
*/


/*
- Khi extends lớp con sẽ kế thừa tất cả thành phần dữ liệu từ class
cha (trong phạm vi truy cập)
- Lớp con có thể khai báo thêm thuộc tính và phương thức mới.
- Constructor thì không thể kế thừa nhưng có thể gọi constructor
của lớp cha (super())
 */


