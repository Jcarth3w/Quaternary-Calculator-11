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
        System.out.println("0");
    }

    public void onOneButtonPress(ActionEvent actionEvent) {
        System.out.println("1");
    }

    public void onTwoButtonPress(ActionEvent actionEvent) {
        System.out.println("2");
    }

    public void onThreeButtonPress(ActionEvent actionEvent) {
        System.out.println("3");
    }

    public void onDivideButtonPress(ActionEvent actionEvent) {
        System.out.println("/");
    }

    public void onMultiplyButtonPress(ActionEvent actionEvent) {
        System.out.println("*");
    }

    public void onSubtractButtonPress(ActionEvent actionEvent) {
        System.out.println("-");
    }

    public void onAddButtonPress(ActionEvent actionEvent) {
        System.out.println("+");
    }

    public void onEqualButtonPress(ActionEvent actionEvent) {
        System.out.println("=");
    }
}