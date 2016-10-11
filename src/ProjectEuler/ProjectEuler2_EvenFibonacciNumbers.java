package ProjectEuler;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ProjectEuler2_EvenFibonacciNumbers {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long x = scan.nextLong();

		for (int z = 0; z < x; z++) {
			long t = scan.nextLong();

			if (t <= 2) {
				System.out.println(0);
			} else {
				long a = 0, b = 2, c = 0;
				long sum = 0;

				for (long i = 0; i < t - 2; i++) {
					c = (4 * b) + a;

					sum = sum + c;
					if (sum > t)
						break;
					a = b;
					b = c;
				}
				sum = sum - c;
				sum = sum + 2;

				System.out.println(sum);
			}		
	}	
	}
}
