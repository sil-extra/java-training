/**
 * Класс Person
 * Создайте класс Person с полями:
 * private String firstName
 * private String lastName
 * private final String ssn — номер социального страхования
 * Реализуйте конструктор для всех трёх полей, геттеры для всех полей,
 * сеттеры только для firstName и lastName,
 * метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
 * В main: создайте несколько объектов, измените имя у одного и выведите информацию.
 * */
package hw8_classPerson;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Bobson", "123-45-6789");
        Person person2 = new Person("Tom", "Tomson", "123-33-4444");
        Person person3 = new Person("Mike", "Tyson", "555-55-5555");

        person1.setFirstName("Kitty");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }
}
