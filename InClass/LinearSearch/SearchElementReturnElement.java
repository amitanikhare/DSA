public class Main{
  public static void main(String[] args){
    int[] nums ={23,45,1,2,8,19,-3,16,-11,28};
    int target = 19;
    int ans = linearSearch(nums , target);
    System.out.println(ans);
  }
  //search in the array return the index if item found 
  //otherwise if item not found return -1
  static int linearSearch(int[] arr, target){
    if(arr.length == 0){
      return -1;
    }
    //run a for loop 
    for(int element : arr){
      //check for element at every index if it is target
      if(element == target){
        return element;
      }
    }
    //this line will execute if none of the return statement above have executed
    //hence the target not found
    return MAX_VALUE;
  }
}
