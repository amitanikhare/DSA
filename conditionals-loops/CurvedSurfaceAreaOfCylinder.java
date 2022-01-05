//Curved Surface Area Of Cylinder
import java.util.*;
class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        double volume = 2*3.14*(radius*radius)+2*3.14*radius*height;
        System.out.println("Curved Surface Area Of Cylinder :- "+volume);
    }
}
