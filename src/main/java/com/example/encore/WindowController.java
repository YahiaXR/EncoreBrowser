package com.example.encore;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Node;

import java.awt.event.ActionEvent;

public class WindowController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(EncoreApp.class.getResource("EncoreMain.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToScene2(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(EncoreApp.class.getResource("EncoreMain.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
