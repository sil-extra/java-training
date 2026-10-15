/** Класс Circle
 Создайте класс Circle с полем radius.
 Реализуйте конструктор, геттер и сеттер, методы calculateArea() и calculateCircumference().
 В main измените радиус, выведите площадь и длину окружности.
 */
package hw_classCircle;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(12.8);

        circle.setRadius(10.2);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());
    }
}
