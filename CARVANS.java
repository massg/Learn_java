https://www.codechef.com/LRNDSA01/problems/CARVANS

import java.util.*;
import java.lang.*;
import java.io.*;

class CARVANS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		    t--;
		    int n = s.nextInt();
		    long ar[] = new long[n];
		    for(int i=0;i<n;i++) ar[i] = s.nextLong();
		    long count = 1;
		    long first = ar[0];
		    for(int i=0;i<n;i++){
		        if(first>ar[i]) {
		            count++;
		            first=ar[i];
		        }
		    }
		    System.out.println(count);
		}
	}
}
