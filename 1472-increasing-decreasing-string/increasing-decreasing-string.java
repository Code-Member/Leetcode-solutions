class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        // Keep building until all characters are used
        while (result.length() < s.length()) {

            // Increasing order (a → z)
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }

            // Decreasing order (z → a)
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }

        return result.toString();
    }
}