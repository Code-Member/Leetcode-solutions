import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();

            if (belongsToRow(lower, row1) ||
                belongsToRow(lower, row2) ||
                belongsToRow(lower, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean belongsToRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}