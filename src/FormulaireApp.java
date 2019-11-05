package src;

import javafx.application.Application;  // ca c'est les imports
import javafx.event.ActionEvent;  // ca c'est les imports
import javafx.event.EventHandler;  // ca c'est les imports
import javafx.geometry.HPos;  // ca c'est les imports
import javafx.geometry.Insets;  // ca c'est les imports
import javafx.geometry.Pos; // ca c'est les imports
import javafx.scene.Scene;  // ca c'est les imports
import javafx.scene.control.*;  // ca c'est les imports
import javafx.scene.layout.*;  // ca c'est les imports
import javafx.scene.text.Font;  // ca c'est les imports
import javafx.scene.text.FontWeight;  // ca c'est les imports
import javafx.stage.Stage;  // ca c'est les imports

public class FormulaireApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Formulaire d'inscription"); //On affiche un titre à la fenêtre

        GridPane gridPane = miseEnPage();//on lie GridPane a notre objet miseEnPage qui permet de gerer un emplacement propre (en grille) sur la scene
        addUIControls(gridPane);// On lie le formulaire au gridPane
        Scene scene = new Scene(gridPane, 1600, 900);// on crée la scene avec ca taille

        primaryStage.setScene(scene);// on active la scene
        primaryStage.show();// on l'affiche sinon on vois rien
    }


    private GridPane miseEnPage() {

        GridPane gridPane = new GridPane();// on invoque gridPane

        gridPane.setAlignment(Pos.CENTER);// ca je l'ai trouvé aussi sur le net on ca permet de centrer tout nos élements sur la scene

        gridPane.setPadding(new Insets(40, 40, 40, 40));// la on fait un padding

        gridPane.setHgap(10);
        gridPane.setVgap(10);


        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {

        Label headerLabel = new Label("Formulaire d'enregistrement"); // ici on a la création du titre
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24)); // grace au net j'ai vue comment changer la typo
        gridPane.add(headerLabel, 0,0,2,1); // On positionne le titre dans la grille
        GridPane.setHalignment(headerLabel, HPos.CENTER); // on le met au centre de la row (ligne)
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0)); // grace au net encore j'ai pu voir qu'il etait possible de gerer le margin aussi (l'espace laissé au dessus et en dessous)


        Label identifiantLabel = new Label("Identifiant : "); // on instancie le label avec sont "TEXT" le text a gauche du champ
        gridPane.add(identifiantLabel, 0,1); // on le le met en place sur la grille

        TextField identifiantField = new TextField(); // on instancie le champ
        identifiantField.setPrefHeight(40); // la taille
        gridPane.add(identifiantField, 1,1); // on le le met en place sur la grille



        Label pwdLabel = new Label("Mot de passe : ");
        gridPane.add(pwdLabel, 0, 2);

        PasswordField pwdField = new PasswordField();
        pwdField.setPrefHeight(40);
        gridPane.add(pwdField, 1, 2);



        Label nomLabel = new Label("Nom : ");
        gridPane.add(nomLabel, 0,3);

        TextField nomField = new TextField();
        nomField.setPrefHeight(40);
        gridPane.add(nomField, 1,3);



        Label prenomLabel = new Label("Prénom : ");
        gridPane.add(prenomLabel, 0,4);

        TextField prenomField = new TextField();
        prenomField.setPrefHeight(40);
        gridPane.add(prenomField, 1,4);



        Label adresseLabel = new Label("Adresse : ");
        gridPane.add(adresseLabel, 0,5);

        TextField adresseField = new TextField();
        adresseField.setPrefHeight(40);
        gridPane.add(adresseField, 1,5);



        Label emailLabel = new Label("Email : ");
        gridPane.add(emailLabel, 0, 6);

        TextField emailField = new TextField();
        emailField.setPrefHeight(40);
        gridPane.add(emailField, 1, 6);



        Button submitButton = new Button("Valider"); // on instancie le BTN avec son TEXT
        submitButton.setPrefHeight(40); // La taille hauteur
        submitButton.setPrefWidth(100); // la taille largeur
        gridPane.add(submitButton, 0, 7, 2, 1); // position sur la grille
        GridPane.setHalignment(submitButton, HPos.CENTER); // on le centre sur ca ligne
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0)); // on met un petit espace au dessus et en dessous margin Top et bottom


    }


}