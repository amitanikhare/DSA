//Perimeter Of Square
import java.util.*;
public class PerimeterOfSquare{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sides :- ");
        float sides = in.nextFloat();
        
        double ans = area(sides);
        System.out.println("Perimeter Of Square :- "+ans);
	    
	}
	static double area(float a){
        
        double peri = 4*a;
        return peri;
    }
