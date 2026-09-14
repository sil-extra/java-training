//1. Напишите класс MathOperations
//Условие:
//Создайте класс MathOperations с методами:
//add(int x, int y) — возвращает сумму двух чисел
//subtract(int x, int y) — разницу
//multiply(int x, int y) — произведение
//divide(int x, int y) — результат деления в double
//В main вызовите каждый метод с произвольными числами и выведите результат.

public class MathOperations {
    public static void main(String[] args){
        int sum = add(3, 4);
        System.out.println(sum);

        int subtraction = subtract(3, 4);
        System.out.println(subtraction);

        int multiplication = multiply(3, 4);
        System.out.println(multiplication);

        double division = divide(3, 4);
        System.out.println(division);

        int max = findMax(300, 301);
        System.out.println(max);

        int abs = difference(3, 4);
        System.out.println(abs);

        int sqrAr = squareArea(5);
        System.out.println(sqrAr);

        int sqrPerim = squarePerimeter(3);
        System.out.println(sqrPerim);

        double minutes = convertSecondsToMinutes(125);
        System.out.println(minutes);

        double speed1 = averageSpeed(120.5, 30.5);
        System.out.println(speed1);

        double speed2 = averageSpeed(100, 10);
        System.out.println(speed2);

        double hypo = findHypotenuse(2.5, 3.7);
        System.out.println(hypo);

        double hypo2 = findHypotenuse(20.5, 1.35);
        System.out.println(hypo2);

        double circle = circleCircumference(5.6);
        System.out.println(circle);

        double circle2 = circleCircumference(10);
        System.out.println(circle2);

        double percentage = calculatePercentage(200, 25);
        System.out.println(percentage);

        double fahrenheit = celsiusToFahrenheit(12.6);
        System.out.println(fahrenheit);

        double celsius = fahrenheitToCelsius(54.68);
        System.out.println(celsius);
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide(int x, int y){
        return (double) x / y;
    }

    //2. Реализуйте метод для нахождения максимума двух чисел
//Условие:
//Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
//Вызовите метод в main и выведите результат.
    public static int findMax(int a, int b){
        return Math.max(a, b);
    }

    //3. Метод для нахождения разницы между двумя числами
//Условие:
//Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
//Проверьте метод в main.
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }

    //        4. Методы для площади и периметра квадрата
//Условие:
//Создайте два метода:
//squareArea(int side) — возвращает площадь квадрата
//squarePerimeter(int side) — возвращает периметр
//Вызовите оба метода в main с примером.
    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return side * 4;
    }

    //5. Метод для перевода секунд в минуты
//Условие:
//Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
//Вызовите метод в main и выведите результат.
    public static double convertSecondsToMinutes(int seconds){
        return seconds / 60.0;
    }


//6. Метод для вычисления средней скорости
//Условие:
//Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
//Вызовите метод с разными значениями.
    public static double averageSpeed(double distance, double time){
        return distance / time;
    }


//7. Метод для нахождения гипотенузы
//Условие:
//Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
//        √(a² + b²)
//Вызовите метод с несколькими наборами чисел.
    public static double findHypotenuse(double a, double b){
        return Math.sqrt((a * a) + (b * b));
    }


//        8. Метод для длины окружности
//Условие:
//Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
//Проверьте работу на нескольких значениях.
    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }


//9. Метод для вычисления процентов
//Условие:
//Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
//Пример: 25 из 200 → 12.5%
    public static double calculatePercentage(double total, double part){
        return (part / total) * 100.0;
    }


//        10. Методы перевода температуры
//Условие:
//Создайте два метода:
//celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
//fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
//Проверьте оба метода в main.
    public static double celsiusToFahrenheit(double c){
        return (c * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32.0) * 5.0 / 9.0;
    }
}














