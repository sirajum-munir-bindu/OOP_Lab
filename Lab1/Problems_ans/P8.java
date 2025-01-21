import java.util.*;

class P8
{
     public static void main(String[] x)
     {
          Scanner sc=new Scanner(System.in);
          int n , sum = 0, a ,b;
          System.out.print("Enter the value of n = ");
          n = sc.nextInt();

          a = n;
          
          while(a != 0)
          {
              b = a % 10;
              sum = sum*10 + b;
              a = a % 10;
          }
          
          if(sum == n)
          {
              System.out.println( n+ " is a Palindrome. ");
          }
          else
          {
              System.out.println( n+ " is not a Palindrome." );
          }
       }
}
