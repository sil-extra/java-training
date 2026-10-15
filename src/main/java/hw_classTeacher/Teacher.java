/**
 * Класс Teacher
 * Создайте класс Teacher с полями name и subject.
 * Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о учителе и предмете.
 * В main измените предмет и выведите обновлённую информацию.
 * */
package hw_classTeacher;

public class Teacher {
    String name;
    String subject;

    Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    String getName(){
        return this.name;
    }

    String getSubject(){
        return this.subject;
    }

    void setName(String newName){
        this.name = newName;
    }

    void setSubject(String newSubject){
        this.subject = newSubject;
    }

    void printInfo(){
        System.out.println("Teacher name is " + this.name);
        System.out.println("Subject name is " + this.subject);
    }
}
