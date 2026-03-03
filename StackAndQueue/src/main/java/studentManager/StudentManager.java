package studentManager;

import java.util.ArrayList;

// Cứ chỗ nào đọc thì gọi get List để lấy data từ file.
// Cứ chỗ nào ảnh hưởng dữ liệu (Thêm mới, Sửa, Xóa) thì gọi saveData.
public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = ReadAndWriteFile.getList();
    }

    public void add(Student student) {
        this.students.add(student); // có phần tử mới
        ReadAndWriteFile.saveData(this.students); // save
    }

    public ArrayList<Student> getAll() {
        return ReadAndWriteFile.getList();
    }

    public void update(int id, Student student) {
        int index = this.getIndexById(id);
        this.students.set(index, student);
        ReadAndWriteFile.saveData(this.students);
    }

    public Student getById(int id) {
        int index = this.getIndexById(id);
        return this.students.get(index);
    }

    public void remove(int id) {
        int index = this.getIndexById(id);
        this.students.remove(index);
        ReadAndWriteFile.saveData(this.students);
    }

    public int getIndexById(int id) {
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            if (id == student.getId()) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Student> getByNameContains(String keywork) {
        ArrayList<Student> listFined = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().contains(keywork)) {
                listFined.add(s);
            }
        }
        return listFined;
    }
}
