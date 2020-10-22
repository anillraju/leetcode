package leetcode.array.easy;

import java.util.Arrays;

public class ContainsDuplicate217 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            if(nums.length < 2){
                return false;
            }

            Arrays.sort(nums);
            int prev = nums[0];
            for(int i=1 ; i < nums.length; i++){
                if(nums[i] == prev){
                    return true;
                }
                prev = nums[i];
            }

            return false;
        }
    }
}
