package src.View;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ViewConnexion {


    private GridPane miseEnPage() {

        GridPane gridPane = new GridPane(); // on invoque gridPane
        gridPane.setAlignment(Pos.CENTER); // ca je l'ai trouvé aussi sur le net on ca permet de centrer tout nos élements sur la scene

        gridPane.setPadding(new Insets(40, 40, 40, 40));// la on fait un padding pour gerer le contour a l'interieur de la scene
        gridPane.setHgap(10);
        gridPane.setVgap(10);



        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {

        Label headerLabel = new Label("Connexion"); // ici on a la création du titre
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

        PasswordField pwdField = new PasswordField(); // on créer le champ mot de passe avec les petit point a la place des lettres
        pwdField.setPrefHeight(40);
        gridPane.add(pwdField, 1, 2);





        Button submitButton = new Button("Connexion"); // on instancie le BTN avec son TEXT
        submitButton.setPrefHeight(40); // La taille hauteur
        submitButton.setPrefWidth(100); // la taille largeur
        gridPane.add(submitButton, 0, 3, 2, 1); // position sur la grille
        GridPane.setHalignment(submitButton, HPos.CENTER); // on le centre sur ca ligne
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0)); // on met un petit espace au dessus et en dessous margin Top et bottom

    }

}
