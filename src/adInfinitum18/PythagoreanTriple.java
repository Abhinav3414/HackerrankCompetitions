package adInfinitum18;

import java.util.Scanner;

public class PythagoreanTriple {

	static boolean isPerfectSquare(int n) {

		for (int sum = 0, i = 1; sum < n; i += 2) {
			sum += i;
			if (sum == n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int m = n + 1;

		int a = n * n;

		int c = 0;
		int x = 0;

		while (true) {

			int b = m * m;
			if (isPerfectSquare(a + b)) {
				c = (int) Math.sqrt(a + b);
				x = b;
				break;
			}
			m++;
		}

		System.out.println((int) Math.sqrt(a) + " " + (int) Math.sqrt(x) + " " + c);

	}

}
