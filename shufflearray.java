//https://leetcode.com/problems/shuffle-the-array/

//Solution of the problem is given; main() is not provided ; Note the class name is also not the same

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] temp = new int[len];
        for(int i=0,j=0,k=n;i<len;i++){
            if(i%2 == 0)
                temp[i] = nums[j++];
            else
                temp[i] = nums[k++];
        }
        return temp;
    }
}
