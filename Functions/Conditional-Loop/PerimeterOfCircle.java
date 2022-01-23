//Perimeter Of Circle
import java.util.*;
public class PerimeterOfCircle{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle :- ");
        float radius = sc.nextFloat();
        
        double ans = area(radius);
        System.out.println("Perimeter Of Circle :- "+ans);
	    
	}
	static double area(float r){
        
        double peri = 2*3.14*r;
        return peri;
    }
}
