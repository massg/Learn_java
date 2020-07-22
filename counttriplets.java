/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- != 0){
		    int n = s.nextInt();
		    int ar[] = new int[n];
		    for(int i=0;i<n;i++) ar[i] = s.nextInt();
		    Arrays.sort(ar);
		    int count = 0;
		    for(int i=n-1;i>=0;i--){
		        int j=0;
		        int k = i-1;
		        while(j<k){
		            if(ar[i] == ar[k]+ar[j]){
		                count++;
		                j++;
		                k--;
		            }
		            else if(ar[i] > ar[k]+ar[j]){
		                j++;
		            }
		            else k--;
		        }
		    }
		    if(count == 0) System.out.println("-1");
		    else System.out.println(count);
		}
	}
}
