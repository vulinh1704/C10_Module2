package com;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student(5, "Đức", 20));
//
//        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//        readAndWriteFile.saveData(students);

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<Student> list = readAndWriteFile.getList();
        for (Student s: list) {
            System.out.println("Id: " + s.getId() + ", Name: " + s.getName() + ", Age: " + s.getAge());
        }
    }
}
