//Java Program Vowel Or Consonant
import java.util.*;
public class VowelOrConsonant
{
	public static void main(String[] args) {
		System.out.println("Enter any alphabet: ");
		Scanner in = new Scanner(System.in);
		char v = in.next().charAt(0);
		check(v);
	}
	static void check(char vovel){
		
		if(vovel=='a' ||vovel=='e' ||vovel=='i' ||vovel=='o' ||vovel=='u' ||
		vovel=='A' ||vovel=='E' ||vovel=='I' ||vovel=='O' ||vovel=='U' ){
		    System.out.println("given char is Vowel ");
		}else{
		    System.out.println("given char is Consonant");
		}
	}
}
