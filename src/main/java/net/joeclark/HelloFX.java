package net.joeclark;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelloFX extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before!");
    }

    @Override
    public void start(Stage stage) throws Exception {

        // things you can do with the stage (i.e., the window)
        stage.setTitle("Episode 4 - Stages");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox parent = new VBox(); // a layout manager that will be the "root node" of our scene's layout

        // adding child nodes to the layout manager
        Label label1 = new Label("This is a text label"); // child node
        parent.getChildren().add(label1);


        Scene scene1 = new Scene(parent); // argument is a Parent (usually a layout manager)
        scene1.setCursor(Cursor.CROSSHAIR); // mouse cursor type can be specific to scene
        // set the scene to the window
        stage.setScene(scene1);

        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
