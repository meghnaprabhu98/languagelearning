import java.util.Scanner;
public class task7 {
 public static void main(String args[])
   {
      int a, b, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Input number of rows and columns of matrix1");
      a = in.nextInt();
      b  = in.nextInt();
      System.out.println("Input number of rows &columns of matrix2");
      c = in.nextInt();
      d  = in.nextInt();
 if(a==c && b==d){
      int mat1[][] = new int[a][b];
      int mat2[][] = new int[a][b];
      int sum[][] = new int[a][b];
 
      System.out.println("Input elements of first matrix");
 
      for (  c = 0 ; c < a ; c++ )
         for ( d = 0 ; d < b ; d++ )
           { mat1[c][d] = in.nextInt();}
 
      System.out.println("Input the elements of second matrix");
 
      for ( c = 0 ; c < a; c++ )
         for ( d = 0 ; d < b ; d++ )
           { mat2[c][d] = in.nextInt();
           sum[c][d] +=mat2[c][d]+mat1[c][d];
            } 
    
 
      System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < a ; c++ )
      {
         for ( d = 0 ; d < b ; d++ )
            System.out.print(sum[c][d]+"\t");
      }
    }
    else
    System.out.println("add not posiible");
   }
}
