package leetcode;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearInMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,3,1};
		
		int target = 3;
		System.out.println(search(arr, target));

		
	}
	
	static int search(int[] arr , int target) {
		int peak = peakIndexInMountainArray(arr);
		int firsTry = orderAgnosticBS(arr, target , 0 , peak);
		
		if (firsTry != -1) {
			return firsTry;
			
		}
		//try to search in second half 
		return orderAgnosticBS(arr, target, peak + 1, arr.length -1 );
	}

	 public static  int peakIndexInMountainArray(int[] arr) {
		 int start = 0 ;
		 int end = arr.length - 1;
		 
		 while(start < end) {
				int mid = start +(end - start)/2;
				
				if(arr[mid] > arr[mid +1]) {
					//you are in dec part of array
					//this maybe the ans , but look at the left
					//this is why end != mid - 1
					end = mid;
				}else {
					//you are in asc part of array
					start = mid + 1; //cause we know mid + 1 ele > mid ele
				}

		 }
		 // in the end , start == end and pointing to the largest no because of the 2 checks above
		 //start and end r always trying to findmax element in the above 2 checks
		 //hence , when they r pointing to just 1 ele , that is the max one because that is what the checks say
		 //more elaboration: at evey point of the time for start and end , they have the best possible ans till that time
		 // and if we r saying that only one item is remaining , hence cuz of above line that is the best possible ans
		 return start; 
	 }
	 static int orderAgnosticBS(int[] arr , int target , int start , int end) {
			

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
