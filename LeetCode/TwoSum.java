// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// code :-
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap();
        
        for(int i = 0 ; i <nums.length ;i++){
            map.put(nums[i],i);
        }
        for(int i = 0 ; i<=nums.length ; i++){
            int num = nums[i];
            int rem = target-num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index == i)continue;
                return new int[]{i,index};
            }
        }
        return new int []{};
    }
}
