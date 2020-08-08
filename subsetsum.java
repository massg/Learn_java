import java.util.*;
class subsetsum{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int set[] = new int[n];
    for(int i=0;i<n;i++) set[i] = s.nextInt();
    int sum = s.nextInt();
    int dp[][] = new int[n+1][sum+1];
    for(int i=0;i<=n;i++){
      for(int j=0;j<=sum;j++){
        if(j==0) dp[i][j] = 1;
        else if(i==0) dp[i][j] = 0;
        else{
          if(set[i-1]<=j && i-1>=0){
            dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-set[i-1]]);
          }
          else{
            dp[i][j] = dp[i-1][j];
          }
        }
      }
    }
    System.out.println("");
    for(int i=0;i<=n;i++){
      for(int j=0;j<=sum;j++){
        System.out.printf("%d ",dp[i][j]);
      }
      System.out.println("");
    }
    System.out.println("Subset :");
    int i =n,j=sum;
    while(i!=0 && j!=0){
      if(dp[i-1][j] == 1) i--;
      else{
        System.out.printf("%d ",set[i-1]);
        j=j-set[i-1];
        i--;
      }
    }
  }
}
