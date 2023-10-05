package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void createOrder(){
        // Створюємо об'єкт кошика
        Cart cart = new Cart();

        // Створюємо об'єкти продуктів
        Product product1 = new Product(1, "Назва продукту 1", 100.0);
        Product product2 = new Product(2, "Назва продукту 2", 200.0);

        // Додаємо продукти до кошика
        cart.addProduct(product1);
        cart.addProduct(product2);

        Order order = new Order(cart.getProducts());

        // Отримуємо список продуктів у створеному замовленні
        List<Product> productsInOrder = order.getProducts();

        // Перевіряємо, чи замовлення містить усі продукти з кошика
        assertTrue(productsInOrder.contains(product1));
        assertTrue(productsInOrder.contains(product2));

        // Перевіряємо, чи статус замовлення є "В процесі"
        assertEquals("Processing", order.getStatus());
    }
    @Test
    void getStatus() {
        // Створюємо об'єкти продуктів
        Product product1 = new Product(1, "Назва продукту 1", 100.0);
        Product product2 = new Product(2, "Назва продукту 2", 200.0);
        Product product3 = new Product(3, "Назва продукту 3", 100.0);
        Product product4 = new Product(4, "Назва продукту 4", 200.0);

        // Створюємо об'єкти кошиків
        Cart cart1 = new Cart();
        cart1.addProduct(product1);
        cart1.addProduct(product2);

        Cart cart2 = new Cart();
        cart2.addProduct(product3);
        cart2.addProduct(product4);

        // Створюємо об'єкти замовлень з кошиків
        Order order1 = new Order(cart1.getProducts());
        Order order2 = new Order(cart2.getProducts());
        order2.setStatus("Completed");

        // Перевіряємо статуси замовлень
        assertEquals("Processing", order1.getStatus());
        assertEquals("Completed", order2.getStatus());
    }
}