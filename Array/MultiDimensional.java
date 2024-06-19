package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		System.out.println(arr.length);
		
		//input
		for(int row = 0 ; row < arr.length ; row++) {
			//now we take every row
			for(int col = 0 ; col < arr[row].length ; col++) {
				arr[row][col] = in.nextInt();
			}
		}
		
		//output
		for(int row = 0 ; row < arr.length ; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
//			//now we take every row
//			for(int col = 0 ; col < arr[row].length ; col++) {
//			System.out.print(arr[row][col]+" ");
//			}
//			System.out.println();


	}

}
 
