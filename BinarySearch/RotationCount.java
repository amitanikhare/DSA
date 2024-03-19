package leetcode;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {4,5,6,7,8,0,1,2};
		System.out.println(countRotations(arr));

	}

	private static int countRotations(int[] arr) {
		// TODO Auto-generated method stub
		
		int pivot = findpivot(arr);
//		if (pivot == -1) {
//			//array is not rotated
//			return 0;
//		} 
		return pivot + 1;
	}
	
	//this will not work on duplicate values
		static int findpivot(int[] arr) {
			int start = 0 ;
			int end = arr.length - 1 ;
			
			while(start <= end) {
				
				int mid = start + (end - start)/2;
				
				//4 cases over here
				
				if (mid < end && arr[mid] > arr[mid + 1]) {
					return mid;
				}
				if (arr[mid] < arr[mid - 1]) {
					return mid - 1;
				}
				if (arr[mid] <= arr[start]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
				
			}
			return -1;
		}
		
		//use this for duplicates values
			static int findpivotWithDuplicates(int[] arr) {
				int start = 0 ;
				int end = arr.length - 1 ;
				
				while(start <= end) {
					
					int mid = start + (end - start)/2;
					
					//4 cases over here
					
					if (mid < end && arr[mid] > arr[mid + 1]) {
						return mid;
					}
					if (mid > start && arr[mid] < arr[mid - 1]) {
						return mid - 1;
					}
					//if elements at middle , start , end are equal then just skip the duplicates	
					if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
						//skip the duplicates
						//NOTE : what if these elements at start and end were the pivot??
						//check if start is pivot
						if (arr[start] > arr[start + 1]) {
							return start;
						}
						start++;
						//check if start is pivot
						if (arr[end] < arr[end - 1]) {
							return end - 1;
						}
						end--;
					}
					//left side is sorted , so pivot should be in right
					else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
						start = mid + 1;
					}else {
						end = mid - 1;
					}
				}
				return -1;
			}

}
