class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {

                if (i == j) {
                    sum = sum + mat[i][j];
                }
                else if (i + j == mat.length - 1) {
                    sum = sum + mat[i][j];
                }

            }
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna