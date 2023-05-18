#include <stdio.h>

int main() {
      int a;
   //ponter declaration
   int *p;
   a = 5;
   //pointer initialisation
   p = &a;
   printf("%d\n",p);//adress
   printf("%d\n",&a);//address
   printf("%d\n",&p);//address
   printf("%d",*p);//dereferencing
   
}
