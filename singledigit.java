// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

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
