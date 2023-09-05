module quaternaryCalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens UI to javafx.fxml;
    exports UI;
}