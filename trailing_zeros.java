import java.util.Scanner;

// For an integer N find the number of trailing zeroes in N!.
/*
Trailing 0s in n! = Count of 5s in prime factors of n!

                  = floor(n/5) + floor(n/25) + floor(n/125) + ....
*/

public class trailing_zeros {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(TrailingZeros(n));
    }
    static int TrailingZeros(int n){
        int c = 0;
        for(int i=5;n/i >= 1; i*=5){
            c += n/i;
        }
        return c;
    } 
}
