import java.util.*;

class maxSize{
  static int min(int a,int b,int c){
    return a>b?(a>c?a:b):(b>c?b:c);
  }
  public static  void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int[][] ar = new int[n][m];
    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        ar[i][j] = s.nextInt();
    //base case is the first col elemts and row elemts
    for(int i=1;i<n;i++){
      for(int j=1;j<m;j++){
        if(ar[i][j] == 0) continue;
        ar[i][j] = min(ar[i][j-1],ar[i-1][j],ar[i-1][j-1])+1;
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++)
          System.out.printf("%d ",ar[i][j]);
      System.out.println("");
  }
}
}
