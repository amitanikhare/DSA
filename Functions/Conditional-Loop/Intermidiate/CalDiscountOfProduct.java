//Calculate Discount Of Product...
import java.util.*;
public class CalDiscountOfProduct{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float p;
		System.out.println("what's the price of product : ");
		p = in.nextFloat();
		
		dis(p);
	}
	static void dis(float price ){
	    float  dis=25 ,sub;
	    sub=100-dis;
		double amt =sub*price/100;
		System.out.println("amount after discount="+amt);
	}
}
