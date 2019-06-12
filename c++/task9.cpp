#include<iostream> 
using namespace std;

int main(){
int y,k,w,d;
cout<<"enter days";
cin>>k;
y=k/365;
w=(k%365)/7;
d=(k%365)%7;
cout<<y<<"years   "<<w<<"weeks  "<<d<<"days  ";
}
