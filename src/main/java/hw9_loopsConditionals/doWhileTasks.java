package hw9_loopsConditionals;

import java.util.Scanner;

public class doWhileTasks {
    public static void main(String[] args) {
        //method to find a positive number
        System.out.println(findPositiveNumber());

        //method to check password
        System.out.println(checkPassword());

        //method to print to the console numbers from 1 to 10
        printNumbersFromOneToTen();

        //method that wait for exit command to finish execution
        System.out.println(waitForExitCommand());

        //method that counts number of digits
        System.out.println(countDigitsInNumber());
    }
//         1. Запрос положительного числа
//    Задача:
//    Напишите программу, которая запрашивает у пользователя число и продолжает спрашивать,
//    пока оно не станет положительным.
//    Методы и конструкции:
//    Scanner
//      do-while
//      System.out.println()
//      условие number <= 0
    public static String findPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a positive number: ");
            String input = scanner.nextLine();
            number = Integer.parseInt(input);
        } while (number <= 0);
        return number + " is a positive number.";
    }

//         2. Проверка пароля
//    Задача:
//    Реализуйте программу, которая запрашивает у пользователя пароль,
//    пока он не введёт верный (пароль заранее задан в коде).
//    Методы и конструкции:
//    Scanner
//      do-while
//       метод .equals() для строк
//      System.out.println()
    public static String checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "123abc!";

        String providedPassword;
        do {
            System.out.println("Enter your password: ");
            providedPassword = scanner.nextLine();
        } while (!providedPassword.equals(correctPassword));
        return "Password is correct!";
    }

//        3. Вывод чисел от 1 до 10 с использованием do-while
//    Задача:
//    Создайте программу, которая выводит числа от 1 до 10, используя do-while.
//    Методы и конструкции:
//    переменная-счётчик i
//      do-while
//       System.out.println()
    public static void printNumbersFromOneToTen() {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

//        4. Завершение программы по команде "exit"
//    Задача:
//    Напишите программу, которая будет ждать ввода команды "exit" от пользователя для завершения работы.
//    Методы и конструкции:
//    Scanner
//      do-while
//      метод .equals()
//      System.out.println()
    public static String waitForExitCommand() {
        Scanner scanner = new Scanner(System.in);

        String command;
        do {
            System.out.println("Enter a command to finish the program execution: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        return "Program execution is finished.";
    }

//        5. Подсчёт количества цифр в числе
//    Задача:
//    Напишите программу, которая подсчитывает, сколько цифр в целом числе, введённом пользователем.
//    Методы и конструкции:
//    Scanner
//    do-while
//    деление / 10
//    count++
//    условие для 0
    public static String countDigitsInNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count digits: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);

        number = Math.abs(number);

        int count = 0;
        do {
            number = number / 10;
            count++;
        } while (number > 0);
        return "The number of digits is " + count;
    }
}
