https://www.codechef.com/LRNDSA01/problems/FLOW007



import java.util.*;
import java.lang.*;
import java.io.*;

class FLOW007
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner s = new Scanner(System.in);
    	int t = s.nextInt();
    	while(t!=0){
    	    t--;
    	    String n = s.next();
    	    int len = n.length()-1;
    	    int num = Integer.parseInt(n);
    	    int x= 0;
    	    while(num!=0){
    	        x+=((num%10)*(Math.pow(10,len)));
    	        num/=10;
    	        len--;
    	    }
    	    System.out.println(x);
    	}
	}
}
