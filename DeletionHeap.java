class DeletionHeap{
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

    int i=0;
    int k = n-1;
    int left,right,index;

      while(k>0){
        int t = heap[i];
        heap[i] = heap[k];
        heap[k] = temp;
        k--;
        while(1){
          left = 2*i+1;
          right = 2*i+1;

          if(left<=k && right<=k){
             index = Math.max(heap[left],heap[right]);
             if(heap[i]<heap[index]){
               int temp = heap[i];
               heap[i] = heap[index];
               heap[index] = temp;
               i = index;
             }
             else break;
           }
           else if(left<=k){
             if(heap[i]<heap[left]){
               int temp = heap[i];
               heap[i] = heap[index];
               heap[index] = temp;
               i= left;
             }
             else break;
           }
           else{
             break;
           }
    }


    }



  }
}
