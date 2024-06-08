package Linear_Search;

import java.util.Arrays;

public class SearchInTwoDArray {

	public static void main(String[] args) {
		
		int[][] arr = {
				{45,432,7,3},
				{56,32,9},
				{98,43,90}
		};

		int target = 9;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));
	}

	static int[] search(int[][] arr , int target) {
		for(int row = 0 ; row < arr.length ; row++) {
			for(int col = 0 ; col < arr[row].length ;col++ ) {
				if(arr[row][col] == target) {
					return new int[]{row,col} ;
				}
			}
		}
		return new int[]{-1 , -1};
	}
	
	
	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for(int row = 0 ; row < arr.length ; row++) {
			for(int col = 0 ; col < arr[row].length ;col++ ) {
				if(arr[row][col] > max) {
					max = arr[row][col] ;
				}
			}
		}
		return max;
	}
}
