import java.util.*;

class LCS{
  static int lcs(char[] c,int len){
        int temp[][] = new int[len][len];
        for(int i=0;i<len;i++) temp[i][i] = 1;
        for(int strlen=2;strlen<=len;strlen++) {
            for(int i=0;i<len-strlen+1;i++){
                int j = strlen+i-1;
                if(c[i] == c[j] && j==2) temp[i][j] = 2;
                else if(c[i] == c[j] ) temp[i][j] = 2+temp[i+1][j-1];
                else temp[i][j] = Math.max(temp[i+1][j],temp[i][j-1]);
            }
        }
        return temp[0][len-1];
    }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String s1 = "BBABCBCAB";
    char[] c = s1.toCharArray();
    int len = c.length;
    System.out.println(lcs(c,0,len));
  }
}
