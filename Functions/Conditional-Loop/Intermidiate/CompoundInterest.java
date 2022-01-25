//Compound Interest Java Program
import java.util.*;
import java.io.*;
public class CompoundInterest{  
	public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter principle , rate and time :- ");
		double princi = in.nextDouble(), r = in.nextDouble(), t = in.nextDouble();
		
		compound_interest(princi , r ,t);
		
}
    static void compound_interest(double principle , double rate , double time){
		double CI = principle *(Math.pow((1 + rate / 100), time));
		
		System.out.println("Compound Interest is "+ CI);
	}
}
