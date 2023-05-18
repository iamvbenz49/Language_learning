#include <stdio.h>

int main() {
    int a = 10;
    int *p;
    p = &a;
    printf("%d\n",p); //p is 2002
    //p+1 is 2006 because pointer addition works in terms of datatype size int size = 4 2002+4=2006
    printf("%d\n",p+1); 
   
}
