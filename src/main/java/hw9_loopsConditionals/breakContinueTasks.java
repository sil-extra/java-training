package hw9_loopsConditionals;

import java.util.Scanner;

public class breakContinueTasks {
    public static void main(String[] args) {
        //method to calculate sum of positive numbers
        System.out.println(sumOfNumbers());

        //method that print to the console numbers from 1 to 20 that are not divided by 3
        printNumbersNotDivisibleByThree();

        //method that prints to the console positive numbers
        printPositiveNumbers();

        //method that waits for stop command to finish execution
        waitForStop();
    }

//    1. Сумма чисел до первого отрицательного (использовать break)
//    Задача:
//    Напишите программу, которая запрашивает у пользователя числа и выводит их сумму.
//    Программа завершает выполнение, если пользователь вводит отрицательное число.
//    Методы и конструкции:
//    Scanner
//      while (true)
//      break
//      переменная sum
//      System.out.println()
    public static String sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter a positive number: ");
            String input = scanner.nextLine();
            int number;
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                return "Error: entered value is not an integer.";
            }

            if (number < 0) {
                break;
            }

            sum += number;
        }
        return "The sum of numbers is " + sum;
    }

//        2. Пропуск чисел, делящихся на 3 (использовать continue)
//    Задача:
//    Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3.
//    Методы и конструкции:
//            for
//            if, оператор %
//            continue
//            System.out.println()
    public static void printNumbersNotDivisibleByThree() {
        System.out.println("Numbers which are not divisible by 3 include: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

//            3. Вывод только положительных чисел (использовать continue)
//    Задача:
//    Напишите программу, которая принимает ряд чисел от пользователя и выводит только положительные.
//    Отрицательные числа нужно пропускать.
//    Методы и конструкции:
//      Scanner
//      while или do-while
//      if, continue
//      System.out.println()
    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");

        while (true) {
            String input = scanner.nextLine();
            double number;
            try {
                number = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: entered value is not a number.");
                break;
            }

            if (number <= 0) {
                continue;
            }

            System.out.println(number + " is a positive number!");
        }

    }

//            4. Ввод строк до команды "stop" (использовать break)
//    Задача:
//    Программа должна запрашивать строки у пользователя и завершаться только тогда, когда введена команда "stop".
//    Методы и конструкции:
//    Scanner
//      while (true)
//        метод .equals("stop")
//        break
//        System.out.println()
    public static void waitForStop() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }
        }
        System.out.println("Program execution is finished!");
    }
}
