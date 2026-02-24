package studentManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentManager {
    private ArrayList<Student> students;

    private Map<Integer, Student> studentMap;

    public StudentManager() {
        this.students = new ArrayList<>();
        this.studentMap = new HashMap<>();
    }

    public void add(Student student) {
//        this.students.add(student);
        this.studentMap.put(student.getId(), student);
    }

    public ArrayList<Student> getAll() {
//        return this.students;
        ArrayList<Student> list = new ArrayList<>();
        Set<Integer> keys = this.studentMap.keySet();
        for (Integer k : keys) {
            list.add(this.studentMap.get(k));
        }
        return list;
    }

    public void update(int id, Student student) {
//        int index = this.getIndexById(id);
//        this.students.set(index, student);
        this.studentMap.replace(id, student);
    }

    public Student getById(int id) {
//        int index = this.getIndexById(id);
//        return this.students.get(index);
        return this.studentMap.get(id);
    }

    public void remove(int id) {
//        int index = this.getIndexById(id);
//        this.students.remove(index);
        this.studentMap.remove(id);
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
