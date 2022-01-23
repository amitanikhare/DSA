//Volume Of Prism
import java.util.*;
public class VolumeOfPrism{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base :- ");
        float base = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        
        double ans = area(base , height);
        System.out.println("Volume Of Prism :- "+ans);
	    
	}
	static double area(float b , float h){
        
        double volume = b * h;
        return volume;
    }
}
