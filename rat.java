import java.util.*;
class rat{
  static x[] = {0,1};
  static y[] = {1,0};
  static void solve(int[][] m,int row,int col){
    if(row==m && col==n) {
      int c = 0;
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          if(m[i][j] == true)
            c++;
        }
      }
      System.out.println(c);
      return;
    }
    else{
      for(int i=0;i<2;i++){
        int n_i = row+x[i];
        int n_j = col+y[i];
        if(isSafe(m,n_i,n_j))
          maze[n_i][n_j] = true;
      }
    }
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    //Maze size
    int m = s.nextInt();
    int n = s.nextInt();

    //rat current location is (0,0) and has to reach (m-1,n-1)
    boolean maze[][] = new boolean[m][n];
    solve(maze,0,0);



  }
}
