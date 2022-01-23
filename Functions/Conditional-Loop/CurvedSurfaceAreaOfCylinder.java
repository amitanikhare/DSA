//Curved Surface Area Of Cylinder
import java.util.*;
public class CurvedSurfaceAreaOfCylinder{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        
        double ans = area(radius , height);
        System.out.println("Curved Surface Area Of Cylinder :- "+ans);
	    
	}
	static double area(float r , float h){
        
        double volume = 2*3.14*(r*r)+2*3.14*r*h;
        return volume;
    }
}
