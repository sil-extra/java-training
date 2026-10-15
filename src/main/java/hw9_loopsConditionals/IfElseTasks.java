package hw9_loopsConditionals;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        //method to determine a number sign
        System.out.println(checkNumberSign());

        //method to find the maximum number out of 2: SOLUTION 1: Math.max()
        System.out.println(findMaxNumber());

        //method to find the maximum number out of 2: SOLUTION 2: if-else
        System.out.println(findMaxNumber2());

        //method to get the description of mark between 1 and 5: SOLUTION 1: switch-case
        System.out.println(getGradeDescription());

        //method to get the description of mark between 1 and 5: SOLUTION 2: if-else
        System.out.println(getGradeDescription2());

        //method to check parity of a number
        System.out.println(checkParity());

        //method to get discount based on age
        System.out.println(checkDiscount());

        //method to assess the test score
        System.out.println(assessTestScore());
    }

//    1. Определение знака числа
//    Задача:
//    Напишите программу, которая принимает с консоли число и проверяет:
//    Если число больше 0, выведите "Число положительное".
//    Если меньше 0 — "Число отрицательное".
//    Если равно 0 — "Число равно нулю".
//    Методы и конструкции:
//      Scanner
//      if, else if, else
//      System.out.println()
    public static String checkNumberSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check its sign: ");
        String input = scanner.nextLine();

        double number;
        try {
            number = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return "Error: the entered value is not a number";
        }

        String result = "";
        if(number > 0) {
            result = "Number is positive";
        } else if (number < 0) {
            result = "Number is negative";
        } else {
            result = "Number is equal to 0";
        }
        return result;
    }

//    2. Поиск наибольшего из двух чисел
//    Задача:
//    Создайте программу, которая принимает два числа и выводит наибольшее из них.
//    Методы и конструкции:
//      Scanner
//      if-else или Math.max()
//      System.out.println()

    //SOLUTION 1: Math.max()
    public static String findMaxNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second number: ");
        String input2 = scanner.nextLine();

        double number1;
        double number2;
        try {
            number1 = Double.parseDouble(input1);
            number2 = Double.parseDouble(input2);
        } catch (NumberFormatException e) {
            return "Error: entered value(s) not number";
        }

        if(number1 == number2) {
            return "Numbers are equal";
        }

        return "The maximum number is " + Math.max(number1, number2);
    }

    //SOLUTION 2: if-else
    public static String findMaxNumber2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second number: ");
        String input2 = scanner.nextLine();

        double number1;
        double number2;
        try {
            number1 = Double.parseDouble(input1);
            number2 = Double.parseDouble(input2);
        } catch (NumberFormatException e) {
            return "Error: entered value(s) not number";
        }

        String result = "";
        if(number1 == number2) {
            result = "Numbers are equal";
        } else if (number1 > number2) {
            result = "The first number " + number1 + " is greater than " + number2;
        } else {
            result = "The second number " + number2 + " is greater than " + number1;
        }
        return result;
    }

//    3. Вывод оценки по шкале 1–5
//    Задача:
//    Программа принимает число от 1 до 5 и выводит текстовое описание оценки:
//            5 — "Отлично"
//            4 — "Хорошо"
//            3 — "Удовлетворительно"
//            2 или 1 — "Неудовлетворительно"
//    Методы и конструкции:
//      Scanner
//      switch-case или if-else if
//      System.out.println()

    //SOLUTION 1: switch-case
    public static String getGradeDescription() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade between 1 and 5: ");
        String input = scanner.nextLine();

        int grade;
        try {
            grade = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not a number";
        }

        String result;
        switch (grade) {
            case 5 -> result = "Excellent";
            case 4 -> result = "Good";
            case 3 -> result = "Not bad";
            case 2, 1 -> result = "Bad";
            default -> result = "Provided grade is unknown. No description is found.";
        }
        return result;
    }

    //SOLUTION 2: if-else
    public static String getGradeDescription2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade between 1 and 5: ");
        String input = scanner.nextLine();

        int grade;
        try {
            grade = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not a number";
        }

        String description = "";
        if (grade == 1 || grade == 2) {
            description = "Bad";
        } else if (grade == 3) {
            description = "Not Bad";
        } else if (grade == 4) {
            description = "Good";
        } else if (grade == 5) {
            description = "Excellent";
        } else {
            description = "Provided grade is unknown. No description is found.";
        }
        return description;
    }

//    4. Проверка на чётность
//    Задача:
//    Напишите программу, которая проверяет, является ли введённое число чётным или нечётным.
//    Методы и конструкции:
//      Scanner
//      if-else, оператор %
//      System.out.println()
    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check parity: ");
        String input = scanner.nextLine();

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer";
        }

        String parity = "Odd number";
        if (number % 2 == 0) {
            parity = "Even number";
        }
        return parity;
    }

//    5. Определение размера скидки по возрасту
//    Задача:
//    Напишите программу, которая определяет размер скидки:
//    До 18 лет — 25%
//    От 65 и старше — 30%
//    Остальные — без скидки
//    Методы и конструкции:
//      Scanner
//      if, else if, else
//      System.out.println()
    public static String checkDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        String input = scanner.nextLine();

        int age;
        try {
            age = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer";
        }

        String result = "";
        if (age < 0) {
            result = "Error: entered age is impossible";
        } else if (age < 18) {
            result = "Your discount is 25%";
        } else if (age >= 65) {
            result = "Your discount is 30%";
        } else {
            result = "Sorry, you don't have a discount";
        }
        return result;
    }

//    6. Оценка результата теста по баллам
//    Задача:
//    Программа принимает число — результат теста (0–100) и выводит:
//            90 и выше — "Отлично"
//            75–89 — "Хорошо"
//            60–74 — "Удовлетворительно"
//    ниже 60 — "Неудовлетворительно"
//    Методы и конструкции:
//      Scanner
//      if, else if, else
//      System.out.println()
    public static String assessTestScore() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score from 0 to 100: ");
        String input = scanner.nextLine();

        int score;
        try {
            score = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return "Error: entered value is not an integer";
        }

        String result = "";
        if (score < 0 || score > 100) {
            result = "Error: entered value is not within the range of 1 to 100.";
        } else if (score >= 90) {
            result = "Excellent";
        } else if (score >= 75) {
            result = "Good";
        } else if (score >= 60) {
            result = "Satisfactory";
        } else {
            result = "Fail";
        }
        return result;
    }
}
