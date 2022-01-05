//Volume Of Cone Java Program
import java.util.*;
class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        double volume = 3.14*(radius*radius)*(height/3);
        System.out.println("Volume Of Cone :- "+volume);
    }
}
