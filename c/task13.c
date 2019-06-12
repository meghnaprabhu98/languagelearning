#include<stdio.h>
main()
{
int a[10],small,large=0,i;
printf ("enter 10 nos");
for(i=0;i<=10;i++)
{
scanf("%d",&a[i]);
if(i==0)
small=a[i];
if(a[i]>large)
large=a[i];
if(a[i]<small)
small=a[i];
}
printf ("smallest %d largest %d",small,large);
}
