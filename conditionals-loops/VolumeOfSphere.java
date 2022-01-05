//Volume Of Sphere
import java.util.*;
class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        double volume = (4/3)*3.14*(radius*radius*radius);
        System.out.println("Volume Of Sphere :- "+volume);
    }
}
