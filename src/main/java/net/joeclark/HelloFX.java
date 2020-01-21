package net.joeclark;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        stage.setTitle("Episode 8 - Buttons");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        Button button1 = new Button("_Click Me");
        button1.setMinSize(50,50);
        button1.setPrefSize(100,100);

        //mnemonic (shortcut buttons)
        button1.setMnemonicParsing(true);
        button1.setOnAction(e -> {
            System.out.println("Button was pressed. (or was it...?)");
        });

        root.getChildren().addAll(button1);
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
