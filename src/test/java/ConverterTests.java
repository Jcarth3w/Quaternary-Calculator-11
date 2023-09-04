import Model.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTests
{
    Converter converter = new Converter();

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



}