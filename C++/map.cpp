#include <iostream>
#include <map>
#include <string>
#include <list>
using namespace std;

int main(){
    map<string,string>dict;
    dict.insert(pair<string,string>("banana","2"));
    dict.insert(pair<string,string>("apple","1"));
    dict.insert(pair<string,string>("orange","3"));
    dict["pear"] = "3";
    for(auto pair:dict){
        cout << pair.first << "-" <<pair.second <<endl;
    }

    map<string,list<string>>marks;
    list<string> vijay {"1","2","3"};
    marks.insert(pair<string,list<string>>("vijay",vijay));
    for(auto pair:marks){
        cout << pair.first << "-" <<pair.second <<endl;
    }

}