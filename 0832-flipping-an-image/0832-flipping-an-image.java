class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][]ans=new int[image.length][image.length];
        for(int i= 0;i<image.length;i++)
        {
            int k=0;
            for (int j=image.length -1 ;j >= 0;j--)
            {
               ans[i][k] =image[i][j];
               k++;
            }
        }
        for(int p=0;p<ans.length;p++)
        {
            for(int n=0;n<ans.length;n++)
            {
                if (ans[p][n]==0)
                {
                    int z=ans[p][n];
                    ans[p][n]=1;
                }
                else
                {
                  int t=ans[p][n];
                  ans[p][n]=0;  
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna