package com;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    private File file = new File("data.csv");

    public ArrayList<Student> getList() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Mục tiêu: đọc các dòng data và thêm array để trả về
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] lineSpit = data.split(","); // ["1", "Ning", "20"]
                int id = Integer.parseInt(lineSpit[0]);
                String name = lineSpit[1];
                int age = Integer.parseInt(lineSpit[2]);
                Student student = new Student(id, name, age);
                list.add(student);
            }
            return list;
        } catch (IOException e) {
            System.out.println("ReadAndWriteFile.getList.errorMessage: " + e.getMessage());
        }
        return list;
    }

    public void saveData(ArrayList<Student> list) {
        try {
            String lines = this.getOldData(); // lấy ra danh sách data cũ
            for (Student s : list) {
                lines += s.getId() + "," + s.getName() + "," + s.getAge() + "\n";
            } // thêm data mới dựa trên list
            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(lines); // viết vào file
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("saveData: " + e.getMessage());
        }
    }

    private String getOldData() {
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
