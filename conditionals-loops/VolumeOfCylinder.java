//Volume Of Cylinder
import java.util.*;
class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        double volume = 3.14*(radius*radius)*height;
        System.out.println("Volume Of Cylinder :- "+volume);
    }
}
