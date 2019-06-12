#include<stdio.h>

main()
{ int ch;
float temp,sum=0;
printf("Press 1. CELCIUS TO FAHRENHEIT /n 2. FAHRENHEIT TO CELCIUS /n 3. EXIT.");
scanf("%d",&ch);
printf("Enter the temprature:");
scanf("%f",&temp);
switch (ch)
{
case 1:
sum=(1.8 * temp) + 32; 
printf("the temp is %f  degree farenheit",sum);
break;
case 2:
sum= (temp- 32)*5/9; 
printf("the temp is %f degree celsius ",sum);
break;
case 3:return 0;
break;
default:
printf("invalid choice");
break;

}}
