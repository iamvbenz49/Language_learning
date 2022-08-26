#include <iostream>
using namespace std;

int main(){
    cout<<"LEAP YEAR PROGRAM"<<endl<<endl;
    int year;
    cout<<"Enter the year : ";;
    cin>>year;

    if(year%4==0){
        cout<<"Leap year";
    }
    else{
        cout<<"Not a Leap year";
    }
    return 0;
}