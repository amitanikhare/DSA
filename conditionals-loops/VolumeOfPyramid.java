//Volume Of Pyramid
import java.util.*;
class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length :- ");
        float length = in.nextFloat();
        System.out.println("Enter width :- ");
        float width = in.nextFloat();
        System.out.println("Enter height :- ");
        float height = in.nextFloat();
        double volume = (length*width*height)/3;
        System.out.println("Volume Of Pyramid :- "+volume);
    }
}
