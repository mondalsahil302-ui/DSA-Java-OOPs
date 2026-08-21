class Solution {
    public int largestAltitude(int[] gain) {
        int[]ans=new int[gain.length];
        int g=0;
        for(int i=0;i < gain.length;i++)
        {
             g = g + gain[i];
            ans[i]= g;
        }
           int max = 0;
        for(int i=0;i < ans.length;i++)
        {
            if(ans[i]>max)
            {
                max=ans[i];
            }
        }
         return  max;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna