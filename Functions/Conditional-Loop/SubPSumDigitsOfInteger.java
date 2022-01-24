//Subtract the Product and Sum of Digits of an Integer..
class Solution {
      Scanner in = new Scanner(System.in);
    int ans = subtractProductAndSum(234);
    int rem , p = 1 , s = 0 , sub = 0;
    public int subtractProductAndSum(int n) {
       while(n>0){
		    rem =n%10;
		    p *=rem;
		    s+=rem;
		    n =n/10;
       }
           sub= p-s;
        return sub;
  }
}
