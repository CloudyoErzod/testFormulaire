package Controller;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import src.Model.Menu;
import src.View.ViewHandler;

public class ControllerMenu implements EventHandler<MouseEvent> {

    private ViewHandler launcher;
    private Menu model;


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