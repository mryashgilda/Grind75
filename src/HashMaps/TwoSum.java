package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        //Finding the Complement is an interesting approach as it takes your thought process to look at the
        //problem from a different approach than checking every element but by helping you find the complement if it is available in the HashMap
        //If not it will try to find it using the second element and check if the

        for (int i = 0; i < n; i++) {
           int complement = target - nums[i];
           if (numMap.containsKey(complement)) {
               return new int[]{numMap.get(complement), i};
           }
           numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
