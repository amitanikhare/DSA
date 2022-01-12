//Reverse A String In Java
import java.util.*;
public class RevString{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String rev=" ";
		String str = "me";
		 for (int i=str.length()-1; i>=0; i--){
		    rev +=str.charAt(i);
		}
		System.out.println(rev);
	}
}
