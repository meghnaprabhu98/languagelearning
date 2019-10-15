import java.util.*;
class seat{
   static int n ;
public int[] booking(){
    seat p =new seat();
int i,j;
int[] s =new int[500];
int[] cseat =new int[10];
Scanner sc =new Scanner(System.in);
System.out.println("~~~~~~~Enter the number of  seats (less than or equal to 10) ~~~~~~~");
p.n= sc.nextInt();
int flag=0;

while(flag==0){
for( j=0;j<p.n;j++)
{
    System.out.println("~~~~~~~Enter the seat number you want from 1-500 ~~~~~~~");
     
    i =sc.nextInt();
if(s[i]!=1)
{
 s[i]=1;
cseat[j]=i;
}
else
{
    System.out.println("~~~~~~~Sorry this seat is aldready booked please select another seat ~~~~~~~");   
    j--;
}


}
sc.nextLine();
System.out.println("~~~~~~confirm seats ?yes/no~~~~~~~");
for(j=0;j<10;j++)  {
    if(cseat[j]!=0)
    System.out.println(cseat[j]);}
String conf = sc.nextLine();
if(conf.equals("yes"))
{
System.out.println("~~~~~~seats booked ~~~~~~~");
flag=1;
}
else
{
    for(j=0;j<p.n;j++)
      { s[cseat[j]]=0;
        cseat[j]=0;
      }
        
}
}
return cseat;


}
public int finalamt(int rate){
  
    seat b =new seat();
int amount=b.n*rate;
return amount;
}

}
