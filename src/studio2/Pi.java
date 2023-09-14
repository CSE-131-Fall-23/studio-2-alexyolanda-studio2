package studio2;
import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		new java.util.Random();
		
		int totalS = 0;
		int n = 0;
		double x, y, r = 0;
		totalS = in.nextInt();
		
		for (int i=1; i<=totalS; i++) {
			
			x = Math.random();
			y = Math.random();
			r = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			
			if (r <= 1)
				n++;

		}
		
		double pi = 4*(n*1.0)/(totalS*1.0);
		System.out.println(pi);
	}

}
