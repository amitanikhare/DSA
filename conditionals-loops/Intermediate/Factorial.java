//Factorial Program In Java.
public class Factorial{
	public static void main(String[] args) {
		int fact=1 ,no = 4;
		for(int i = 1 ; i<=no;i++){
		    fact*=i;
		}
		 System.out.println("Factorial of "+no+" is: "+fact);  
	}
}
