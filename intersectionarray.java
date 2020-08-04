// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;

            }else{
            i++;}
        }

        int [] arr= new int[a.size()] ;
        for(int k=0;k<a.size();k++){
            arr[k]=a.get(k);
        }
    return arr;
    }
}
