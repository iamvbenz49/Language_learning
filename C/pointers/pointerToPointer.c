#include <stdio.h>

int main() {
    int a = 10;
    int *p = &a;
    int **q = &p;
    int ***r = &q;
    printf("%d %d %d",*p,*q,r); //10 2000 2000
    printf("\n%d %d %d",p,q,r); //1000 2000 3000
    printf("\n%d %d %d",*p,**q,***r); //10 10 10
    printf("\n%d %d %d",p,*q,**r); //1000 1000 1000
    
    printf("\nBefore %d",*p);
    a = *p + **q + ***r;
    printf("\nAfter %d",*p);
}
