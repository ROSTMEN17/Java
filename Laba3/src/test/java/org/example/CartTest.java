package org.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @org.junit.jupiter.api.Test
    void addProduct() {
        // Створюємо об'єкт кошика
        Cart cart = new Cart();

        // Створюємо об'єкт продукту, який будемо додавати
        Product product = new Product(1, "Назва продукту", 100.0);

        // Додаємо продукт до кошика
        cart.addProduct(product);

        // Отримуємо список продуктів у кошику
        List<Product> productsInCart = cart.getProducts();

        // Перевіряємо, чи в кошику є доданий продукт
        assertTrue(productsInCart.contains(product));
    }

    @org.junit.jupiter.api.Test
    void removeProduct() {
        // Створюємо об'єкт кошика
        Cart cart = new Cart();

        // Створюємо об'єкт продукту, який будемо додавати та видаляти
        Product product = new Product(1, "Назва продукту", 100.0);

        // Додаємо продукт до кошика
        cart.addProduct(product);

        // Видаляємо продукт з кошика
        cart.removeProduct(product);

        // Отримуємо список продуктів у кошику
        List<Product> productsInCart = cart.getProducts();

        // Перевіряємо, чи продукт був успішно видалений з кошика
        assertFalse(productsInCart.contains(product));
    }
}