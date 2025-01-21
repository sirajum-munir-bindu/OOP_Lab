import java.util.*;

public class Problem2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double P, R, SI;
		int T;
		System.out.print("Enter the ammont: ");
		P = sc.nextDouble();
		System.out.print("Enter the value:");
		R = sc.nextDouble();
		System.out.print("Enter the value:");
		T = sc.nextInt();
		SI = P*R*T/100;
		System.out.println("Total Profit = " + SI);
	}
}
