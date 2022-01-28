//Reverse A String In Java
import java.util.*;
public class ReverseString{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the string :- ");
	    String s = in.nextLine();
	    
	    String ans = reverse(s);
	    System.out.println(ans);
	}
	
	static String reverse(String str){
	   	    
		String rev="";
		
		 for (int i=str.length()-1; i>=0; i--){
		    rev +=str.charAt(i);
		}
		System.out.println("After reverse :-");
		return rev;
	}
}
