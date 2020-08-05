//https://www.geeksforgeeks.org/minimum-sum-product-two-arrays/
import java.util.*;
class MinProdArray{
  static int getProd(int[] ar1,int[] ar2,int n){
    int sum=0;
    for(int i=0;i<n;i++){
      sum+=(ar1[i]*ar2[i]);
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] ar1 = new int[n];
    int[] ar2 = new int[n];
    int k = s.nextInt();
    for(int i=0;i<n;i++) ar1[i] = s.nextInt();
    for(int i=0;i<n;i++) ar2[i] = s.nextInt();
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      int temp = ar1[i];
       ar1[i] += 2*k;
       int x = getProd(ar1,ar2,n);
       if(min>x) min = x;
       ar1[i] = temp;
       ar1[i] -= 2*k;
       x = getProd(ar1,ar2,n);
       if(min>x) min = x;
       ar1[i] = temp;

    }
    System.out.println(min);
  }
}
