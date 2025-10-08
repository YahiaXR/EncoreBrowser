package com.example.encore;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EncoreControls {
    public Button StartKey;
    @FXML
    private Label welcomeText;

    @FXML
    public void onHelloButtonClick() {
        welcomeText.setText("Encore is in pre-alpha!");
        
    }

    public void PrintTest() {
        System.out.println("for real");
    }
}
