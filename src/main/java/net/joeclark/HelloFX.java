package net.joeclark;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
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

        stage.setTitle("Episode 10 - Toggle and Radio Buttons");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        ToggleButton button1 = new ToggleButton("Blue");
        ToggleButton button2 = new ToggleButton("Red");
        ToggleButton button3 = new ToggleButton("Yellow");
        ToggleGroup toggleGroup = new ToggleGroup();
        button1.setToggleGroup(toggleGroup);
        button2.setToggleGroup(toggleGroup);
        button3.setToggleGroup(toggleGroup);

        RadioButton r1 = new RadioButton("Black");
        RadioButton r2 = new RadioButton("White");
        RadioButton r3 = new RadioButton("Gray");
        r1.setToggleGroup(toggleGroup);
        r2.setToggleGroup(toggleGroup);
        r3.setToggleGroup(toggleGroup);


        root.getChildren().addAll(button1,button2,button3,r1,r2,r3);
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
