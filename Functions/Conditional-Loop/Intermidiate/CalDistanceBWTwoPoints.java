//Calculate Distance Between Two Points
import java.util.*;
import java.lang.*;
public class CalDistanceBWTwoPoints{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float x1 , x2 , y1 , y2 ;
		
		System.out.println("Enter four points x1 , y1 , x2 ,y2");
		x1 = in.nextFloat();
		y1 = in.nextFloat();
		x2 = in.nextFloat();
		y2 = in.nextFloat();
		
		distance(x1 , y1 , x2 , y2);
	}
	static void distance(float x1 , float y1 , float x2 , float y2){
	    double dis;
		dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("distance : "+dis);
	}
}
