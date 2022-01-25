//Calculate Commission Percentage
import java.util.*;
import java.lang.*;
public class CalCommissionPer{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double  p ;
		System.out.print("Enter the price of Product : ");
		p=in.nextDouble();
		
		percentage(p);
	}
	static void percentage(double price){
	    double comiPercentage=15;
		double commission = (comiPercentage/100)*price;
		System.out.println(" commission :- "+commission);
	}
}
