import java.util.Scanner;
public class task5
{
    
public static void main(String[] args) {
    int years,days;
Scanner sc=new Scanner(System.in);
System.out.println("enter the minutes");
int min=sc.nextInt();
int d=(min/60)/24;
years=d/365;
days=d%365;
System.out.println("the value approx is "+years+" years and"+days+" days");
}
}