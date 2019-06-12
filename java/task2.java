import java.util.Scanner;
public class task2
{
    
public static void main(String[] args) {
    int sum=0,c=0,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st binary no.");
int b1=sc.nextInt();
System.out.println("enter 1st binary no.");
int b2=sc.nextInt();
while(b1!=0 && b2!=0)
{
s=(b1%10+b2%10+c)%2;
c=(b1%10+b2%10+c)/2;
sum=sum*10+s;
b1=b1/10;
b2=b2/10;
}
System.out.println("the sum is"+sum+"carry is"+c);
}
}