// https://infosys.hackerearth.com/practice/algorithms/searching/ternary-search/practice-problems/algorithm/small-factorials/description/

import java.util.*;
import java.math.BigInteger;
class hackerearth_1 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            t--;
            int n = s.nextInt();
            BigInteger f = new BigInteger("1");
            for(int i=1;i<=n;i++){
                f=f.multiply(BigInteger.valueOf(i));
            }
            System.out.println(f);
        }
    }


}
