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

        Assertions.assertEquals(25, calculator.add(num1, num2));
    }

    @Test
    public void subtractTest()
    {
        int num1 = 80;
        int num2 = 35;

        Assertions.assertEquals(45, calculator.subtract(num1, num2));
    }

    @Test
    public void nonNegativeSubtractTest()
    {
        int num1 = 35;
        int num2 = 80;

        Assertions.assertEquals(0, calculator.subtract(num1, num2));
    }

    @Test
    public void multiplicationTest()
    {
        int num1 = 27;
        int num2 = 8;

        Assertions.assertEquals(216, calculator.multiply(num1, num2));
    }

    @Test
    public void divideTest()
    {
        int num1 = 50;
        int num2 = 10;

        Assertions.assertEquals(5, calculator.divide(num1, num2));
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
