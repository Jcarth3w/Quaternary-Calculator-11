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
        int userInput = displayStringToInt();
        userInput = converter.toDecimal(userInput);
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
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        calculator.multiply(userInput);
        calculationTextField.clear();
    }

    public void onSubtractButtonPress() {
        int userInput = displayStringToInt();
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        calculator.subtract(userInput);
        calculationTextField.clear();
    }

    public void onAddButtonPress() {
        int userInput = displayStringToInt();
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        calculator.add(userInput);
        calculationTextField.clear();
    }

    public void onEqualButtonPress() {
        int userNum2 = displayStringToInt();
        userNum2 = converter.toDecimal(userNum2);
        userNum2 = calculator.equalBtn(userNum2);
        userNum2 = converter.toQuaternary(userNum2);
        calculationTextField.setText(String.valueOf(userNum2));
    }

    public void onSquareButtonPress() {
        int userInput = displayStringToInt();
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        userInput = calculator.square(userInput);
        userInput = converter.toQuaternary(userInput);
        calculationTextField.setText(String.valueOf(userInput));
    }

    public void onSqrtButtonPress() {
        int userInput = displayStringToInt();
        userInput = converter.toDecimal(userInput);
        System.out.println(userInput);
        userInput = calculator.sqrt(userInput);
        userInput = converter.toQuaternary(userInput);
        calculationTextField.setText(String.valueOf(userInput));
    }

    public void onClearButtonPress()
    {
        calculationTextField.clear();
        calculator.clear();
    }

    public void onToggleButtonPress()
    {
        String numInDisplay = calculationTextField.getText();
        if(converter.isQuaternary(numInDisplay))
        {
            calculationTextField.setText(String.valueOf(converter.toDecimal(Integer.parseInt(numInDisplay))));
        }
        else
        {
            calculationTextField.setText(String.valueOf(converter.toQuaternary(Integer.parseInt(numInDisplay))));
        }
    }

    private int displayStringToInt() {
        int numInDisplay;
        try {
            numInDisplay = Integer.parseInt(calculationTextField.getText());
        } catch(NumberFormatException e) {
            return 0;
        }
        return numInDisplay;
    }

}