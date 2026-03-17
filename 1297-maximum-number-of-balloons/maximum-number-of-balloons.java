class Solution {
    public int maxNumberOfBalloons(String text) {
         int[] freq = new int[26];

        // Count frequency of each character
        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }

        // Calculate how many times we can form "balloon"
        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2; // 'l' appears twice
        int o = freq['o' - 'a'] / 2; // 'o' appears twice
        int n = freq['n' - 'a'];

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}