// https://leetcode.com/problems/valid-anagram/

class Solution {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if( s=="" && t == "") return true;
        HashMap<Character,Integer> hash1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> hash2 = new HashMap<Character,Integer>();
        char[] s1 = s.toCharArray();
        for(char i:s1){
                hash1.put(i,hash1.getOrDefault(i,0)+1);
        }
        char[] s2 = t.toCharArray();
        for(char i:s2){
                hash2.put(i,hash2.getOrDefault(i,0)+1);
        }
        if(hash1.equals(hash2)) return true;

        else return false;
    }
}
