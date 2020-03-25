// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static void arraysum(int a[],int n,int sum){
        int start=0,curr_sum=a[0];
        for(int i=1;i<n;i++){
            while(curr_sum>sum && start<i){
                curr_sum=curr_sum-a[start];
                start++;
            }
            if(curr_sum == sum){
                System.out.printf("%d %d\n",start+1,i);
                return;
            }
            curr_sum=curr_sum+a[i];
        }
        System.out.printf("-1");
        return;
    }
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=0;i<T;i++){
		    int n =s.nextInt();
		    int a[]= new int[n];
		    int sum = s.nextInt();
		    for(int j=0;j<n;j++){
		        a[j] = s.nextInt();
		    }
		    arraysum(a,n,sum);
		}
	}
}
