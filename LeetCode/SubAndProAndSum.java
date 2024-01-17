package leetcode;
//Input: n = 234
//Output: 15 
//Explanation: 
//Product of digits = 2 * 3 * 4 = 24 
//Sum of digits = 2 + 3 + 4 = 9 
//Result = 24 - 9 = 15


public class SubAndProAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 234;
		int add = 0 , product = 1, sub , sum = 0 ;
		
		while(n!=0) {
			
			product = product * (n % 10);
			sum = sum + n % 10; 
	        n = n / 10;   
		}
		System.out.println(product);
		sub = product - sum;
		 System.out.println(sub);
	}

}
