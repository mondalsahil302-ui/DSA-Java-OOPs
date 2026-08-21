class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[2 * nums.length ];
        for(int i=0;i< nums.length;i++)
        {
          ans[i] = nums[i];
          ans[i + nums.length] = nums[i];
        }
        return ans;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna