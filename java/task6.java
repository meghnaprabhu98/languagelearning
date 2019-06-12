import java.util.Scanner;
public class task6
{
    public static void main(String args[])
    {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();  
        if(num > 0)
            System.out.println(" positive");
        else if(num < 0)
            System.out.println(" negative");
        else
            System.out.println(" zero");
    }
}