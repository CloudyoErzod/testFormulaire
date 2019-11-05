package src.View;

import Controller.ControllerMenu;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import src.Model.Menu;
import src.view.ViewFormulaire;

public class ViewHandler extends Application{
    private Stage primaryStage;
    private src.view.ViewFormulaire vf;
    private ViewConnexion vc;
    private Controller.ControllerMenu controllerMenu;
    private Menu model;
    private Group root;


    @Override
    public void start(Stage primaryStage) throws Exception {

        root = new Group();
        Scene scene = new Scene(root);

        model = new Menu();

        vc = new ViewConnexion(root);
        vf = new ViewFormulaire(model, root);

        controllerMenu = new ControllerMenu(this, model);


        primaryStage.setTitle("Formulaire d'inscription"); //On affiche un titre à la fenêtre

        GridPane gridPane = miseEnPage(); //on lie GridPane a notre objet miseEnPage qui permet de gerer un emplacement propre (en grille) sur la scene
        ajoutInterfaceInscription(gridPane); // On lie le formulaire au gridPane
        Scene scene = new Scene(gridPane, 800, 600);// on crée la scene avec ca taille

        primaryStage.setScene(scene); // on active la scene
        primaryStage.show(); // on l'affiche sinon on vois rien
    }

    public void setEventHandlerMenu(ControllerMenu cm) {
        vf.setEvents(cm);
        //vc.setEvents(cm);

    }
    public ViewFormulaire getVf() {
        return vf;
    }
    public void setVueCompleteOptions() {
        vc.setVueCompleteOptions();
    }
}
