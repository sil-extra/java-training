/** Класс Product
 Создайте класс Product с полями name и price.
 Реализуйте конструктор, геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки,
 и метод printInfo(), выводящий информацию о товаре и цене.
 В main измените цену, примените скидку и выведите цену.
 */
package hw_classProduct;

public class Main {
    public static void main(String[] args){
        Product product = new Product("Milk", 100.0);

        product.setPrice(90.9);

        product.applyDiscount(10);

        product.printInfo();
    }
}
