package Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        //Increment for the character in the count array
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        //Decrement if element is present in the t array
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int value : count) {
            if (value != 0)
                return false;
        }
        return true;
    }
}
