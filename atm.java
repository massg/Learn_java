
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class atm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		float y = s.nextFloat();
    float temp = (float)x+0.5f;
  		if(x%5==0 && temp<=y)
  		    y-=temp;
		System.out.format("%.2f",y);
	}
}
