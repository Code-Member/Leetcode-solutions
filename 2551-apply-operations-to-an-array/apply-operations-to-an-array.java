class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int count = 0;

          // modify array
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        // rearange array
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[count] = nums[j];
                count++;
            }
        }
        // fill remaining
        while (count < n) {
            nums[count] = 0;
            count++;
        }
        return nums;
    }
}
