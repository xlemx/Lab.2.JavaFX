package com.example.lab2javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.Spinner;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);

        IntegerSpinnerValueFactory valueFactory = new IntegerSpinnerValueFactory(1, 1000000);
        Spinner sp1 = (Spinner) scene.lookup("#cylinderRadius");
        sp1.setValueFactory(valueFactory);
        IntegerSpinnerValueFactory valueFactory2 = new IntegerSpinnerValueFactory(1, 1000000);
        Spinner sp2= (Spinner) scene.lookup("#cylinderHeight");
        sp2.setValueFactory(valueFactory2);
        IntegerSpinnerValueFactory valueFactory3 = new IntegerSpinnerValueFactory(1, 1000000);
        Spinner sp3 = (Spinner) scene.lookup("#cylinderGauge");
        sp3.setValueFactory(valueFactory3);

        stage.setTitle("Tin cylinder cost");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}