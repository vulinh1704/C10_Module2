package com;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data;
        while ((data = bufferedReader.readLine()) != null) {
            System.out.println(data);
        }
        /*
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello, I'm Ning Buffered\n");
        bufferedWriter.write("Hi, I'm Long");
        bufferedWriter.close();
        */

        /*
        File file = new File("data.txt"); // File: CRUD file (chứ không can thiệp được dữ liệu trong file)
        System.out.println("File path: " + file.getAbsolutePath()); // lấy ra đường dẫn tuyệt đối
        System.out.println("Last Modified: "+ new Date(file.lastModified())); // kiểm tra lần sửa gần nhật
        file.createNewFile(); // tạo file
        file.delete(); // xóa file
        System.out.println("Is exists: " + file.exists()); // kiểm tra xem file có tồn tại hay không
        File folder = new File("data_folder");
        folder.mkdirs(); // tạo folder
        */
    }
}

/*
Cho 1 mảng Student (id, name, age).
1. Thực hiện lưu dữ liệu danh sách sinh viên vào file data.csv
2. Đọc danh sách sinh viên được lưu và in màn hình.
*/

