#include<iostream>
using namespace std;
int main() 
{
    
	
    int n=5, temp;
int a[5]={1,5,7,3,2};
    cout << "before";
    for (int i = 0; i < n; i++) 
	{
        cout<< a[i];
    }
    for (int i = 0; i < n; i++) 
	{
        for (int j = 1 + i; j < n; j++) 
		{
            if (a[i] > a[j]) 
			{
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    cout << "\nArray List After Sorting :";
    for (int i = 0; i < n; i++) 
	{
        cout << a[i] << " ";
    }
	return 0;
}
