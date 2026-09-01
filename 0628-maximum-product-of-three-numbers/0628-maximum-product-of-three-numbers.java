import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int opt1=  nums[nums.length-1] 
                  * nums[nums.length-2] 
                  * nums[nums.length-3];
        int opt2= nums[0]
                * nums[1]
                * nums[nums.length-1];
        return Math.max(opt1, opt2);
    }
}