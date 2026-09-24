/**
 * Класс Library — модификаторы доступа
 * Создайте класс Library с полями:
 * private String bookTitle
 * protected String author
 * int year (default-доступ)
 * public String category
 * Реализуйте геттеры и сеттеры для всех полей.
 * В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.
 * */
package hw8_classLibrary;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.setBookTitle("My book");
        System.out.println(library.getBookTitle());

        library.setAuthor("Cool author");
        System.out.println(library.author);

        library.setYear(2014);
        System.out.println(library.year);

        library.setCategory("Book");
        System.out.println(library.category);
    }
}
