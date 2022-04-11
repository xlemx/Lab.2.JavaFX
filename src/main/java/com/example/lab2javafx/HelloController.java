package com.example.lab2javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button btnMain;
    int clicCounter=0;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr "+ ++clicCounter);
        if (clicCounter==1)
            btnMain.setText("I jeszcze raz");
    }
}