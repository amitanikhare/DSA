package BinarySearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int target = 7;
		
		System.out.println(orderAgnosticBS(arr, target));
		
	
	}
	
	static int orderAgnosticBS(int[] arr , int target) {
		
		int start = 0 ;
		int end = arr.length -1;

		 //find whether the array is sorted in ascending or descending
		boolean isAsc = arr[start] < arr[end];
			
		
		while(start <= end) {
			//find the middle element 
			//int mid = (start + end) / 2; //might be possible that (start + end) exceed
			
			int mid = start +(end - start)/2;
			
			if (arr[mid] == target) {
				return mid;
			}
			
			if (isAsc) {
				if(target < arr[mid]) {
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else {
				if(target > arr[mid]) {
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}
			
		}
		return -1;
	}

}