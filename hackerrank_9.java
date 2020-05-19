// https://www.hackerrank.com/challenges/java-static-initializer-block

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static int B =1;
public static int H=1;
public static boolean flag=true;
static{
    Scanner s = new Scanner(System.in);
    B = s.nextInt();
    H = s.nextInt();
    if(B<=0 || H<=0){
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
      if(flag){
			   int area=B*H;
			   System.out.print(area);
		}

	}

}
