public class RacingGame implements Game {
    protected Controller controller;
    public RacingGame(Controller controller) {
        this.controller = controller;
    }
    @Override
    public void play() {
        System.out.println("Racing Oyunu Baslatiliyor");
        controller.configureController();
    }
}
