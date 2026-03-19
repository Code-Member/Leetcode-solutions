class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = sb.length();
            
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // remove duplicate
            } else {
                sb.append(c); // add character
            }
        }
        
        return sb.toString();
    }
}