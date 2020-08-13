import java.util.*;

class knightTour{
  static int x[] ={-2,-2,-1,1,-1,1,2,2};
  static int y[] ={-1,1,-2,-2,2,2,-1,1};
  static void refresh(int[][] board,int n){
    for(int i=0;i<n;i++)
      Arrays.fill(board[i],-1);
  }
  static boolean isSafe(int[][] board,int r,int c){
    int n = board.length;
      if(r<0||r>=n||c<0||c>=n||board[r][c] != -1) return false;
      return true;
  }
  static boolean solve(int[][] board,int theKnight,int n,int row,int col){
      if(theKnight == n*n) return true;
      else{
        for(int i=0;i<8;i++){
          if(isSafe(board,row+x[i],col+y[i])){
            board[row+x[i]][col+y[i]] = theKnight;
            if(solve(board,theKnight+1,n,row+x[i],col+y[i])) return true;
            else{
              board[row+x[i]][col+y[i]] = -1;
            }
          }
        }
      }
      return false;
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter chess board size");
    int n = s.nextInt();
    int board[][] = new int[n][n];
    refresh(board,n);
    int f=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        board[i][j] = 0;
        if(solve(board,1,n,i,j)){
          f=1;
          for(int k=0;k<n;k++)
          {
            for(int l=0;l<n;l++)
              System.out.printf("%d ",board[k][l]);
          }
          System.out.println("");
        }
        refresh(board,n);
      }
    }

    if(f==0) System.out.println("No solution");

  }
}
