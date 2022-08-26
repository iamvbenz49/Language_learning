#include <iostream>
using namespace std;

int main(){
    cout<<"LARGEST OF THREE NUMBERS"<<endl<<endl;
    int x , y , z;
    cout<<"Enter number 1 : ";
    cin>>x;
    cout<<"Enter number 2 : ";
    cin>>y;
    cout<<"Enter number 3 : ";
    cin>>z;
    if(x>y && x>z){
        cout<<"X is greater";
    }
    else if(y>x && y>z){
        cout<<"Y is greater";
    }
    else{
        cout<<"Z is greater";
    }
    return 0;
}