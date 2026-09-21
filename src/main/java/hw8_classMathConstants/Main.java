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
        System.out.println(MathConstants.calculateCircleArea(2.5));
        System.out.println(MathConstants.calculateCircleArea(10.13));
        System.out.println(MathConstants.calculateCircumference(3.4));
        System.out.println(MathConstants.calculateCircumference(22.08));
    }
}
