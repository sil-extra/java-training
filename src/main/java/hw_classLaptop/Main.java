/** Класс Laptop
 Создайте класс Laptop с полями brand и price.
 Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о ноутбуке и его цене.
 В main измените цену и выведите информацию.
 */
package hw_classLaptop;

public class Main {
    public static void main(String[] args){
       LapTop lapTop = new LapTop("Lenovo", 500.0);

       lapTop.setPrice(490.5);

       lapTop.printInfo();
    }
}
