public class ActionGame implements Game{

    protected Controller controller;
    public ActionGame(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void play() {
        System.out.println("Action Oyunu başlatılıyor...");
        controller.configureController();
    }




}
