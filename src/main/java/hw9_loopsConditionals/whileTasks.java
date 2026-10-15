package hw9_loopsConditionals;

import java.util.Scanner;

public class whileTasks {
    public static void main(String[] args) {
        //method that calculate factorial
        System.out.println(calculateFactorial());

        //method to print even numbers
        printEvenNumbers();

        //method to print positive numbers
        printCountdown();
    }

//    1. Вычисление факториала с помощью while
//    Задача:
//    Напишите программу, которая принимает с консоли число и выводит его факториал (произведение всех чисел от 1 до n),
//    используя цикл while.
//    Методы и конструкции:
//    Scanner
//      while
//    переменные int result = 1, int i = 1
//      System.out.println()
    public static String calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        String input = scanner.nextLine();

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer.";
        }

        if(number < 1) {
            return "Error: number must be greater than or equal to 1.";
        }

        int result = 1;
        int i = 1;
        while (i <= number){
            result *= i;
            i++;
        }
        return "The factorial of " + number + " is equal to " + result;
    }

//    2. Вывод всех чётных чисел до заданного
//    Задача:
//    Реализуйте программу, которая выводит все чётные числа от 1 до числа, введённого пользователем.
//    Методы и конструкции:
//    Scanner
//      while
//      if, оператор %
//      System.out.println()
//
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        String input = scanner.nextLine();

        int number = 1;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: entered value is not an integer.");
            return;
        }

        if (number < 1) {
            System.out.println("Error: entered number must be positive.");
            return;
        }

        int i = 1;
        System.out.println("The even numbers between 1 and " + number + " include: ");
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

//    3. Обратный отсчёт от введённого числа до 1
//    Задача:
//    Создайте программу, которая принимает с консоли положительное число и выводит обратный отсчёт от него до 1.
//    Методы и конструкции:
//    Scanner
//      while
//      System.out.println()
//    декремент number--
    public static void printCountdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        String input = scanner.nextLine();

        int number = 1;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: entered value is not an integer.");
            return;
        }

        if (number < 1) {
            System.out.println("Error: number must be greater than or equal to 1.");
            return;
        }

        System.out.println("The countdown from " + number + " to 1: ");
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
