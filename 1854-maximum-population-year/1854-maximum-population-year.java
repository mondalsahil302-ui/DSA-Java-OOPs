class Solution {
    public int maximumPopulation(int[][] logs) {

        int max = 0;
        int max_pop = 1950;

        for (int year = 1950; year < 2050; year++) {

            int c = 0;

            for (int j = 0; j < logs.length; j++) {

                int birth_year = logs[j][0];
                int death_year = logs[j][1];

                if (year >= birth_year && year < death_year) {
                    c++;
                }
            }

            if (c > max) {
                max = c;
                max_pop = year;
            }
        }

        return max_pop;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna