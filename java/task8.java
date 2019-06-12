import java.util.Scanner;
public class task8
{
    
public static void main(String[] args) {
    int years,days;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.nextLine();
int vowels=countvowels(s);
System.out.println("the no of vowels is"+vowels);
}
public static int countvowels(String s){
    int k=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='A'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='U')
k++;
}
return k;
}
}