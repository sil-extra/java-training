/** Класс University
 *  Создайте класс University с полями:
 *  static String universityName — общее имя университета
 *  final int studentID — уникальный ID
 *  String studentName
 *  Реализуйте конструктор для studentID и studentName,
 *  статический метод changeUniversityName(String newName), геттер для studentName,
 *  метод printStudentInfo() — выводит имя, ID и университет.
 *  В main: создайте 3 студента, измените название университета и выведите данные.
 *  */
package hw8_classUniversity;

public class Main {
    public static void main(String[] args) {
        University student1 = new University(100, "Helen");
        University student2 = new University(200, "Mary");
        University student3 = new University(300, "Kate");

        University.changeUniversityName("Changed uni");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
