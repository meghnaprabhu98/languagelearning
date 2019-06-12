#include<stdio.h >
main()
{ char str1[20],str[20];
printf("enter a string");
gets(str1);
strcpy(str,str1);
strrev(str1);
if(strcmp(str1,str)==0)
printf("palindrome");
else
printf(" not palindrome");
}
