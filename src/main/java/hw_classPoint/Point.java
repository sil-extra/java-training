/**Класс Point
 Создайте класс Point с координатами x и y.
 Реализуйте конструктор, геттеры, сеттер только для x, и метод print(), выводящий координаты.
 В main измените x, выведите новые координаты.
 */
package hw_classPoint;

public class Point {
    double x;
    double y;

    Point(double someX, double someY){
        this.x = someX;
        this.y = someY;
    }

    double getX(){
        return this.x;
    }

    double getY(){
        return this.y;
    }

    void setX(double newX){
        this.x = newX;
    }

    void print(){
        System.out.println("X coordinate is " + this.x);
        System.out.println("Y coordinate is " + this.y);
    }
}
