#include<stdio.h>
main()
{
int m1,m2,m3,sum;float avg;
printf("enter subject 1 marks");
scanf("%d",&m1);
printf("enter subject 2 marks");
scanf("%d",&m2);
printf("enter subject 3 marks");
scanf("%d",&m3);
sum=m1+m2+m3;
avg=(float)sum/3;
printf("sum is %d and avg is %f",sum,avg);
}
