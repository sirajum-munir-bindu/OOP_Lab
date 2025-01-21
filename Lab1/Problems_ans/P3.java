import java.util.*;

class P3{
	public static void main(String[] x1){
		Scanner sc=new Scanner(System.in);
		int y;
		System.out.print("Enter the year:");
		y=sc.nextInt();
            
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
           {
            System.out.println(y + " is a leap year.");
           } 
           else 
           {
            System.out.println(y + " is not a leap year.");
           }
	}
}
