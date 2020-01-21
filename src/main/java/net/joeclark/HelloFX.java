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

        stage.setTitle("Episode 13 - StackPanes");
        stage.setWidth(500);
        stage.setHeight(500);

        Label l1 = new Label("We hold these truths");
        Label l2 = new Label("to be self-evident:");

        StackPane root = new StackPane(l1,l2); // stacks them in the z-dimension

        StackPane.setAlignment(l1,Pos.TOP_CENTER); // l1.setAlignment doesn't have this effect; you have to use StackPane.setAlignment to have effect within the STackPane


        Scene myScene = new Scene(root);
        stage.setScene(myScene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
