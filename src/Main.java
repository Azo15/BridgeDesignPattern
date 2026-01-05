//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Controller controller = new KeyboardController();
        Game game = new ActionGame(controller);

        game.play();

    }
}