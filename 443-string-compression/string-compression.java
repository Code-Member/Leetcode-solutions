class Solution {
    public int compress(char[] chars) {
        int write = 0;  // position to write
        int read = 0;   // position to read

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            // Count occurrences of the current character
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = current;

            // Write the count if greater than 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}