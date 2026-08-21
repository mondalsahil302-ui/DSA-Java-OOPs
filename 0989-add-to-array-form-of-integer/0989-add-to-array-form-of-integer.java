import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        String a = "";

        for (int i = 0; i < num.length; i++) {
            a = a + num[i];
        }

        long nums = Long.parseLong(a);

        long sum = nums + k;

        int i = 0;

        while (sum != 0) {

            long n = sum % 10;

            ans.add((int)n);

            sum = sum / 10;

            i++;
        }

        List<Integer> result = new ArrayList<>();

        for (int j = i - 1; j >= 0; j--) {
            result.add(ans.get(j));
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna