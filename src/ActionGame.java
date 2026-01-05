// Refined Abstraction (Geliştirilmiş Soyutlama)
// Game arayüzünü uygular ve bir Controller (Implementor) kullanarak köprüyü kurar.
public class ActionGame implements Game {

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
