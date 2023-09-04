package Model;

public class Converter
{
    public int toDecimal(int quaternaryNum)
    {
        String temp = Integer.toString(quaternaryNum);
        int decimalNum = 0;
        int check = temp.length();

        for(int i = 0; i <  temp.length(); i++)
        {
            decimalNum += Character.getNumericValue(temp.charAt(i)) * Math.pow(4, temp.length() - i - 1) ;
        }

        return decimalNum;
    }


}
