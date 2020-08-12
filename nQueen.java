import java.util.*;
class nQueen{
  static void refresh(int[] board){
      for(int i=0;i<board.length;i++) board[i] = -1;
  }
  static boolean isSafe(int[] board,int theQueen,int pos){
    if(board[pos] != -1) return false;
    if(pos == 0){
      if(board[pos+1] == -1 || theQueen-board[pos+1]>1 || theQueen-board[pos+1]<-1)
        return true;
      return false;
    }
    else if(pos == board.length-1){
      if(board[pos-1] == -1 || theQueen-board[pos-1]>1 || theQueen-board[pos-1]<-1)
        return true;
      return false;
    }
    else{
      if(board[pos-1] == -1 && board[pos+1] == -1 ) return true;
      else if(board[pos-1]==-1 && (theQueen-board[pos+1]>1 || theQueen-board[pos+1]<-1 )) return true;
      else  if(board[pos+1]==-1 && (theQueen-board[pos-1]>1 || theQueen-board[pos-1]<-1 )) return true;
      else if((theQueen-board[pos+1]>1 || theQueen-board[pos+1]<-1 )&&(theQueen-board[pos-1]>1 || theQueen-board[pos-1]<-1 )) return true;

    }
    return false;
  }

  static boolean solve(int[] board,int theQueen){
      if(theQueen == board.length) return true;
      for(int i=0;i<board.length;i++){
        if(isSafe(board,theQueen,i)) {
          board[i] = theQueen;
          if(solve(board,theQueen+1)) return true;
          else {
            board[i] = -1;
          }
        }

      }
      return false;
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter size of chess board ");
    int n = s.nextInt();
    int board[] = new int[n];
    //Fill the array with -1
    refresh(board);
    int f = 0;
    //  Place the Queen
    for(int i=0;i<n;i++){
      board[i] = 0;
      if(solve(board,1)){
          f = 1;
          for(int j=0;j<board.length;j++){
            System.out.printf("(%d,%d) ",j,board[j]);
          }
          System.out.println("");
      }
      refresh(board);
    }

    //if solution not found
    if(f==0) System.out.println("No solution");
  }

}
