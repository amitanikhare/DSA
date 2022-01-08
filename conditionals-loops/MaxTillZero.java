//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;
public class MaxTillZero{
  public static void main (String[]args){
        int n,max=0,temp; //considering + nos
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        do {
            n = sc.nextInt();
            temp = n;
            if(temp>max)
            {
                max = temp;
            }
        }
        while(n!=0);
        System.out.println("largest number: "+max);
    }
}
