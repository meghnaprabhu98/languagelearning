import java.util.Scanner;
public class task4
{
    
public static void main(String[] args) {
    double m;
Scanner sc=new Scanner(System.in);
System.out.println("enter no. in inches");
double inch=sc.nextDouble();

m=inch*0.0254;
System.out.println("the value in meter is"+m);
}
}