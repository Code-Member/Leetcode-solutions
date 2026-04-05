class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        // Use a set to store unique transformations
        Set<String> set = new HashSet<>();
        
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            
            set.add(sb.toString());
        }
        
        return set.size();
    }
}