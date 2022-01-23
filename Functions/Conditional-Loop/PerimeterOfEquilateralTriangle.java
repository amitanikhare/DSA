//Perimeter Of Equilateral Triangle
import java.util.*;
public class PerimeterOfEquilateralTriangle{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sides Triangle:- ");
        float sides = sc.nextFloat();
        
        double ans = area(sides);
        System.out.println("Perimeter Of Equilateral Triangle :- "+ans);
	    
	}
	static double area(float a){
        
        double peri = 3*a;
        return peri;
    }
}
