  // Single Number ||
class Solution {
    public int singleNumber(int[] nums) {
         int ones =0, twos=0;

         for(int num1 : nums)
         {
             ones = (ones ^ num1) & ~twos;
             twos = (twos ^ num1) & ~ones;
         }
         return ones;
    }
}