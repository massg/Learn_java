//https://leetcode.com/contest/weekly-contest-198/problems/water-bottles/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int max = numBottles;
        while(numBottles/numExchange > 0){
            max+=(numBottles/numExchange);
            int r = numBottles%numExchange;
            numBottles = (numBottles/numExchange)+r;
        }
        return max;
    }
}
