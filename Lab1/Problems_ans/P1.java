import java.util.*;

class P1{
	public static void main(String[] x1){
		Scanner sc=new Scanner(System.in);
		double f,c;
		System.out.print("Enter F:");
		f=sc.nextDouble();

		c= ((f-32)*5)/9;
		
	System.out.println("Converted temperature "+f+" is = "+c);
	}
}
