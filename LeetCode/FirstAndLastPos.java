package leetcode;


//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstAndLastPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {5,7,7,8,8,10};
		int target = 8;
		
		System.out.println(searchRange(n , target));
		

	}
  static int[] searchRange(int[] nums, int target) {
	 
	 int[] ans = {-1,-1};
	 
	 ans[0] = search(nums, target, true); 
	 
	 if(ans[0] != -1)
	  ans[1] = search(nums, target, false);

	 return ans;
    }
 
 //this function just returns the index value of target
 static int search(int[] nums , int target , boolean findStartIndex) {
	 int ans = -1;
	 int start = 0 ;
		int end = nums.length -1;
		
		while(start <= end) {
			//find the middle element 
			//int mid = (start + end) / 2; //might be possible that (start + end) exceed
			
			int mid = start +(end - start)/2;
			
			if(target < nums[mid]) {
				end = mid - 1;
			}else if(target > nums[mid]) {
				start = mid + 1;
			}else {
				//potential ans found
				ans = mid;
				
				if(findStartIndex) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}
			
		}
		return ans;	
 }
 

}
