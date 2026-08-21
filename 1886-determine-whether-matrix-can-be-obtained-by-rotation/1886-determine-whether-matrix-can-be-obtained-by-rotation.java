class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {

        for (int r = 0; r < 4; r++) {
            boolean same = true;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (mat[i][j] != target[i][j]) {
                        same = false;
                    }
                }
            }

            if (same) {
                return true;
            }

            mat = rotate90(mat);
        }

        return false;
    }

    public int[][] rotate90(int[][] mat) {

        int[][] ans = new int[mat.length][mat.length];

        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                ans[j][i] = mat[i][j];
            }
        }

        int[][] ans1 = new int[mat.length][mat.length];

        for (int i = 0; i < ans.length; i++) {
            int k = 0;

            for (int j = ans.length - 1; j >= 0; j--) {
                ans1[i][k] = ans[i][j];
                k++;
            }
        }

        return ans1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna