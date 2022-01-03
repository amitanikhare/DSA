//Take name as input and print a greeting message for that name.
import java.util.*;
class GreetingMsg {
    public static void main(String[] args) {
        System.out.println("enter name: "); 
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name);
    }
}
