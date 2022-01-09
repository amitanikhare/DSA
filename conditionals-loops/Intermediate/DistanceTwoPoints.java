//Calculate Distance Between Two Points
import java.util.*;
import java.lang.*;
public class DistanceTwoPoints{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float x1 , x2 , y1 , y2 ;
		double distance;
		
		x1 = in.nextFloat();
		y1 = in.nextFloat();
		x2 = in.nextFloat();
		y2 = in.nextFloat();
		distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("distance : "+distance);
	}
}
