package leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class TwosSum1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numSet = new HashMap<Integer, Integer>();

            for(int i = 0; i < nums.length; i++){
                int num = nums[i];

                if(numSet.get(target - num) != null){
                    return new int[]{ i, numSet.get(target - num) };
                } else {
                    numSet.put(num, i);
                }
            }

            return null;
        }
    }
}
