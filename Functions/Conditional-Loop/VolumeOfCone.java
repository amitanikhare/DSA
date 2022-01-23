//Volume Of Cone Java Program
import java.util.*;
class VolumeOfCone {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        
        double ans = area(radius , height);
        System.out.println("Volume Of Cone :- "+ans);
	    
	}
	static double area(float r , float h){
        
        double volume = 3.14*(r*r)*(h/3);
        return volume;
    }
}
