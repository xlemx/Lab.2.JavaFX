package com.example.lab2javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;

import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

public class HelloController {


    public Spinner cylinderRadius;
    public Spinner cylinderHeight;
    public Spinner cylinderGauge;
    public Button calculate;
    public TextField steelMass;
    public TextField steelPrice;
    public TextField copperMass;
    public TextField copperPrice;

    @FXML


    public void btmCalculate(ActionEvent actionEvent) {
        Integer radius;
        Integer height;
        Integer gauge;
        radius = (Integer) cylinderRadius.getValue();
        height = (Integer)cylinderHeight.getValue();
        gauge = (Integer)cylinderGauge.getValue();
       /* if (radius == null || height == null || gauge == null) return;
        if (radius <= 0 || height <= 0 || gauge <= 0) return;*/
        double massCopper;
        double massSteel;
        double priceCopper;
        double priceSteel;
        final Integer kgPriceCopper = 61;
        final Integer kgPriceSteel = 2;
        double _V = radius * radius * (Math.PI) * height;
        massSteel = _V * gauge * 0.00785;
        massCopper = _V * gauge * 0.0089;
        priceSteel = kgPriceSteel * massSteel;
        priceCopper = kgPriceCopper * massCopper;
        steelMass.setText(String.valueOf(massSteel));
        copperMass.setText(String.valueOf(massCopper));
        steelPrice.setText(String.valueOf(priceSteel));
        copperPrice.setText(String.valueOf(priceCopper));
    }


}