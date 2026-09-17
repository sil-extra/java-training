/**
 * Класс Rectangle
 * Создайте класс Rectangle с полями width и height.
 * Реализуйте конструктор, геттеры для ширины и высоты, сеттер только для ширины и метод calculateArea() для расчёта площади.
 * В main создайте прямоугольник, измените ширину и выведите площадь. */
package hw_classRectangle;

public class Rectangle {
    double width;
    double height;

    Rectangle(double someWidth, double someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    double getWidth(){
        return this.width;
    }

    double getHeight(){
        return this.height;
    }

    void setWidth(double newWidth){
        this.width = newWidth;
    }

    double calculateArea(){
        return this.width * this.height;
    }
}
