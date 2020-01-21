package net.joeclark;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jdk.jshell.EvalException;

public class HelloFX extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before!");
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episode 14 - GridPanes w/ TextField and PasswordField");
        //stage.setWidth(500);
        //stage.setHeight(500);

        Label usernameLabel = new Label("Username:");
        Label emailLabel = new Label("Email:");
        Label passwordLabel = new Label("Password:");

        TextField usernameField = new TextField();
        TextField emailField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button finishButton = new Button("Create account");

        GridPane root = new GridPane(); // like a table

        root.add(usernameLabel,0,0); // column, row
        root.add(emailLabel,0,1);
        root.add(passwordLabel,0,2);

        root.add(usernameField,1,0);
        root.add(emailField,1,1);
        root.add(passwordField,1,2);

        // button spans two columns and is centered
        root.add(finishButton,0,3,2,1); // column, row, colspan, rowspan
        GridPane.setHalignment(finishButton, HPos.CENTER);

        // customize the gridpane
        root.setVgap(10); // vertical space between rows
        root.setHgap(10); // horizontal space between columns
        root.setPadding(new Insets(50)); // just one value -> sets padding for all 4 sides

        Scene myScene = new Scene(root);
        stage.setScene(myScene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
