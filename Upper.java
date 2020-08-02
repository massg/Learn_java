// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/

class Solution {
    public boolean detectCapitalUse(String word) {
        char w[] = word.toCharArray();
        boolean first = Character.isUpperCase(w[0]);
        if(w.length == 1) return true;
        if(first){
            if(w.length == 2) return true;
            boolean second = Character.isUpperCase(w[1]);
            if(second){
                for(int i=2;i<w.length;i++)
                     if(!Character.isUpperCase(w[i])) return false;
                return true;
            }
            else{
                for(int i=2;i<w.length;i++)
                     if(Character.isUpperCase(w[i])) return false;
                return true;
            }
        }
        else{
            for(char i:w){
                if(Character.isUpperCase(i)) return false;
            }
            return true;
        }
    }
}
