//Total Surface Area Of Cube
import java.util.*;
public class TotalSurfaceAreaOfCube{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sides :- ");
        float sides = in.nextFloat();
        
        double ans = area(sides );
        System.out.println("Total Surface Area Of Cube :- "+ans);
	    
	}
	static double area(float a){
        
        double tsa = 6*(a*a);
        return tsa;
    }
}
