import java.util.Scanner;
import java.lang.Math;
public class task10
{
    
public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
System.out.println("Number is : "+i+"and cube of 1 is : "+Math.pow(i,3));
}
}