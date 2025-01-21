import java.util.*;

class P5
{
      public static void main(String[] x)
      {
          Scanner sc=new Scanner(System.in);
          int n , fac = 1;
          System.out.print("Enter n = ");
          n = sc.nextInt();

          for(int i = 1; i <= n; i++)
          {
              fac *= i;
          }
          System.out.println("The factorial of " +n+ " is = " +fac);
       }
}
