package ie.atu.week5;

public class calculator
{
    private int val1;
    private int val2;
    private int val3;
    private int result;

    public calculator()
    {
        val1 = 0;
        val2 = 0;
        val3 = 0;
        result = 0;
    }

    public int divide(int val1, int val2)
    {
        result = val1 / val2;
        return result;
    }


}
