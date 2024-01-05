import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
       double sum = 0;
        for (int a: numbers){
            sum = sum + a;
        }
       return sum = sum/numbers.size();
    }
}
