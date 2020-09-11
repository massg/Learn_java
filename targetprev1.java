import java.util.*;
class targetprev1{
    static int dst_x,dst_y;
    public static void main(String[] args){
      Scanner  s = new Scanner(System.in);
      System.out.println("Enter starting x and y");
      int x = s.nextInt();
      int y = s.nextInt();
      System.out.println("Enter destination x and y");
      dst_x = s.nextInt();
      dst_y = s.nextInt();
      if(reachable(x,y)) System.out.print("Yes Boss");
      else System.out.print("Poyitt .....");
    }
    public static boolean reachable(int x,int y){
      if(x>dst_x || y>dst_y) return false;
      if(x==dst_x && y==dst_y) return true;
      if(reachable(x+y,y) || reachable(x,x+y)) return true;
      else return false;
    }
}
