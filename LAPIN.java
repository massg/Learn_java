https://www.codechef.com/LRNDSA01/problems/LAPIN


import java.util.*;
import java.lang.*;
import java.io.*;

class LAPIN
{
    private static boolean Lapindrome(String st){
        int[] ar = new int[26];
        int len = st.length();
        for(int i=0,j=len-1;i<j;i++,j--){
            ar[st.charAt(i)-'a']++;
            ar[st.charAt(j)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ar[i]!=0)
                return false;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		    t--;
		    String st = s.next();
		    if(Lapindrome(st)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
