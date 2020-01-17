package net.joeclark;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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

        stage.setTitle("Episode 5 - Controls"); // controls is a funny name for images, buttons, etc
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();
        ImageView imageView = new ImageView("https://static01.nyt.com/images/2017/02/24/opinion/00libertyWeb/00libertyWeb-jumbo.jpg?quality=90&auto=webp");
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(200);

        Label label1 = new Label("This is a text label");
        label1.setTextFill(Color.web("#9042f5"));
        label1.setFont(new Font("Cambria",24));

        root.getChildren().addAll(imageView,label1);


        Scene myScene = new Scene(root);



        stage.setScene(myScene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
