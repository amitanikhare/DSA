//Write a program to print whether a number is even or odd, also take input.
import java.util.*;
public class EvenOdd{
  public static void main (String[]args){
      Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    evenOdd (n);
  }
  static void evenOdd (int num){
        if(num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
