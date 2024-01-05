public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 1; //count stores the amount of primes found
      int num = 1; //num is the current number being evaluated
      while (count < 100) //while the 100th prime hasn't been found
      {
         num++; //at the start of every attempt, increase the value of num by 1 (so we start looking for primes at 2)
         for(int div = num - 1; div > 1; div--) //div is the number currently acting as the divisor, which starts as one less than the current number
         {
            if (num % div == 0) 
            {
               break;
            }
            else if (div == 2)
            {
               count++;
            }
         }
      }
      System.out.println(num);
   }
}