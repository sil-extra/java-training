/**
 * Класс BankAccount
 * Создайте класс BankAccount с полями owner и balance.
 * Реализуйте конструктор, геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance().
 * В main внесите деньги, снимите и выведите баланс.
 * */
package hw_classBankAccount;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner(){
        return this.owner;
    }

    double getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        this.balance -= amount;
    }

    void printBalance(){
       System.out.println("Balance is " + this.balance);
    }
}
