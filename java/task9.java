import java.util.*;
class task9
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a < b &&  a < c)
		{
			System.out.println("smallest is"+a);
		}
		else if(b < a && b < c)
		{
            System.out.println("smallest is"+b);
		}
		else
		{
            System.out.println("smallest is"+c);
		}
    }
}
