module org.example.rainbowcircles {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.rainbowcircles to javafx.fxml;
    exports org.example.rainbowcircles;
}