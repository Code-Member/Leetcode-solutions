class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        
        int maxFreq = 0;
        for (int count : freq) {
            maxFreq = Math.max(maxFreq, count);
        }
        
        int countMax = 0;
        for (int count : freq) {
            if (count == maxFreq) {
                countMax++;
            }
        }
        return maxFreq * countMax;
    }
}