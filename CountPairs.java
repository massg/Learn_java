import java.util.*;

class CountPairs{

public static void main(String[] args){
 	Scanner s = new Scanner(System.in);
  	int n =s.nextInt();
  	int k = s.nextInt();
  	int[] ar = new int[n];
  	for(int i=0;i<n;i++) ar[i] = s.nextInt();
  	Arrays.sort(ar);
  	int count = 0;
  	for(int i = 0;i<n;i++){
     	int start = ar[i]-k;
      	int end = ar[i]+k;
      	count+=checkHappy(ar,i,start,end);
    }
  	System.out.print(count);
}
private static int checkHappy(int[] ar,int i,int r1,int r2){
  	if(i-1 >=0)
 		if(ar[i-1] >= r1) return 1;
  	if(i+1<ar.length)
  		if(ar[i+1]<= r2) return 1;
  	return 0;
}
}
