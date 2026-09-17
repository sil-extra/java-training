/**Класс Point
 Создайте класс Point с координатами x и y.
 Реализуйте конструктор, геттеры, сеттер только для x, и метод print(), выводящий координаты.
 В main измените x, выведите новые координаты.
 */
package hw_classPoint;

public class Main {
    public static void main(String[] args){
        Point point = new Point(2.5, 7.9);

        point.setX(10.1);

        point.print();
    }
}
