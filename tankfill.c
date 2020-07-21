
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t,n;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        int a[n];
        for(int i=0;i<n;i++) scanf("%d",&a[i]);
        int max = 0;
        int left[n];
        for(int i=0;i<n;i++){
            if(max<a[i]) max = a[i];
            left[i] = max;
        }
        max = 0;
        int right[n];
        for(int i=n-1;i>=0;i--){
            if(max<a[i]) max = a[i];
            right[i] = max;
        }
        int total = 0;
        for(int i=0;i<n;i++){
            int m;
            if(left[i]<=right[i]) m = left[i];
            else m = right[i];
            int waterati = m - a[i];
            total+=waterati;
        }
        printf("%d\n",total);
    }
    return 0;
}
