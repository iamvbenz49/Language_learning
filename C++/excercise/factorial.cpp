#include <iostream>
using namespace std;

int main(){
    int num;
    int fac = 1;
    cout<<"Enter the factorial number : ";
    cin>>num;
    if(num == 0){
        fac = 0;
    }
    for(int i =1 ; i <= num;i++){
        fac = fac*i;
    }
    cout<<"The factorial is "<<fac;
    return 0;
}