//Volume Of Prism
import java.util.*;
class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base :- ");
        float base = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        double volume = base * height;
        System.out.println("Volume Of Prism :- "+volume);
    }
}
