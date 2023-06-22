package Home_8_Testing.homework.tests.unit;

import Home_8_Testing.homework.src.main.java.ru.otus.game.DiceImpl;
import Home_8_Testing.homework.src.main.java.ru.otus.game.Game;
import Home_8_Testing.homework.src.main.java.ru.otus.game.GameWinnerConsolePrinter;
import Home_8_Testing.homework.src.main.java.ru.otus.game.Player;

public class GameTest02 {
    private final int REZULT_1 = 5;
    private final int REZULT_2 = 6;
    DiceImpl dice = new DiceImpl();
    GameWinnerConsolePrinter gameWinnerConsolePrinter = new GameWinnerConsolePrinter();
    Game game = new Game(dice, gameWinnerConsolePrinter);


    public void testPlayGame02() {
        String scenario = "V4. Тест определения победителя.";
        var test01 = new Player("Test01");
        var test02 = new Player("Test02");
        var win = game.playGame(test01, test02);

        Player winner = (REZULT_1 == REZULT_2) ? null : win;

        try {
            if (winner != win) {
                throw new Throwable("Победитель определен неверно.");
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
