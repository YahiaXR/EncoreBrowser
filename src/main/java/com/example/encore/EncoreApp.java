package com.example.encore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class EncoreApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EncoreApp.class.getResource("EncoreMain.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Encore");
        Image icon = new Image("Icon.png");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }
}
