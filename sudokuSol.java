import java.util.*;

class sudokuSol{
  public static boolean isSafe(int[][] board,
                                 int row, int col,
                                 int num)
    {
        for (int d = 0; d < board.length; d++) {
            if (board[row][d] == num) {
                return false;
            }
        }
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart;
             r < boxRowStart + sqrt; r++) {
            for (int d = boxColStart;
                 d < boxColStart + sqrt; d++) {
                if (board[r][d] == num) {
                    return false;
                }
            }
        }
        return true;
    }
  static boolean solve(int[][] s){
    int row = -1;
    int col = -1;
    boolean isEmpty = true;
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        if(s[i][j] == 0){
          row=i;
          col=j;
          isEmpty = false;
          break;
        }
      }
      if(!isEmpty) break;
    }

    if(isEmpty){
      return true;
    }
    for (int num = 1; num <= 9; num++) {
            if (isSafe(s, row, col, num)) {
                s[row][col] = num;
                if (solve(s)) {
                    return true;
                }
                else {
                    s[row][col] = 0;
                }
            }
        }
        return false;
  }
  public static void main(String[] args){
    int[][] sudoku = new int[9][9];
    Scanner s = new Scanner(System.in);
    // Empty cell is represented by 0
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        sudoku[i][j] = s.nextInt();
      }
    }

    if(solve(sudoku)){
      for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
          System.out.printf("%d ",sudoku[i][j]);
        }
        System.out.println("");
      }
    }
    else{
      System.out.println("No solution");
    }

  }
}
