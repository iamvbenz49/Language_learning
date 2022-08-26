#include <iostream>
using namespace std;

int main(){
    int A[3];
    int B[3];
    int add[3],sub[3],prod[3];
    cout<<"THREE NUMBERS FOR ARRAY A"<<endl;
    for(int i = 0;i<3;i++){
        cin>>A[i];
    }
    cout<<"THREE NUMBERS FOR ARRAY B"<<endl;
    for(int i = 0;i<3;i++){
        cin>>B[i];
    }
    for(int i = 0;i<3;i++){
        add[i] = A[i]+B[i];
        sub[i] = A[i]-B[i];
        prod[i] = A[i]*B[i];
    }
    cout<<"ADDITION SUBTRACTION PRODUCT"<<endl;
    for(int i = 0;i<3;i++){
        cout<<add[i]<<"        "<<sub[i]<<"           "<<prod[i]<<endl;
    }
}