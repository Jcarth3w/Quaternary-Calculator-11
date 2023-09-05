package Model;

import java.util.OptionalInt;

public class Calculator
{
    Converter converter = new Converter();

    private OptionalInt storedNumber = OptionalInt.empty();
    private Operation pendingOperation = null;

    public int add(int num1, int num2)
    {
        if (storedNumber.isEmpty()) {}
        return num1 + num2;
    }

    public int subtract(int num1, int num2)
    {
        int result = num1 - num2;

        if(result < 0)
        {
            return 0;
        }
        else
        {
            return result;
        }
    }

    public int multiply(int num1, int num2)
    {
        return num1 * num2;
    }

    public int divide(int num1, int num2)
    {
        return num1 / num2;
    }

    public int square(int num)
    {
        return (int) Math.pow(num, 2);
    }


    public int sqrt(int num)
    {
        return (int) Math.sqrt(num);
    }


}
