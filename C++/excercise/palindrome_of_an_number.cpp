#include <iostream>
using namespace std;

int main(){
    int num,digit,rev;
    rev = 0;
    cout<<"Enter the number : ";
    cin>>num;
    while(num!=0){
        digit = num%10;
        rev = (rev*10) + digit;
        num = num/10;
    }
    cout<<"The palindrome is "<<rev;
    return 0;
}