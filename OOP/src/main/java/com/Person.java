package com;

// Tên class được public thì sẽ trùng với tên file
public class Person { // là 1 khuôn mẫu của các đối tượng con người
    public int id; // Các thuộc tính: là đặc điểm của các đối tượng
    public int age; // ~ là các biến của lớp, biến toàn cục
    public String name = "Person";
    // Các thuộc tính khi khởi tạo luôn có giá trị mặc định: String ~ null, int ~ 0, ...

    // Hàm tạo: sử dụng tạo các đối tượng, đưa các giá trị của đối tượng vào để gàn cho các thuộc tính
    public Person(int idInput, int ageInput, String nameInput) { // hàm tạo trùng tên lớp
        this.id = idInput;
        this.age = ageInput;
        this.name = nameInput;
    }
    // Có thể khởi tạo nhiều hàm tạo
    // Nếu không khai báo hàm tạo nào thì mặc định sẽ có 1 hàm rỗng
    //    public Person() {
    //    }

    public void run() { // kà hành vi của các đối tượng
        System.out.println(this.name + " Person is running");
        // this: đại diện cho đối tượng đang sử dụng nó
    }

    public int getAge() {
        return this.age;
    } // phương thức cho các đối tượng



} // Khai báo
