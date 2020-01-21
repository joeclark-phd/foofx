package net.joeclark;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Episode 16 - Controllers");

        Parent homeRoot = FXMLLoader.load(getClass().getResource("/scenes/hellofx.fxml"));
        Scene home = new Scene(homeRoot);

        Parent loginRoot = FXMLLoader.load(getClass().getResource("/scenes/hellologin.fxml"));
        Scene login = new Scene(loginRoot);

        stage.setScene(login);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
