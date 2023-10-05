package org.example;

import java.util.ArrayList;
import java.util.List;

// Клас Product для представлення продукту
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Клас Cart для представлення кошика користувача
class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void clearCart() {
        products.clear();
    }
}

// Клас Order для представлення замовлення користувача
class Order {
    private static int orderIdCounter = 1;
    private int orderId;
    private List<Product> products;
    private String status;

    public Order(List<Product> products) {
        this.orderId = orderIdCounter++;
        this.products = products;
        this.status = "Processing"; // Замовлення починається зі статусом "Обробка"
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}