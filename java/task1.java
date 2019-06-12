import java.util.Scanner;
public class task1
{
    public static void main(String srgs[])
    {
        double area,perimeter;
        System.out.println("enter radius of circle");
        Scanner sc=new Scanner(System.in);
        int rad = sc.nextInt();
        area=(double)rad*rad*3.14;
        perimeter=(double)2*3.14*rad;
        System.out.println("area= "+area+"     perimeter="+perimeter);

    }
}