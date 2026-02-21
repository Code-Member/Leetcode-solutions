class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            boolean[] row = new boolean[n + 1];
            boolean[] col = new boolean[n + 1];

            for (int j = 0; j < n; j++) {

                int rowVal = matrix[i][j];
                int colVal = matrix[j][i];

                // Check row
                if (rowVal < 1 || rowVal > n || row[rowVal]) {
                    return false;
                }
                row[rowVal] = true;

                // Check column
                if (colVal < 1 || colVal > n || col[colVal]) {
                    return false;
                }
                col[colVal] = true;
            }
        }

        return true;
    }
}