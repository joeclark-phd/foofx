package net.joeclark;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
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
        stage.setTitle("Hello World");
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l),640,480);
        stage.setScene(scene);
        stage.show();


        // launch a second window
        Stage stage2 = new Stage();
        stage2.setTitle("Second window");
        stage2.setWidth(700);
        stage2.setHeight(100);
        stage2.setX(0);
        stage2.setY(0);
        stage2.show();

        // modality
        Stage newWindow = new Stage();
        //newWindow.initModality(Modality.APPLICATION_MODAL); // other windows can't be used until this one is closed
        //newWindow.initModality(Modality.NONE); // default behavior
        newWindow.initModality(Modality.WINDOW_MODAL); // owner/parent window can't be used until this one is closed -- but other windows in our application can
        newWindow.initOwner(stage2);
        newWindow.initStyle(StageStyle.UNIFIED); // UTILITY etc. might be useful sometimes
        newWindow.show();

        stage.toFront();
        stage.setFullScreen(true);

        // and lots of other Stage methods are available...

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After...");
    }
}
