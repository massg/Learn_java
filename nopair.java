import java.util.*;

class nopair{
  public static int getValue(int[] ar,int k){
    int count = 0;
    HashSet<Integer> hash = new HashSet<>();
    for(int i=0;i<ar.length;i++)
      hash.add(ar[i]+k);
    Iterator i = hash.iterator();
    int start = 0;
    while(i.hasNext()){
      int te =(int) i.next();
      while(start<ar.length)
        if(te==ar[start++]){
          count++;
          break;
        }
    }
    return count;
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int ar[] = new int[n];
    for(int i=0;i<n;i++) ar[i] = s.nextInt();
    Arrays.sort(ar);
    System.out.println(getValue(ar,k));
  }
}
