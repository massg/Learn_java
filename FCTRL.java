https://www.codechef.com/LRNDSA01/problems/FCTRL


import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class FCTRL
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t!=0){
	        t--;
	        int n =s.nextInt();
	        int div =5;
	        int count = 0;
	        while((n/div) > 0){
	            count+=(n/div);
	            div*=5;
	        }
	        System.out.println(count);
	    }
	}
}
