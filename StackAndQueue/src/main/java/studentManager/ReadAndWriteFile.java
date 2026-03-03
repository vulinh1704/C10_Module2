package studentManager;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    private static final File file = new File("data.csv");

    public static ArrayList<Student> getList() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Mục tiêu: đọc các dòng data và thêm array để trả về
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] lineSplit = data.split(","); // ["1", "Ning", "20"]
                int id = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                String gender = lineSplit[2];
                Student student = new Student(id, name, gender);
                list.add(student);
            }
            return list;
        } catch (IOException e) {
            System.out.println("ReadAndWriteFile.getList.errorMessage: " + e.getMessage());
        }
        return list;
    }

    public static void saveData(ArrayList<Student> list) {
        try {
            String lines = "";
            for (Student s : list) {
                lines += s.getId() + "," + s.getName() + "," + s.getGender() + "\n";
            } // thêm data mới dựa trên list
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(lines); // viết vào file
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("saveData: " + e.getMessage());
        }
    }

    private static String getOldData() {
        String lines = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                lines += data + "\n";
            }
            return lines;
        } catch (IOException e) {
            System.out.println("getOldData: " + e.getMessage());
        }
        return lines;
    }
}

/*
 Thực hiện quản lý Product (id, name, price) có xử lý ngoại lệ (try-catch)
 và đọc ghi dữ liệu vào file.
 + Các chức năng: CRUD
 + Tìm theo khoảng giá.
 + Tìm theo tên gần đúng.
 */
