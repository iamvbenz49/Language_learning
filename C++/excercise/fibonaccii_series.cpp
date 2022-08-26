#include <iostream>
using namespace std;

int main(){
    int num,a,b,temp,res;
    a = 0;
    b = 1;
    cout<<"FIBONACCI SERIES"<<endl<<endl;
    cout<<"Enter the number : ";
    cin>>num;
    for(int i = 3;i<num+1;i++){
        temp = b;
        b = a+b;
        a = temp;
    }
    if(num == 1){
        cout<<"The result is "<<0;
    }
    else{
        cout<<"The answer is "<<b;
    }
    return 0;
}