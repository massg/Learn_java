// https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums[0];
        int i =1;
        while(i < nums.length){
            n^=nums[i++];
        }
        return n;

    }
}
