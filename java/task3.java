import java.util.Scanner;
public class task3
{
    
public static void main(String[] args) {
    int sum=0,d;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.");
int n=sc.nextInt();

while(n!=0)
{
d=n%10;
sum=sum+d;
n=n/10;
}
System.out.println("the sum is"+sum);
}
}