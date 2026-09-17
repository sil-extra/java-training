/**
 * Класс BankAccount
 * Создайте класс BankAccount с полями owner и balance.
 * Реализуйте конструктор, геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance().
 * В main внесите деньги, снимите и выведите баланс.
 * */
package hw_classBankAccount;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Bob", 100);

        bankAccount.deposit(50);

        bankAccount.withdraw(30);

        bankAccount.printBalance();
    }
}
