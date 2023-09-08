package UI;

import Model.Calculator;
import Model.Converter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller
{
    Calculator calculator = new Calculator();
    Converter converter = new Converter();
    boolean displayQuaternary = true;

    @FXML
    public TextField calculationTextField;

    @FXML
    public Button toggleButton;

    @FXML
    public void onZeroButtonPress() {
        if (!displayQuaternary) {
            onToggleButtonPress();
        }
        calculationTextField.appendText("0");
    }

    public void onOneButtonPress() {
        if (!displayQuaternary) {
            onToggleButtonPress();
        }
        calculationTextField.appendText("1");
    }

    public void onTwoButtonPress() {
        if (!displayQuaternary) {
            onToggleButtonPress();
        }
        calculationTextField.appendText("2");
    }

    public void onThreeButtonPress() {
        if (!displayQuaternary) {
            onToggleButtonPress();
        }
        calculationTextField.appendText("3");
    }

    public void onDivideButtonPress() {
        int userInput = displayStringToInt();
        System.out.println(userInput);
        try
        {
            calculator.divide(userInput);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by 0");
        }

        calculationTextField.clear();
    }

    public void onMultiplyButtonPress() {
        int userInput = displayStringToInt();
        System.out.println(userInput);
        calculator.multiply(userInput);
        calculationTextField.clear();
    }

    public void onSubtractButtonPress() {
        int userInput = displayStringToInt();
        System.out.println(userInput);
        calculator.subtract(userInput);
        calculationTextField.clear();
    }

    public void onAddButtonPress() {
        int userInput = displayStringToInt();
        System.out.println(userInput);
        calculator.add(userInput);
        calculationTextField.clear();
    }

    public void onEqualButtonPress() {
        int userNum2 = displayStringToInt();
        userNum2 = calculator.equalBtn(userNum2);
        updateDisplay(userNum2);
    }

    public void onSquareButtonPress() {
        int userInput = displayStringToInt();
        System.out.println(userInput);
        userInput = calculator.square(userInput);
        updateDisplay(userInput);
    }

    public void onSqrtButtonPress() {
        int userInput = displayStringToInt();
        System.out.println(userInput);
        userInput = calculator.sqrt(userInput);
        updateDisplay(userInput);
    }

    public void onClearButtonPress()
    {
        calculationTextField.clear();
        calculator.clear();
    }

    public void onToggleButtonPress()
    {
        displayQuaternary = !displayQuaternary;
        updateToggleStyle();
        updateDisplay(displayStringToInt());
    }

    private void updateToggleStyle() {
        String bgColor = displayQuaternary ? "dimgray" : "lightgray";
        toggleButton.setStyle("-fx-background-color: " + bgColor + ";");
    }

    private int displayStringToInt() {
        int numInDisplay;
        try {
            if (displayQuaternary) {
                numInDisplay = converter.toDecimal(
                        Integer.parseInt(calculationTextField.getText())
                );
            } else {
                numInDisplay = Integer.parseInt(calculationTextField.getText());
            }
        } catch(NumberFormatException e) {
            return 0;
        }
        return numInDisplay;
    }

    private void updateDisplay(int number) {
        if (displayQuaternary) {
            calculationTextField.setText(
                    String.valueOf(converter.toQuaternary(number))
            );
        } else {
            calculationTextField.setText(
                    String.valueOf(converter.toDecimal(number))
            );
        }
    }

}