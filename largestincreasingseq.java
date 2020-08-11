import java.util.*;

class largestincreasingseq{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n= s.nextInt();
    int ar[] = new int[n];
    int dp[] = new int[n];
    for(int i=0;i<n;i++){
      ar[i] = s.nextInt();
      dp[i] = 1;
     }
     for(int i=0;i<n;i++){
       for(int i=0;j<i;i++){
         if(ar[j]<=ar[i]){
           if(dp[i]+1>dp[i]) dp[i] = dp[j]+1;
         }
       }
     }
     System.out.println(dp[n-1]);//

     
  }
}
