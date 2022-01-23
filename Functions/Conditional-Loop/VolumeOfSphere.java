//Volume Of Sphere
import java.util.*;
public class VolumeOfSphere{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        
        double ans = area(radius);
        System.out.println("Volume Of Sphere :- "+ans);
	    
	}
	static double area(float r){
        
        double volume = (4/3)*3.14*(r*r*r);
        return volume;
    }
}
