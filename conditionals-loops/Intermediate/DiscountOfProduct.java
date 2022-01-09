//Calculate Discount Of Product.
import java.util.*;
public class DiscountOfProduct{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float price , dis=25 ,sub;
		System.out.println("what's the price of product : ");
		price = in.nextFloat();
		sub=100-dis;
		double amt =sub*price/100;
		System.out.println("amount after discount="+amt);
	}
}
