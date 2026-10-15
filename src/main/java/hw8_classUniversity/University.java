/** Класс University
 Создайте класс University с полями:
 static String universityName — общее имя университета
 final int studentID — уникальный ID
 String studentName
 Реализуйте конструктор для studentID и studentName,
 статический метод changeUniversityName(String newName), геттер для studentName,
 метод printStudentInfo() — выводит имя, ID и университет.
 В main: создайте 3 студента, измените название университета и выведите данные.
 */
package hw8_classUniversity;

public class University {
    static String universityName = "Cool uni";
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Student name is " + this.studentName);
        System.out.println("Student ID is " + this.studentID);
        System.out.println("University name is " + universityName);
    }
}
