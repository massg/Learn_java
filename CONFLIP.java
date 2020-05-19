https://www.codechef.com/LRNDSA01/problems/CONFLIP/

import java.util.*;
import java.lang.*;
import java.io.*;

class CONFLIP
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in);
	    int t = s.nextInt();
	    while(t!=0){
	        t--;
	        int g = s.nextInt();
	        while(g!=0){
	            g--;
	            int ini = s.nextInt();
	            int n = s.nextInt();
	            int q = s.nextInt();
	            if(n%2 == 0) System.out.println(n/2);
	            else{
	                if(ini==q) System.out.println((n-1)/2);
	                else System.out.println((n+1)/2);
	            }
	        }
	    }
   }
}
