//Calculate Batting Average
import java.util.*;
public class CalBattingAverage{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Runs: ");
        int run = input.nextInt();
        System.out.println("Enter number of matches");
        int mtchs=input.nextInt();
        System.out.println("Enter number of not-out matches");
        int nout=input.nextInt();
		
		avgMatches(run , mtchs , nout);
	}
	static void avgMatches(int runs , int matches , int notout){
        
        int outmatches=matches-notout;
        double baverage=runs/outmatches;
        System.out.println("Batting Average= "+baverage);

    }
}
