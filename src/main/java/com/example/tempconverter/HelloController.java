package com.example.tempconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField textField;
    @FXML
    private SplitMenuButton splitMenuButton;
    @FXML
    private Label label;
    //(30°C x 1.8) + 32 = 86°F
    @FXML
    private void celsiusToFahrenheit(ActionEvent actionEvent){
        double i = Double.parseDouble(textField.getText());
        double xd = (i*1.8)+32;
        label.setText(String.valueOf(xd));


    }
    @FXML
    private void fahrenheitToCelsius(ActionEvent actionEvent){
        double i = Double.parseDouble(textField.getText());
        double xd = (i-32)*0.5556;
        label.setText(String.valueOf(xd));


    }
    // (x°F - 32) x .5556
    @FXML
    private void celsiusToKelvin(ActionEvent actionEvent){
        double i = Double.parseDouble(textField.getText());
        double ij = i+273.15;
        label.setText(String.valueOf(ij));
    }
    @FXML
    private void kelvinToCelsius(ActionEvent actionEvent){
        double i = Double.parseDouble(textField.getText());
        double ij = i-273.15;
        label.setText(String.valueOf(ij));
    }
    @FXML
    private void fahrenheitToKelvin(ActionEvent actionEvent){
        double i = Double.parseDouble(textField.getText());
        double ij = (i + 459.67) * 5/9;
        label.setText(String.valueOf(ij));
    }
    @FXML
    private void kelvinToFahrenheit(ActionEvent actionEvent){
        double i = Double.parseDouble(textField.getText());
        double ij = 1.8*(i-273) + 32;
        label.setText(String.valueOf(ij));
    }


}