class Solution {
    public int heightChecker(int[] heights) {
         
         int[] expected = heights.clone();   // copy arrays
         Arrays.sort(expected);  // sort arrays.

         int count = 0;

         for( int i =  0 ; i < heights.length; i++)
         {
            if(  heights[i] != expected[i])
            {
                 count++;
            }
         } 

       return count;

    }
}