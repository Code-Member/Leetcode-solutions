class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (vowels.indexOf(word.charAt(0)) != -1) {
                word = word + "ma";
            } else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }
            
            // add 'a' (i+1) times
            for (int j = 0; j <= i; j++) {
                word += "a";
            }
            
            result.append(word);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}