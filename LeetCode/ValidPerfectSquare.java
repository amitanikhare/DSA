import java.lang.Math;
class Solution {
    public boolean isPerfectSquare(int num) {


 if (Math.ceil((double)Math.sqrt(num)) ==
        Math.floor((double)Math.sqrt(num))) 
        {
            return true;
        }
        return false;
    }
}
