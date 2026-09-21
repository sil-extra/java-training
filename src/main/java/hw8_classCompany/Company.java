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

public class Company {
    static String companyName = "Cool company";
    final int employeeID;
    String employeeName;

    Company(int someEmployeeID, String someEmployeeName) {
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }
}
