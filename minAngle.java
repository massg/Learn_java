import java.util.*;

public class minAngle{
  public static void main (String[] args) throws java.lang.Exception
	 {
		   Scanner s = new Scanner(System.in);
       float rotHour = s.nextInt();
       float valLong = s.nextFloat();
       float temp = (rotHour/360)*valLong;
       int hour = (int) temp;
       float min = 100*temp- 100*hour;
       float theta = (11/2)*min - 30*hour;
       if (theta<0)
         theta*=(-1);
       if (theta >= 359.5) theta = 0;
       System.out.format("%.2f",theta);
	}
}
