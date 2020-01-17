package net.joeclark;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
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

        stage.setTitle("Episode 5 - Controls"); // controls is a funny name for images, buttons, etc
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        Hyperlink link = new Hyperlink("click me");
//        link.setOnAction(e -> {
//            System.out.println("The link was clicked!");
//        });
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("You clicked the link.");
            }
        });

        Label text = new Label("Link not touched.");
        Hyperlink link2 = new Hyperlink("smack me");
        link2.setOnAction(e -> {
            text.setText("Link has been touched...");
        });

        root.getChildren().addAll(link,text,link2);



        Scene myScene = new Scene(root);
        stage.setScene(myScene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
