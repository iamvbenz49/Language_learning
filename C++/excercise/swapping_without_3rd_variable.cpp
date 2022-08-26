#include <iostream>
using namespace std;

int main(){
    int x,y;
    x = 10;
    y = 20;
    cout<<"Before swapping";
    cout<<"X : "<<x<<" y : "<<y<<endl;
    x = x+y;
    y = x-y;
    x = x-y;
    cout<<"After swapping";
    cout<<"X : "<<x<<" y : "<<y<<endl;
}