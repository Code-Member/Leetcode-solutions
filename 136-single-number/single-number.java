class Solution {
    //single Number
    public int singleNumber(int[] nums) {
          int result = 0;
         
         for(int num : nums)
         {
            result = result ^ num;
         }

         return result;
    }
}