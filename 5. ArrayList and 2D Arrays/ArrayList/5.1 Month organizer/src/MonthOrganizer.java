import java.util.ArrayList;

public class MonthOrganizer
{
   public static void main(String[] args)
   {
      ArrayList<String> months = new ArrayList<>(12);
      months.add("January");
      months.add("February");
      months.add("May");
      months.add("June");
      months.add("July");
      months.add("October");
      months.add("November");
      months.add("December");
      months.add(2, "March");
      months.add(3, "April");
      months.add(7, "August");
      months.add(8, "September");








      System.out.println(months);
   }
}