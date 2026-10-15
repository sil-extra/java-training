/**
 * Класс Teacher
 * Создайте класс Teacher с полями name и subject.
 * Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о учителе и предмете.
 * В main измените предмет и выведите обновлённую информацию.
 * */
package hw_classTeacher;

public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Helena", "Math");

        teacher.setSubject("Physics");

        teacher.printInfo();
    }
}
