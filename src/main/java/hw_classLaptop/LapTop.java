/** Класс Laptop
 Создайте класс Laptop с полями brand и price.
 Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о ноутбуке и его цене.
 В main измените цену и выведите информацию.
 */
package hw_classLaptop;

public class LapTop {
    String brand;
    double price;

    LapTop(String someBrand, double somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    String getBrand(){
        return this.brand;
    }

    double getPrice(){
        return this.price;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void printInfo(){
        System.out.println("Laptop brand is " + this.brand);
        System.out.println("Laptop price is " + this.price);
    }
}
