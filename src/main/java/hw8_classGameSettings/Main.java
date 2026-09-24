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

public class Main {
    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("First game", 5);
        GameSettings game2 = new GameSettings("Second game", 10);

        GameSettings.setMaxPlayers(18);

        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();
    }
}
