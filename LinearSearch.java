import java.util.*;
class LinearSearch {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size");
    int n = s.nextInt();
    int ar[] = new int[n];
    System.out.println("Enter the numbers");
    for(int i=0;i<n;i++){
      ar[i] = s.nextInt();
    }
    System.out.println("Enter number to be searched");
    int x = s.nextInt();
    int check = linearSearch(ar,n,x);
    if(check==1)
      System.out.printf("%d found",x);
    else
      System.out.printf("%d not found",x);
  }
  private static int linearSearch(int[] ar,int n,int x){
    for(int i=0;i<n;i++){
      if(ar[i]==x){
        return 1;
      }
    }
    return 0;
  }
}
