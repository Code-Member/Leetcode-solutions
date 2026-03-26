class Solution {
    public int totalNumbers(int[] digits) {
         int[] freq = new int[10];
        
        // Count frequency of each digit
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Iterate over all valid 3-digit even numbers
        for (int num = 100; num <= 998; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            freq[a]--;
            freq[b]--;
            freq[c]--;

            if (freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0) {
                count++;
            }

            // Restore frequency
            freq[a]++;
            freq[b]++;
            freq[c]++;
        }

        return count;
    }
}