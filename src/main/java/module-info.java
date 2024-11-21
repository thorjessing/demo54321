module dk.easv.demo123456 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demo123456 to javafx.fxml;
    exports dk.easv.demo123456;
}