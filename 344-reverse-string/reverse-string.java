class Solution {
    public void reverseString(char[] s) {
            
            String reverse = "";
        for( int i =s.length-1; i >= 0; i-- )
        {
              reverse += s[i];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = reverse.charAt(i);
        }
    }
}