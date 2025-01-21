import java.util.*;

class P9
{
     public static void main(String[] x)
     {
          Scanner sc=new Scanner(System.in);
          int n , cou = 0, r = 0, n1 = 1 , a ,b , c;
          System.out.print("Enter the value of n = ");
          n = sc.nextInt();

          c = n;
          
          while(c != 0)
          {
              c = c / 10;
              cou++;
          }
          a = cou;
          c = n;

          while(c != 0)
          {
               b = c % 10;
               while(a != 0)
               {
                   n1 = n1 * b;
                   a--;
               }
               r = r + n1;
               a = cou;
               c = c / 10;
               n1 = 1;
           }
           
          if(r == n)
          {
              System.out.println( n+ " is a Armstrong Number. ");
          }
          else
          {
              System.out.println( n+ " is not a Armstrong Number." );
          }
       }
}
