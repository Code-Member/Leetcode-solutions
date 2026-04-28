class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] baseFreq = new int[26];

        // Count frequency of chars
        for (char c : chars.toCharArray()) {
            baseFreq[c - 'a']++;
        }

        int totalLength = 0;

        // Check each word
        for (String word : words) {
            int[] freq = new int[26];
            boolean valid = true;

            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
                if (freq[c - 'a'] > baseFreq[c - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }
}