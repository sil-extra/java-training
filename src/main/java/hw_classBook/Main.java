/**Создайте класс Book с полями title и author.
 * Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий название и автора книги.
 * В main создайте книгу, измените автора и выведите информацию.
 * */
package hw_classBook;

public class Main {
    public static void main(String[] args){
        Book book = new Book("Cool book", "Anna");

        book.setAuthor("Tom");

        book.printInfo();
    }
}
