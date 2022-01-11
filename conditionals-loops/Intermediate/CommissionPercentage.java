//Calculate Commission Percentage
import java.util.*;
public class CommissionPercentage{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double comiPercentage=15 , price ;
		System.out.print("Enter the price of Product : ");
		price=in.nextDouble();
		double commission = (comiPercentage/100)*price;
		System.out.println(" commission :- "+commission);
	}
}
