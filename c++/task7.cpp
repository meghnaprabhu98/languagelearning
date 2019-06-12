#include<iostream>
using namespace std;
void swap(int a,int b);
int main()
{
  int a , b;
    cout<<"a="<<a<<"b="<<b;
    swap(a,b);}
void swap (int x, int y)
{
	//cout << "func called"; //debugging
	int t;
	t = x;
	x = y;
	y = t;
cout<<" after swap a="<<x<<"b="<<y;
    
}
