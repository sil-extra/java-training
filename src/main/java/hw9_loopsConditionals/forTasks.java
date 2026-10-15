package hw9_loopsConditionals;

import java.util.Scanner;

public class forTasks {
    public static void main(String[] args) {
        //method that prints out all numbers between 1 and 100 that can be divided by 3
        printNumbersDivisibleByThree();

        //method that calculate the sum of all numbers from 1 till n
        System.out.println(sumOfAllNumbers());

        //method that print multiplication table for the entered number
        printMultiplicationTable();

        //method that check if number is prime
        System.out.println(checkNumberIsPrime());

        //method that print to the console numbers from 1 to 10
        printNumbersFromOneToTen();
    }

    //    1. Вывод чисел от 1 до 100, делящихся на 3
//    Задача:
//    Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
//    Методы и конструкции:
//            for
//    оператор %
//            if
//            System.out.println()
    public static void printNumbersDivisibleByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //
//    2. Сумма чисел от 1 до n
//    Задача:
//    Реализуйте программу, которая принимает с консоли число n и вычисляет сумму всех чисел от 1 до n.
//    Методы и конструкции:
//    Scanner
//      for
//    переменная int sum = 0
//      System.out.println()
    public static String sumOfAllNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = scanner.nextLine();

        int n;
        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer";
        }

        if (n <= 0) {
            return "Error: number must be positive";
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "The sum of numbers from 1 to " + n + " is equal to " + sum;
    }

    //    3. Таблица умножения для числа
//    Задача:
//    Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.
//    Методы и конструкции:
//    Scanner
//    for
//    System.out.println()
//    арифметические операторы
    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = scanner.nextLine();

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: entered value is not an integer.");
            return;
        }

        System.out.println("The multiplication table for " + number);
        int product;
        for (int i = 1; i < 10; i++) {
            product = number * i;
            System.out.println(number + " X " + i + " = " + product);
        }
    }

    //    4. Проверка на простое число
//    Задача:
//    Напишите программу, которая проверяет, является ли введённое число простым.
//    Простое число делится только на 1 и на само себя.
//    Методы и конструкции:
//    Scanner
//      for
//        if-else
//    логическая переменная (boolean isPrime = true)
//      System.out.println()
    public static String checkNumberIsPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is prime: ");
        String input = scanner.nextLine();

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer.";
        }

        boolean isPrime = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return "The number " + number + " is prime: " + isPrime;
    }

//    5. Вывод чисел от 1 до 10
//    Задача:
//    Напишите программу, которая выводит числа от 1 до 10 на экран.
//    Методы и конструкции:
//            for
//            System.out.println()
    public static void printNumbersFromOneToTen() {
        System.out.println("Numbers from 1 to 10 include: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
