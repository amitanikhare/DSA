//Factorial Program In Java
import java.util.*;
class FactorialProgram {
    public static void main(String[] args) {
        int i,num,fact=1;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter number :- ");
         num = in.nextInt();
         for(i = 1 ; i<= num ; i++){
             fact = fact*i;
         }
         System.out.print("Factorial of "+ num + " is :- "+fact);;
    }
}
