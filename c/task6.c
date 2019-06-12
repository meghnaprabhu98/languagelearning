#include<stdio.h>
main()
{int n,t,sum=0,d;
printf("Enter the number : ");
scanf("%d",&n);
t=n;
while(n>0)
{
d=n%10;
sum= sum +d*d*d;
n=n/10;
}
if(sum==t)
printf("armstrong no.");
else
printf("not armstrong no.");
}
