//Write a program to print whether a number is even or odd, also take input.
import java.util.*;
class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter number: "); 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int table;
        if(num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
