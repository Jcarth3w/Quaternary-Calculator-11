package Tests;

import Model.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests
{
    Calculator calculator = new Calculator();

    @Test
    public void addTest()
    {
        int num1 = 10;
        int num2 = 15;
        Assertions.assertEquals(10, calculator.add(num1));
        Assertions.assertEquals(25, calculator.equalBtn(num2));
    }

    @Test
    public void repeatedAdditionTest()
    {
        for (int i = 0; i < 10; i++) {
            calculator.add(2);
        }
        Assertions.assertEquals(20, calculator.equalBtn(0));
    }

    @Test
    public void subtractTest()
    {
        int num1 = 80;
        int num2 = 35;
        Assertions.assertEquals(80, calculator.subtract(num1));
        Assertions.assertEquals(45, calculator.equalBtn(num2));
    }

    @Test
    public void nonNegativeSubtractTest() {
        int num1 = 35;
        int num2 = 80;
        Assertions.assertEquals(35, calculator.subtract(num1));
        Assertions.assertEquals(0, calculator.equalBtn(num2));
    }


    @Test
    public void multiplicationTest()
    {
        int num1 = 27;
        int num2 = 8;

        Assertions.assertEquals(27, calculator.multiply(num1));
        Assertions.assertEquals(216, calculator.equalBtn(num2));

    }

    @Test
    public void divideTest()
    {
        int num1 = 50;
        int num2 = 10;

        Assertions.assertEquals(50, calculator.divide(num1));
        Assertions.assertEquals(5, calculator.equalBtn(num2));

    }


    @Test
    public void squareTest()
    {
        int num = 25;
        Assertions.assertEquals(625, calculator.square(num));
    }

    @Test
    public void sqrtTest()
    {
        int num = 25;
        Assertions.assertEquals(5, calculator.sqrt(num));
    }




}
