//https://leetcode.com/problems/lru-cache

class LRUCache {
    Node head = new Node();
    Node tail = new Node();
    Map<Integer,Node> cachemap;
    int Cache_capacity;

    public LRUCache(int capacity) {
        cachemap = new HashMap(capacity);
        Cache_capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int res = -1;
        Node node = cachemap.get(key);
        if(node!=null){
            res = node.val;
            remove(node);
            add(node);
        }
        return res;
    }

    public void put(int key, int value) {
        Node node = cachemap.get(key);
        if(node!=null){
            remove(node);
            node.val = value;
            add(node);
        }
        else{
            if(cachemap.size() == Cache_capacity){
                cachemap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            cachemap.put(key,new_node);
            add(new_node);

        }
    }

    public void add(Node node){
        Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;
    }
    public void remove(Node node){
        Node next_node = node.next;
        Node prev_node = node.prev;
        node.prev.next = next_node;
        node.next.prev = prev_node;
    }
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
