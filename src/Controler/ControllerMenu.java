package Controller;
import Model.Menu;
import View.ViewHandler;
import View.ViewMenuOptions;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import src.Model.Menu;
import src.View.ViewHandler;

public class ControllerMenu implements EventHandler<MouseEvent> {

    /**
     * Attributs du controleur du menu
     */
    private ViewHandler launcher;
    private Menu model;


    /**
     * Constructeur du controleur relatif au menu principal
     *
     * @param launcher (Gestionnaire de vue)
     * @param model    (Modèle correcpondant au menu principal)
     */
    public ControllerMenu(ViewHandler launcher, Menu model) {
        this.model = model;
        this.launcher = launcher;
        this.launcher.setEventHandlerMenu(this);
    }


    @Override
    public void handle(MouseEvent mouseEvent) {
        if (mouseEvent.getSource().equals(launcher.getVf().getOptions())) {
            launcher.setVueCompleteOptions();

        }
    }
}