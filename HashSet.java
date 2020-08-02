// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3410/

class MyHashSet {
    int hashsize = 10000;
    List<Integer>[] hash;
    /** Initialize your data structure here. */
    public MyHashSet() {
        hash  = new LinkedList[hashsize];
    }
    int function(int key){
        return key%hashsize;
    }
    public void add(int key) {
        int temp = function(key),f=0;
        if(hash[temp] == null) hash[temp] = new LinkedList<>();
        if(hash[temp].indexOf(key) == -1) hash[temp].add(key);
    }

    public void remove(int key) {
        int temp = function(key),f=0;
        if(hash[temp] == null) return ;
        if(hash[temp].indexOf(key) != -1) hash[temp].remove(hash[temp].indexOf(key));

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int temp = function(key),f=0;
        if(hash[temp] == null || hash[temp].indexOf(key) == -1) return false;
        return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
