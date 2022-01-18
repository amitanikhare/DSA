//Take name as input and print a greeting message for that name.
import java.util.*;
public class Greeting{
  public static void main (String[]args){
      Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    greeting (name);
  }
  static void greeting (String naam){
    System.out.println("Hello "+naam);
    }
}
