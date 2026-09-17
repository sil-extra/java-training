/**
 * Класс StudentGroup
 * Создайте класс StudentGroup с полями groupName и studentCount.
 * Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о группе и количестве студентов.
 * В main измените число студентов и выведите информацию.
 * */
package hw_classStudentGroup;

public class Main {
    public static void main(String[] args){
        StudentGroup studentGroup = new StudentGroup("Cool group", 15);

        studentGroup.setStudentCount(20);

        studentGroup.printInfo();
    }
}
