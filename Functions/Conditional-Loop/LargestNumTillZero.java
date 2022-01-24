//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    
        int num = 0;
        sum(num);
         
    }
    static void sum(int n){
        Scanner in = new Scanner(System.in);
		int prev=0 , no,max=0;
		while(true){
		    no = in.nextInt();
		    
		    if(no>prev){
		        max = no;
		    }
		    prev = no;
		    if(no == 0){
		        System.out.println("largest no. is: "+max);
		        break;
		    }
		}
		
	}
}
