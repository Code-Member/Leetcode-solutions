class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;  // pointer for children
        int cookie = 0; // pointer for cookies

        // Try to satisfy children one by one
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                // Cookie can satisfy this child
                child++;
            }
            // Move to the next cookie regardless
            cookie++;
        }

        return child;
    }
}