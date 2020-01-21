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

        stage.setTitle("Episode 11 - HBox and VBox");
        stage.setWidth(400);
        stage.setHeight(500);

        HBox root = new HBox();

        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");

        root.setSpacing(10D); // spacing between buttons
        root.setAlignment(Pos.BASELINE_LEFT); // where children are positioned relative to the HBox
        root.setPadding(new Insets(10,10,10,10)); // top, right, bottom, left

        HBox.setMargin(b2,new Insets(10,10,10,10)); // strange: static method of HBox sets margin for specified node


        root.getChildren().addAll(b1,b2,b3,b4);
        Scene myScene = new Scene(root);
        myScene.getStylesheets().add("stylesheets/styles.css");
        stage.setScene(myScene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
