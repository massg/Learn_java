https://www.codechef.com/LRNDSA01/problems/ZCO14003


import java.util.*;
import java.lang.*;
import java.io.*;

class ZCO14003
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner  s = new Scanner(System.in);
	    int n = s.nextInt();
	    long ar[] = new long[n];
	    long max = 0;
	    for(int i=0;i<n;i++){
	        ar[i] = s.nextInt();
	    }
	    Arrays.sort(ar);
	    for(int i=0;i<n;i++){
	        ar[i] = ar[i]*(n-i);
	        if(max<ar[i]) max = ar[i];
	    }
	    System.out.println(max);
	}
}
