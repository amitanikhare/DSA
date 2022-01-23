//Volume Of Pyramid
import java.util.*;
public class VolumeOfPyramid{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length :- ");
        float length = in.nextFloat();
        System.out.println("Enter width :- ");
        float width = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        
        double ans = area(length , width , height);
        System.out.println("Volume Of Pyramid :- "+ans);
	    
	}
	static double area(float l , float w , float h){
        
        double volume = (l*w*h)/3;
        return volume;
    }
}
