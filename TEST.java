// https://www.codechef.com/LRNDSA01/problems/TEST/

import java.util.*;
import java.lang.*;
import java.io.*;

class TEST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int f=0;
		while(s.hasNext()){
		    int n = s.nextInt();
		    if(n==42)
		        f = 1;
		    if(f==0)
		        System.out.println(n);
		}
	}
}
