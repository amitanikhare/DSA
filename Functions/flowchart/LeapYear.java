//input a year and find whether it is a leap year or not.
import java.util.*;
public class LeapYear{
    public static void main(String[] args) {
        
        leap();
    }
        static void leap(){
        System.out.println("enter year: "); 
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
           if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("leap year");
      else
         System.out.println("not a leap year");
    }
}
