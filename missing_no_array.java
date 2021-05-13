// Missing number in an array

// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

/* 
    Input:
        N = 5
        A[] = {1,2,3,5}
    Output: 4 
*/
import java.util.Scanner;

class missing_no_array{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<ar.length-1;i++){
            ar[i] = s.nextInt();
        }
        System.out.println(MissingNumber1(ar,n)); // Method 1 : Summation Formula
        // Integer overflow could happen in method 1
        System.out.println(MissingNumber2(ar,n)); // Modification for integer overflow
    } 
    static int MissingNumber1(int array[], int n) {
        // Your Code Here
        int sum = (n*(n+1))/2;
        int ar_sum=0;
        for(int i=0;i<array.length;i++){
            ar_sum+=array[i];
        }
        return sum-ar_sum;
    }
    static int MissingNumber2(int array[],int n){
        int sum = 1;
        int c = 2;
        for(int i=0;i<array.length;i++){
            sum-=array[i]+c;
            c++;
        }
        return sum;
    }
}