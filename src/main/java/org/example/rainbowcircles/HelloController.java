package org.example.rainbowcircles;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle circle;

    private double STEP = 20;

    @FXML
    private void moveLeft() {
        circle.setLayoutX(circle.getLayoutX() - STEP);
    }

    @FXML
    private void moveRight() {
        circle.setLayoutX(circle.getLayoutX() + STEP);
    }

    @FXML
    private void moveDown() {
        circle.setLayoutY(circle.getLayoutY() + STEP);
    }

    @FXML
    private void moveUp() {
        circle.setLayoutY(circle.getLayoutY() + STEP);
    }
}