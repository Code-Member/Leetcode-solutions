import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        StringBuilder word = new StringBuilder();
        String result = "";
        int max = 0;

        paragraph = paragraph.toLowerCase();

        for (int i = 0; i <= paragraph.length(); i++) {

            if (i < paragraph.length() && Character.isLetter(paragraph.charAt(i))) {
                word.append(paragraph.charAt(i));
            } else {
                if (word.length() > 0) {
                    String w = word.toString();

                    if (!bannedSet.contains(w)) {
                        map.put(w, map.getOrDefault(w, 0) + 1);

                        if (map.get(w) > max) {
                            max = map.get(w);
                            result = w;
                        }
                    }

                    word.setLength(0);
                }
            }
        }

        return result;
    }
}