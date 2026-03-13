class Solution {
    public boolean equalFrequency(String word) {
       int[] freq = new int[26];

        // count frequency of each character
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // try removing one occurrence of each character
        for (int i = 0; i < 26; i++) {

            if (freq[i] == 0) continue;

            freq[i]--; // remove one character

            int f = 0;
            boolean equal = true;

            for (int j = 0; j < 26; j++) {
                if (freq[j] == 0) continue;

                if (f == 0) {
                    f = freq[j];
                } else if (freq[j] != f) {
                    equal = false;
                    break;
                }
            }

            freq[i]++; // restore

            if (equal) return true;
        }

        return false; 
    }
}