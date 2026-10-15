package hw9_loopsConditionals;

import java.io.LineNumberReader;
import java.util.Scanner;

public class switchTasks {
    public static void main(String[] args) {
        //method to return the name of day of week based on its number
        System.out.println(checkDayOfWeekName());

        //method that returns the ticket price based on a day of week: SOLUTION1 switch-case
        System.out.println(checkTicketPrice());

        //method that returns the ticket price based on a day of week: SOLUTION2 if-else
        System.out.println(checkTicketPrice2());

        //method that converts mark to grade: SOLUTION1 if-else
        System.out.println(convertMarkToGrade());

        //method that converts mark to grade: SOLUTION2 switch-case
        System.out.println(convertMarkToGrade2());

        //method that returns the command based on the keyword
        System.out.println(checkCommand());

        //method that returns the result of two numbers calculation
        System.out.println(calculateTwoNumbersMathOperation());
    }

//    1. Вывод дня недели по номеру
//    Задача:
//    Реализуйте программу, которая принимает с консоли число от 1 до 7
//    и выводит название соответствующего дня недели (например, 1 — "Понедельник").
//    Методы и конструкции:
//     Scanner
//     switch-case
//     System.out.println()
//     default (для обработки некорректного ввода)
    public static String checkDayOfWeekName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of week number from 1 to 7: ");
        String input = scanner.nextLine();

        int dayOfWeek;
        try {
            dayOfWeek = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer.";
        }

        String dayOfWeekName;
        switch (dayOfWeek) {
            case 7 -> dayOfWeekName = "Sunday";
            case 6 -> dayOfWeekName = "Saturday";
            case 5 -> dayOfWeekName = "Friday";
            case 4 -> dayOfWeekName = "Thursday";
            case 3 -> dayOfWeekName = "Wednesday";
            case 2 -> dayOfWeekName = "Tuesday";
            case 1 -> dayOfWeekName = "Monday";
            default -> dayOfWeekName = "Provided day of week doesn't exist.";
        }
        return dayOfWeekName;
    }

//    2. Стоимость билета по дню недели
//    Задача:
//    Определите стоимость билета в кино:
//    будние дни (1–5) — 300 рублей
//    выходные (6–7) — 450 рублей
//    Методы и конструкции:
//      Scanner
//      switch-case (можно несколько case подряд) или if-else
//      System.out.println()

    //SOLUTION1: switch-case
    public static String checkTicketPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of week number to check the price: ");
        String input = scanner.nextLine();

        int dayOfWeek;
        try {
            dayOfWeek = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer.";
        }

        String result;
        switch (dayOfWeek) {
            case 6, 7 -> result = "450 rubles";
            case 1, 2, 3, 4, 5 -> result = "300 rubles";
            default -> result = "Provided day of week doesn't exist.";
        }
        return result;
    }

    //SOLUTION2: if-else
    public static String checkTicketPrice2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of week number to check the price: ");
        String input = scanner.nextLine();

        int dayOfWeek;
        try {
            dayOfWeek = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer.";
        }

        String result;
        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            result = "300 rubles";
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            result = "450 rubles";
        } else {
            result = "Provided day of week doesn't exist.";
        }
        return result;
    }

//    3. Перевод числовых оценок в буквенные (A–F)
//    Задача:
//    Программа принимает число от 0 до 100 и переводит его в буквенную оценку по шкале:
//            90–100 — A
//            80–89 — B
//            70–79 — C
//            60–69 — D
//            ниже 60 — F
//    Методы и конструкции:
//      Scanner
//      if-else if или switch-case
//      System.out.println()

    //SOLUTION1: if-else
    public static String convertMarkToGrade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a mark within the range of 0 to 100: ");
        String input = scanner.nextLine();

        int mark;
        try {
            mark = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer";
        }

        String grade;
        if (mark >= 90 && mark <= 100) {
            grade = "A";
        } else if (mark >= 80 && mark <= 89) {
            grade = "B";
        } else if (mark >= 70 && mark <= 79) {
            grade = "C";
        } else if (mark >= 60 && mark <= 69) {
            grade = "D";
        } else if (mark >= 0 && mark <= 59) {
            grade = "F";
        } else {
            return "Entered mark is not within the possible range of 0 to 100.";
        }
        return "Your grade is " + grade;
    }

    //SOLUTION2: switch-case
    public static String convertMarkToGrade2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a mark within the range of 0 to 100: ");
        String input = scanner.nextLine();

        int mark;
        try {
            mark = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer";
        }

        String grade;
        if (mark >= 0 && mark <= 100) {
            switch (mark / 10) {
                case 9, 10 -> grade = "A";
                case 8 -> grade = "B";
                case 7 -> grade = "C";
                case 6 -> grade = "D";
                default -> grade = "F";
            }
            return "Your grade is " + grade;
        } else {
            return "Provided mark is not within the possible range of 0 to 100.";
        }

    }

//    4. Обработка текстовых команд
//    Задача:
//    Программа читает строку: "start", "stop", "restart" или "status".
//    Для каждой команды нужно вывести соответствующее сообщение, например: "Система запущена".
//    Методы и конструкции:
//      Scanner (nextLine())
//      switch-case по String
//      System.out.println()
//      default
    public static String checkCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a keyword to check a command: ");
        String keyword = scanner.nextLine();

        String command;
        switch (keyword) {
            case "start" -> command = "System is started.";
            case "stop" -> command = "System is stopped.";
            case "restart" -> command = "System is restarted.";
            case "status" -> command = "System status.";
            default -> {
                return "Provided keyword doesn't exist";
            }
        }
        return command;
    }

//    5. Простой калькулятор с использованием switch
//    Задача:
//    Программа принимает два числа и оператор (+, -, *, /), затем выполняет операцию и выводит результат.
//    Методы и конструкции:
//      Scanner
//      switch-case
//      if для проверки деления на 0
//      System.out.println()
//      Арифметические операторы +, -, *, /
    public static String calculateTwoNumbersMathOperation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String input1 = scanner.nextLine();
        input1 = input1.replace(",", ".");
        double number1;
        try {
            number1 = Double.parseDouble(input1);
        } catch (NumberFormatException e) {
            return "Error: provided value is not a number";
        }

        System.out.println("Enter the second number: ");
        String input2 = scanner.nextLine();
        input2 = input2.replace(",", ".");
        double number2;
        try {
            number2 = Double.parseDouble(input2);
        } catch (NumberFormatException e) {
            return "Error: provided value is not a number";
        }

        System.out.println("Enter the math operator(+, -, *, /): ");
        String operator = scanner.nextLine();

        if (number2 == 0 && operator.equals("/")) {
            return "Error: division by 0 is not possible.";
        }

        double result;
        switch (operator) {
            case "+" -> result = number1 + number2;
            case "-" -> result = number1 - number2;
            case "*" -> result = number1 * number2;
            case "/" -> result = number1 / number2;
            default -> {
                return "Provided operator is not acceptable.";
            }
        }
        return "The result of calculation is " + result;
    }
}
