package practice_2;

public class Main {
    public static void main(String[] args) {
        //проверка конструктора по-умолчанию
        Student petya = new Student(18, "Petya");

        petya.print();

        Student kolya = new Student(20, "Kolya");

        kolya.print();

        //petya.setName("Anton");
        petya.name = "Anton";
        petya.print();

        //kolya.setAge(21);
        kolya.age = 21;
        kolya.print();

        // debug - точка останова

    }
}
