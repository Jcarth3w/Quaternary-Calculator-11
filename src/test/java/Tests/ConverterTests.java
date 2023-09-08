package Tests;

import Model.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTests
{
    Converter converter = new Converter();


    @Test
    public void zeroTest()
    {
        int zero = 0;
        Assertions.assertEquals(0, converter.toQuaternary(zero));
        Assertions.assertEquals(0, converter.toDecimal(zero));
    }

    @Test
    public void easyToDecimalTest()
    {
        int quaternaryNum = 11;

        Assertions.assertEquals(5, converter.toDecimal(quaternaryNum));
    }

    @Test
    public void difficultToDecimalTest()
    {
        int quaternaryNum = 333;
        Assertions.assertEquals(63, converter.toDecimal(quaternaryNum));
    }

    @Test
    public void obscenelyDifficultToDecimalTest()
    {
        int quaternaryNum = 1032233110;
        Assertions.assertEquals(322516, converter.toDecimal(quaternaryNum));

    }

    @Test
    public void specialCaseToDecimalTest() {
        int quaternaryNum = 212;
        Assertions.assertEquals(38, converter.toDecimal(quaternaryNum));
    }


    @Test
    public void easyToQuaternaryTest()
    {
        int decimalNum = 5;
        Assertions.assertEquals(11, converter.toQuaternary(decimalNum));
    }

    @Test
    public void difficultToQuaternaryTest()
    {
        int decimalNum = 63;
        Assertions.assertEquals(333, converter.toQuaternary(decimalNum));
    }

    @Test
    public void obscenelyDifficultToQuaternaryTest()
    {
        int decimalNum = 322516;
        Assertions.assertEquals(1032233110, converter.toQuaternary(decimalNum));
    }

    @Test
    public void specialCaseToQuaternaryTest() {
        int decimalNum = 38;
        Assertions.assertEquals(212, converter.toQuaternary(decimalNum));
    }


}