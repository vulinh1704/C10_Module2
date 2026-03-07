package service;

import database.ProductDatabase;
import model.Product;

import java.util.List;

public class ProductManager implements IManager<Product> {
    private List<Product> products;

    public ProductManager() {
        this.products = ProductDatabase.getList();
    }

    private int getCurrentId() {
        if (this.products.isEmpty()) return 1;
        Product lastCate = this.products.get(this.products.size() - 1);
        return lastCate.getId() + 1;
    }

    @Override
    public void add(Product product) {
        product.setId(getCurrentId());
        this.products.add(product);
        ProductDatabase.saveData(products);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public List<Product> getAll() {
        this.products = ProductDatabase.getList();
        return this.products;
    }
}
