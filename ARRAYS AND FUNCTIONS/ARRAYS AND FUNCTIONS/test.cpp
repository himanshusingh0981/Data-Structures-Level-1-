#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int count=0;
    int opo;
    int i=1;
    while(true){
        opo = pow(i,2);
        if(n>=opo){
            n = n-opo;
            count++;
        }else{
            break;
        }
        i++;
    }
    cout<<count<<"\n";
}