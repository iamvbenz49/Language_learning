#include <stdio.h>

int main() {
    int *p;
    int a = 20;
    p = &a;
    void *p0;
    p0 = p;
    printf("%d",p0);
   return 0;
}
