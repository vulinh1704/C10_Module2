package database;

import model.Category;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDatabase {
    private static final File file = new File("data/category.csv");

    public static ArrayList<Category> getList() {
        ArrayList<Category> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] lineSplit = data.split(","); // ["1", "Ning", "123456"]
                int id = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                Category category = new Category(id, name);
                list.add(category);
            }
            return list;
        } catch (IOException e) {
            System.out.println("ReadAndWriteFile.getList.errorMessage: " + e.getMessage());
        }
        return list;
    }

    public static void saveData(List<Category> list) {
        try {
            String lines = "";
            for (Category s : list) {
                lines += s.getId() + "," + s.getName() + "\n";
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(lines);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("saveData: " + e.getMessage());
        }
    }
}
