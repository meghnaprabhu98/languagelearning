#include<iostream>

using namespace std;
void anagram(char x[],char y[]);
int main ()
{
    char str1[50], str2[50];
    int flag;
    cout << "Enter string 1 : ";
    gets(str1);
    cout << "Enter string 2 : ";
    gets(str2);
    anagram(str1, str2);
}
void anagram(char x[],char y[])
{
int flag=0,i,j;
for(i=0;x[i]!='\0';i++)
{
for(j=0;y[j]!='\0';j++)
{
if(x[i]==y[j])
break;
}
if(y[j]=='\0')
break;
}
if(x[i]=='\0')
cout<<" anagram";
else 
cout<<"not anagram";
}
