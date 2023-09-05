package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField calculationTextField;

    @FXML
    public void onZeroButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("0");
    }

    public void onOneButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("1");
    }

    public void onTwoButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("2");
    }

    public void onThreeButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("3");
    }

    public void onDivideButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("/");
    }

    public void onMultiplyButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("*");
    }

    public void onSubtractButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("-");
    }

    public void onAddButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("+");
    }

    public void onEqualButtonPress(ActionEvent actionEvent) {
        calculationTextField.setText("=");
    }
}