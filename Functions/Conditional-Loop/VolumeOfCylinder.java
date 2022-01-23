//Volume Of Cylinder
import java.util.*;
public class VolumeOfCylinder{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        
        double ans = area(radius , height);
        System.out.println("Volume Of Cylinder :- "+ans);
	    
	}
	static double area(float r , float h){
        
        double volume = 3.14*(r*r)*h;
        return volume;
    }
}
