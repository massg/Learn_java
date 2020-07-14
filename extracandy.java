//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
//Solution of the problem is given; main() is not provided ; Note the class name is also not the same

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int n = candies.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++)
            temp[i] = candies[i];
        Arrays.sort(temp);
        int lar = temp[n-1];
        for(int i=0;i<n;i++){
            if(lar<= candies[i]+extraCandies)
                list.add(true);
            else list.add(false);
        }
        return list;
    }
}
