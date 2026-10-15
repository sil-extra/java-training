/** Класс Product
 Создайте класс Product с полями name и price.
 Реализуйте конструктор, геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки,
 и метод printInfo(), выводящий информацию о товаре и цене.
 В main измените цену, примените скидку и выведите цену.
 */
package hw_classProduct;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void applyDiscount(double discount){
        this.price -= this.price * (discount / 100.0);
    }

    void printInfo(){
        System.out.println("Product name is " + this.name);
        System.out.println("Product price is " + this.price);
    }
}
