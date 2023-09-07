package UI;

import Model.Calculator;
import Model.Converter;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller
{
    Calculator calculator = new Calculator();
    Converter converter = new Converter();

    @FXML
    public TextField calculationTextField;

    @FXML
    public void onZeroButtonPress() {
        calculationTextField.appendText("0");
    }

    public void onOneButtonPress() {
        calculationTextField.appendText("1");
    }

    public void onTwoButtonPress() {
        calculationTextField.appendText("2");
    }

    public void onThreeButtonPress() {
        calculationTextField.appendText("3");
    }

    public void onDivideButtonPress() {
        int userInput = Integer.parseInt(calculationTextField.getText());
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        calculator.divide(userInput);
        calculationTextField.clear();
    }

    public void onMultiplyButtonPress() {
        int userInput = Integer.parseInt(calculationTextField.getText());
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        calculator.multiply(userInput);
        calculationTextField.clear();
    }

    public void onSubtractButtonPress() {
        int userInput = Integer.parseInt(calculationTextField.getText());
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        calculator.subtract(userInput);
        calculationTextField.clear();
    }

    public void onAddButtonPress() {
        int userInput = Integer.parseInt(calculationTextField.getText());
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        calculator.add(userInput);
        calculationTextField.clear();
    }

    public void onEqualButtonPress() {
        int userNum2 = Integer.parseInt(calculationTextField.getText());
        userNum2 = converter.toDecimal(userNum2);
        userNum2 = calculator.equalBtn(userNum2);
        userNum2 = converter.toQuaternary(userNum2);
        calculationTextField.setText(String.valueOf(userNum2));
    }

    public void onSquareButtonPress() {
        int userInput = Integer.parseInt(calculationTextField.getText());
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        userInput = calculator.square(userInput);
        userInput = converter.toQuaternary(userInput);
        calculationTextField.setText(String.valueOf(userInput));
    }

    public void onSqrtButtonPress() {
        int userInput = Integer.parseInt(calculationTextField.getText());
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        userInput = calculator.sqrt(userInput);
        userInput = converter.toQuaternary(userInput);
        calculationTextField.setText(String.valueOf(userInput));
    }

    public void onClearButtonPress() {
        calculationTextField.clear();
        calculator.clear();
    }

    public void onToggleButtonPress() {
        calculationTextField.setText("toggle non-functional");
    }


}