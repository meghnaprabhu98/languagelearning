#include<stdio.h>
main()
{char fn[20],ln[20],name[40];
printf("enter first name");
scanf("%s",&fn);
printf("enter last name");
scanf("%s",&ln);
strcat(fn,ln);
printf("full name %s",fn);


}
