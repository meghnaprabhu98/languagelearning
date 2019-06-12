#include<stdio.h>
main()
{
float far,cel;
printf("enter temp in celsius");
scanf("%f",&cel);
far=(9/5)*cel;
far=far+32;
printf("temp in farenheit is %f",far);
}
