package com.example.productmanagementthymeleaf.service;

import com.example.productmanagementthymeleaf.model.Product;

import java.util.*;

public class ProductService implements IProductService {

    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Pen", 1.5, "A smooth writing pen", "StationeryCo"));
        products.put(2, new Product(2, "Notebook", 3.0, "A 100-page lined notebook", "PaperWorld"));
        products.put(3, new Product(3, "Laptop", 750.0, "15-inch display with 8GB RAM", "TechMasters"));
        products.put(4, new Product(4, "Smartphone", 500.0, "64GB storage, 12MP camera", "MobileWorks"));
        products.put(5, new Product(5, "Headphones", 50.0, "Noise-cancelling over-ear headphones", "AudioGear"));
        products.put(6, new Product(6, "Water Bottle", 10.0, "1L stainless steel water bottle", "HydroLife"));
        products.put(7, new Product(7, "Backpack", 30.0, "Water-resistant 20L backpack", "CarryAll"));
        products.put(8, new Product(8, "Chair", 45.0, "Ergonomic office chair", "ComfortSeating"));
        products.put(9, new Product(9, "Mouse", 15.0, "Wireless optical mouse", "TechMasters"));
        products.put(10, new Product(10, "Keyboard", 25.0, "Mechanical keyboard with RGB lighting", "KeyPro"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
