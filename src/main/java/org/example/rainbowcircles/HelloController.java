package org.example.rainbowcircles;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.control.TextField;

import java.awt.*;

public class HelloController {
    @FXML
    private Circle circle;

    private double step = 10;

    @FXML
    private Slider sliderSpeed;

    @FXML
    private TextField txtSpeed;

    private double speed = 25;

    @FXML
    private void moveLeft() {
        circle.setLayoutX(circle.getLayoutX() - step);
    }

    @FXML
    private void moveRight() {
        circle.setLayoutX(circle.getLayoutX() + step);
    }

    @FXML
    private void moveDown() {
        circle.setLayoutY(circle.getLayoutY() + step);
    }

    @FXML
    private void moveUp() {
        circle.setLayoutY(circle.getLayoutY() - step);
    }

    @FXML
    void updateBySlider(){
        speed = sliderSpeed.getValue();
        txtSpeed.setText(""+speed);
    }

}