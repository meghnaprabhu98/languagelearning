#include<iostream>
using namespace std;
int main ()
{
    char str[50];
    cout << "Enter string 1 : ";
    cin>>str;
for(int i=0;str[i]!='\0';i++)
{

if(str[i]>='A'&& str[i]<='Z')
str[i]=str[i]+32;
}
cout<<str;
}
