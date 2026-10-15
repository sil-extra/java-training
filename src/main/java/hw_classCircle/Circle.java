/** Класс Circle
 Создайте класс Circle с полем radius.
 Реализуйте конструктор, геттер и сеттер, методы calculateArea() и calculateCircumference().
 В main измените радиус, выведите площадь и длину окружности.
 */
package hw_classCircle;

public class Circle {
    double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }

    double calculateCircumference(){
        return 2 * Math.PI * this.radius;
    }
}
