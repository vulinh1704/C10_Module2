package service;

import database.CategoryDatabase;
import model.Category;

import java.util.List;

// Cứ chỗ nào đọc thì gọi get List để lấy data từ file.
// Cứ chỗ nào ảnh hưởng dữ liệu (Thêm mới, Sửa, Xóa) thì gọi saveData.
public class CategoryManager implements IManager<Category> {
    private List<Category> categories;

    public CategoryManager() {
        this.categories = CategoryDatabase.getList();
    }

    private int getCurrentId() {
        if (this.categories.isEmpty()) return 1;
        Category lastCate = this.categories.get(this.categories.size() - 1);
        return lastCate.getId() + 1;
    }

    @Override
    public void add(Category category) {
        category.setId(getCurrentId());
        this.categories.add(category);
        CategoryDatabase.saveData(categories);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, Category category) {

    }

    public Category findById(int id) {
        this.categories = CategoryDatabase.getList();
        for (Category c : categories) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Category> getAll() {
        this.categories = CategoryDatabase.getList();
        return this.categories;
    }
}
