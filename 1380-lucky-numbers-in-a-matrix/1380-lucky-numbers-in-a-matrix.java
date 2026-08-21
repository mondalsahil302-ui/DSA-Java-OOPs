class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            int min = matrix[i][0];
            int min_index = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    min_index = j;
                }
            }

            ans.add(min);
            index.add(min_index);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < ans.size(); i++) {

            int max = ans.get(i);
            int col = index.get(i);

            boolean lucky = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > max) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                result.add(max);
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna