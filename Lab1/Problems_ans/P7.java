import java.util.*;

class P7
{
    public static void main(String[] x)
    {
       Scanner sc=new Scanner(System.in);
       int f1 = 0, f2 = 1 , fibo , n , c = 0;
       System.out.print("Enter the value: ");
       n = sc.nextInt();
       while(c < n)
       {
          if(c <= 1)
          {
             fibo = c;
          }
          else
          {
             fibo = f1 + f2;
             f1 = f2;
             f2 = fibo;
          }
          System.out.println(fibo+ " " );
          c++;
        }
      }
}
