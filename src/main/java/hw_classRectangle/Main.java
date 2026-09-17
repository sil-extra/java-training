/**
 * Класс Rectangle
 * Создайте класс Rectangle с полями width и height.
 * Реализуйте конструктор, геттеры для ширины и высоты, сеттер только для ширины и метод calculateArea() для расчёта площади.
 * В main создайте прямоугольник, измените ширину и выведите площадь. */
package hw_classRectangle;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10.5, 2.7);

        rectangle.setWidth(5.4);

        System.out.println(rectangle.calculateArea());
    }
}
