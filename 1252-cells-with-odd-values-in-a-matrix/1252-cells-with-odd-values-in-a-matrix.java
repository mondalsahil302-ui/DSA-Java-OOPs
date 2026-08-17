class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] ans = new int[m][n];

        for (int k = 0; k < indices.length; k++) {

            int row = indices[k][0];
            int col = indices[k][1];
            for (int j = 0; j < n; j++) {
                ans[row][j]++;
            }
            for (int i = 0; i < m; i++) {
                ans[i][col]++;
            }
        }
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (ans[i][j] % 2 != 0) {
                    count++;
                }

            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna