import java.util.*;
class targetprev2{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int[] ar = new int[n];
    for(int i=0;i<n;i++) ar[i] = s.nextInt();
    for(int i = 0;i<n;i++){
      if(ar[i] < 50) continue;
      int x = (ar[i]*k)/100;
      ar[i] -=x;
    }
    for(int i = 0;i<n;i++){
      System.out.print(ar[i]+" ");
    }
  }
}
