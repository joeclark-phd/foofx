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

        stage.setTitle("Episode 8 - Buttons");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        MenuItem menuItem1 = new MenuItem("Taco");
        MenuItem menuItem2 = new MenuItem("Burrito");
        MenuItem menuItem3 = new MenuItem("Enchilada");
        MenuButton menuButton = new MenuButton("Mexican Food",null,menuItem1,menuItem2,menuItem3);
        Label food = new Label("selected: ?");

        menuItem1.setOnAction(e -> {
            food.setText("selected: Taco");
        });
        menuItem2.setOnAction(e -> {
            food.setText("selected: Burrito");
        });
        menuItem3.setOnAction(e -> {
            food.setText("selected: Enchilada");
        });

        root.getChildren().addAll(menuButton,food);
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
