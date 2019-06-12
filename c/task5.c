#include<stdio.h>
main()
{
int n=0,rev=0,d;
	printf("Enter the number : ");
	scanf("%d",&n);
while(n>0)
{
d=n%10;
rev=rev*10+d;
n=n/10;
}
printf("rev is %d",rev);	
}
