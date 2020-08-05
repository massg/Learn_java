import java.util.*;
class MaxHeap{
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[] heap = new int[n];
      int child=0,parent=0;
      for(int i=0;i<n;i++){
        heap[i] = s.nextInt();
        child = i;
        parent = (child-1)/2;
        while(child!=0 && heap[parent]<heap[child]){
          int t = heap[parent];
          heap[parent] = heap[child];
          heap[child] = t;
          child = parent;
          parent = (child-1)/2;
        }
      }
      for(int i =0;i<n;i++) System.out.printf("%d ",heap[i]);
    }
}
