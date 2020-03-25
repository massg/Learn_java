// https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int j=0;j<t;j++){
             String s[] = sc.next().split("\\.");
             String ans = "";
             for (int i = s.length - 1; i >= 0; i--) {
                     ans += s[i] + ".";
             }
             System.out.println(ans.substring(0, ans.length() - 1));
	    }

	}
}
