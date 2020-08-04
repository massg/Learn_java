https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int carry = 0,i;

        for(i=digits.length-1;i>=0;i--){
            if(carry!=0){
                digits[i]+=carry;
                if(digits[i]>9) {
                    carry =1;
                    arr.add(digits[i]%10);
                }
                else {arr.add(digits[i]);
                      carry = 0;}
            }
            else {
                if(i!=digits.length-1)
                    arr.add(digits[i]);
                else{
                    int x = digits[digits.length-1]+1;
                    arr.add(x%10);
                    if(x>9)
                        carry = 1;
                }
            }
        }
        if(carry == 1 && i<0) arr.add(carry);
        int k=arr.size()-1;
        int[] ans = new int[arr.size()];
        for(i=0;i<arr.size();i++){
            ans[i] = arr.get(k--);
        }
        return ans;
    }
}
