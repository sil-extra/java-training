/**
 * Класс MathConstants
 * Создайте класс MathConstants с полями:
 * final double PI = 3.14159
 * final double E = 2.71828
 * Реализуйте статические методы calculateCircleArea(double r) — площадь круга
 * и calculateCircumference(double r) — длина окружности. В main: вызовите методы с разными значениями радиуса.
 * calculateExponentialGrowth(double initialValue, double rate, double time) — расчет по формуле экспоненциального роста:
 * */
package hw8_classMathConstants;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle1 Area is " + MathConstants.calculateCircleArea(2.5));
        System.out.println("Circle2 Area is " + MathConstants.calculateCircleArea(10.13));
        System.out.println("Circle3 Circumference is " + MathConstants.calculateCircumference(3.4));
        System.out.println("Circle4 Circumference is " + MathConstants.calculateCircumference(22.08));
        System.out.println("Exponential growth1 is " + MathConstants.calculateExponentialGrowth(10.25, 0.75,2.45));
        System.out.println("Exponential growth2 is " + MathConstants.calculateExponentialGrowth(8.3, 1.5,5.25));
    }
}
