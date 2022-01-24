//Factorial Program In Java
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number :- ");
        int num = in.nextInt();
        sum(num);
         
    }
    static void sum(int n){
		int fact=1 ;
		for(int i = 1 ; i<=n;i++){
		    fact*=i;
		}
		 System.out.println("Factorial of "+n+" is: "+fact);  
	}
}
