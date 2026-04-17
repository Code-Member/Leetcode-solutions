import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char digit : num.toCharArray()) {
            // Remove larger digits from the stack
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > digit) {
                stack.pollLast();
                k--;
            }
            stack.offerLast(digit);
        }
        
        // If k still remains, remove from the end
        while (k > 0) {
            stack.pollLast();
            k--;
        }
        
        // Build result and remove leading zeros
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        
        for (char digit : stack) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            result.append(digit);
        }
        
        return result.length() == 0 ? "0" : result.toString();
    }
}