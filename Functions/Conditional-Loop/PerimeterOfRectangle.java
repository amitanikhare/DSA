//Perimeter Of Rectangle
import java.util.*;
public class PerimeterOfRectangle{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length :- ");
        float length = in.nextFloat();
        System.out.println("Enter width :- ");
        float width = in.nextFloat();
        
        double ans = area(length , width);
        System.out.println("Perimeter Of Rectangle :- "+ans);
	    
	}
	static double area(float l , float w){
        
        double peri = 2*(l + w);
        return peri;
    }
}
