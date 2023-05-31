#include <stdio.h>
int increment(int* a){
    *a+=1;
}
int main() {
    int a =1;
    printf("\nBefore %d",a);
    increment(&a);
    printf("\nAfter %d",a);
}
