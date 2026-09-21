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

public class MathConstants {
    static final double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

    double calculateExponentialGrowth(double initialValue, double rate, double time) {
        return initialValue * Math.pow(E, rate * time);
    }
}
