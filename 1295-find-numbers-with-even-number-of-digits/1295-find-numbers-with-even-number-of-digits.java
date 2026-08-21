class Solution {
    public int findNumbers(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            int a = nums[i];
            int c = 0;

            while (a != 0) {

                a = a / 10;
                c++;
            }

            if (c % 2 == 0) {
                sum++;
            }
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna