#include <stdio.h>
int increment(int* a){
    *a+=1;
}
int main() {
    int arr[] = {1,2,3,4};
    int *p;
    p = &arr[0];
    for(int i=0;i<4;i++){
        printf("%d %d\n",*p,p);
        p+=1;
    }
}
