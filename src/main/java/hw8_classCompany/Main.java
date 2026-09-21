/**
 * Класс Company
 * Создайте класс Company с полями:
 * static String companyName — общее название для всех сотрудников
 * final int employeeID — уникальный идентификатор (нельзя менять)
 * String employeeName — имя сотрудника
 * Реализуйте конструктор, принимающий employeeID и employeeName, статический метод printCompanyName(),
 * геттеры и сеттеры для employeeName.
 * В main: создайте несколько сотрудников,
 * измените companyName и проверьте, что она изменилась для всех.
 * Попробуйте изменить employeeID — должно быть невозможно.
 * */
package hw8_classCompany;

import hw8_classLibrary.Library;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(101, "Tom");
        Company employee2 = new Company(102, "Bob");
        Company employee3 = new Company(103, "Josh");

        Company.companyName = "Updated company";

        employee1.printCompanyName();
        employee2.printCompanyName();
        employee3.printCompanyName();

        //employee1.employeeID = 200;

        Library library = new Library();
        System.out.println(library.category);
    }
}
