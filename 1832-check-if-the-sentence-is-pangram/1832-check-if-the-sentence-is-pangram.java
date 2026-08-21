import java.util.*;

class Solution {
    public boolean checkIfPangram(String sentence) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }

        if (set.size() == 26)
        {
            return true;
        }
        else {
        return false; 
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna