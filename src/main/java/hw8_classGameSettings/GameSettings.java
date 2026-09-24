/**
 * Класс GameSettings
 * Создайте класс GameSettings с полями:
 * static int maxPlayers — общее ограничение игроков
 * final String gameName — название (нельзя менять)
 * int currentPlayers — сколько игроков в игре сейчас
 * Реализуйте конструктор, статический метод setMaxPlayers(int),
 * метод addPlayer() — добавляет 1 игрока,
 * метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
 * В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
 * */
package hw8_classGameSettings;

public class GameSettings {
    static int maxPlayers = 20;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        this.currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("Game name is " + this.gameName);
        System.out.println("Current players number is " + this.currentPlayers);
        System.out.println("Max players number is " + maxPlayers);
    }
}
