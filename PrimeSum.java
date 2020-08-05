
import java.util.*;
class PrimeSum{
  static int getPrimeSum(int[] p){
    int c = 0,sum=0;
    for(int i=0;i<p.length;i++){
      sum+=p[i];
      if(isPrime(sum)) c++;
    }
    return c;
  }
  private static boolean isPrime(int n){
    int f=1;
    for(int j=2;j<=n/2;j++){
      if(n%j == 0){
        f=0;
        break;
      }
    }
    if(f==1) return true;
    return false;
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] prime = new int[25];
    int k=0;
    for(int i=2;i<=n;i++){
      if(isPrime(i)){
        prime[k++] = i;
      }
    }
    int count = getPrimeSum(prime);
    System.out.println(count);
  }
}
