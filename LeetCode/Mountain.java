package leetcode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,0};
		
		System.out.println(peakIndexInMountainArray(arr));

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
}
