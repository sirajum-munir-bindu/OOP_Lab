import java.util.*;

class P6
{
     public static void main(String[] x)
     {
          Scanner sc=new Scanner(System.in);
          int n , c = 0;
          System.out.print("Enter the value of n = ");
          n = sc.nextInt();
          
          for(int i = 2; i < n; i++)
          {
             if(n % i == 0)
             {
                c++;
             }
          }
          
          if(c == 0)
          {
              System.out.println( n+ " is a Prime. ");
          }
          else
          {
              System.out.println( n+ " is not a prime." );
          }
       }
}
