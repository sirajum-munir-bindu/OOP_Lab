import java.util.*;


class P4
{
       public static void main(String[] x)
       {
            Scanner sc=new Scanner(System.in);
            int n , sum = 0;
           
            System.out.print("Enter the value of n = ");
            n = sc.nextInt();

            for(int i = 1; i <= n; i++)
            {
                  sum+=i;
            }
              
            System.out.println("Sum of Digits: " +sum);
       }
} 
