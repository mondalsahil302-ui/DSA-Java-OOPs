class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (j == i) {
                    continue;
                } else {

                    int sum = nums[i] + nums[j];

                    if (sum == target) {

                        arr[0] = i;
                        arr[1] = j;

                        return arr;
                    }
                }
            }
        }

        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna