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

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String someFirstName, String someLastName, String someSsn) {
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        System.out.println("Имя: " + this.firstName + ", " + "Фамилия: " + this.lastName + ", " + "SSN: " + this.ssn);
    }
}
