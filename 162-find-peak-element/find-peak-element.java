class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                right = mid;  // peak is on the left (including mid)
            } else {
                left = mid + 1; // peak is on the right
            }
        }
        
        return left; // or right (both are same)
    }
}