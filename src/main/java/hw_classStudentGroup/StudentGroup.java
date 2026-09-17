/**
 * Класс StudentGroup
 * Создайте класс StudentGroup с полями groupName и studentCount.
 * Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о группе и количестве студентов.
 * В main измените число студентов и выведите информацию.
 * */
package hw_classStudentGroup;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String someGroupName, int someStudentCount){
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    String getGroupName(){
        return this.groupName;
    }

    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    void printInfo(){
        System.out.println("Group name is " + this.groupName);
        System.out.println("Student count is " + this.studentCount);
    }
}
