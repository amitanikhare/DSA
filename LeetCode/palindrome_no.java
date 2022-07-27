// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward.

// For example, 121 is a palindrome while 123 is not.
 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// code:-
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x>=2147483647)
            return false;
        int num = 0;
        int y = x;
        while(x>0){
            num = num *10;
            if(num>2147483647)
                return false;
            num = num+(x%10);
            x= x/10;
        }
        if(num == y)
            return true;
        else
            return false;
    }
}
