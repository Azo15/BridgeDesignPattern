//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Client: Abstraction ve Implementor'ı bağlar
        Controller controller = new KeyboardController();
        Controller controller1 = new GamepadController();
        Game game = new ActionGame(controller);

        Game game1 = new RacingGame(controller1);
        game.play();
        game1.play();

    }
}