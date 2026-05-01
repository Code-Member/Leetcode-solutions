class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // If no operations, entire matrix has same value
        if (ops == null || ops.length == 0) {
            return m * n;
        }

        int minA = m;
        int minB = n;

        // Find minimum a and b
        for (int[] op : ops) {
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }

        // The overlapping region count
        return minA * minB;
    }
}