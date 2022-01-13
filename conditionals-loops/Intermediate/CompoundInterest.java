//Compound Interest Java Program.
import java.util.*;
import java.io.*;
public class CompoundInterest{  

	public static void main(String args[])
	{
	    Scanner in = new Scanner(System.in);
	    
		double principle = in.nextDouble(), rate = in.nextDouble(), time = in.nextDouble();

		double CI = principle *(Math.pow((1 + rate / 100), time));
		
		System.out.println("Compound Interest is "+ CI);
	}
}
