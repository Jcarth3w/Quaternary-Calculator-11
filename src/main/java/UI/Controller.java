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
        calculator.divide(converter.toDecimal(Integer.parseInt(calculationTextField.getText())));
        calculationTextField.clear();
    }

    public void onMultiplyButtonPress()
    {
        calculator.multiply(converter.toDecimal(Integer.parseInt(calculationTextField.getText())));
        calculationTextField.clear();
    }

    public void onSubtractButtonPress() {
        calculator.subtract(converter.toDecimal(Integer.parseInt(calculationTextField.getText())));
        calculationTextField.clear();
    }

    public void onAddButtonPress() {
        calculator.add(converter.toDecimal(Integer.parseInt(calculationTextField.getText())));
        calculationTextField.clear();
    }

    public void onEqualButtonPress() {
        calculationTextField.setText(String.valueOf(converter.toQuaternary(calculator.equalBtn(converter.toDecimal
                (Integer.parseInt(calculationTextField.getText()))))));
    }

    public void onSquareButtonPress() {
        calculationTextField.setText("sq");
    }

    public void onSqrtButtonPress() {
        calculationTextField.setText("sqrt");
    }

    public void onClearButtonPress() {
        calculationTextField.clear();
        calculator.clear();
    }

    public void onToggleButtonPress() {
        calculationTextField.setText("toggle non-functional");
    }


}