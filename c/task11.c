#include<stdio.h>

struct Book{
char title[20];
char author[100];
char genre[20];
};
main()
{
struct Book b1;
printf("enter the name tiltle and author");
gets(b1.title);
gets(b1.author);
gets(b1.genre);
printf("\nTITLE :- %s",b1.title);
printf("\nAUTHOR :- %s",b1.author);
printf("\nGENERE :- %s",b1.genre);
}
