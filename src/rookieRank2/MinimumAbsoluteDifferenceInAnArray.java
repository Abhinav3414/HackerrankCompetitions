package rookieRank2;

import java.util.Scanner;

public class MinimumAbsoluteDifferenceInAnArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		int a[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = scan.nextInt();
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < t - 1; i++) {
			for (int j = i + 1; j < t; j++) {
				int m = Math.abs(a[i]);
				int n = Math.abs(a[j]);
				int diff = 0;

				if (m > n)
					diff = m - n;
				else
					diff = n - m;

				if (diff < min)
					min = diff;

			}
		}

		System.out.println(min);
	}

}
