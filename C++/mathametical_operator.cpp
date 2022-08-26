#include <iostream>


int main(){
    int x = 10;
    int y = 20;
    int add = x+y;
    int sub = x-y;
    int prod = x*y;
    int quotient = x/y;
    int remainder = x%y;


    std::cout<<"Addition : "<<add;
    std::cout<<"Subtraction : "<<sub;
    std::cout<<"product : "<<prod;
    std::cout<<"quotient : "<<quotient;
    std::cout<<"quotient : "<<remainder;

    std::cout<<"before increment"<<x;
    x = x + 1;
    std::cout<<"after increment"<<x;
}