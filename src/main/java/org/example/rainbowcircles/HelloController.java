package org.example.rainbowcircles;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle circle;

    private static final double STEP = 20;

    @FXML
    private void moveLeft() {
        circle.setLayoutX(circle.getLayoutX() - STEP);
    }

    @FXML
    private void moveRight() {
        circle.setLayoutX(circle.getLayoutX() + STEP);
    }
}