//https://leetcode.com/problems/number-of-good-pairs/submissions/

//Solution of the problem is given; main() is not provided ; Note the class name is also not the saame

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i<j && nums[i] == nums[j])
                    count++;
            }
        }
        return count;

    }
}
