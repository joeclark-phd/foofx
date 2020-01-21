package net.joeclark;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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

        stage.setTitle("Episode 12 - BorderPanes");
        stage.setWidth(500);
        stage.setHeight(500);

        BorderPane root = new BorderPane();

        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");
        Button b5 = new Button("Five");


        root.setCenter(b1);
        root.setTop(b2);
        root.setBottom(b3);
        root.setLeft(b4);
        root.setRight(b5);

        BorderPane.setAlignment(b2,Pos.CENTER);
        BorderPane.setAlignment(b3,Pos.CENTER);
        BorderPane.setAlignment(b4,Pos.CENTER);
        BorderPane.setAlignment(b5,Pos.CENTER);



        Scene myScene = new Scene(root);
        stage.setScene(myScene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
