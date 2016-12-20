package weekOfCode27;

import java.util.*;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int t = 0;

		if (p > n) {
			System.out.println(0);
		} else {

			if (p == 1)
				t = 0;
			else {

				if (n % 2 == 0) {

					t = p / 2;
					int mid = n / 2;
					// System.out.println("t" +n);
					// System.out.println("mid "+mid);
					if (p > (n / 2) + 1)
						t = mid % t;

				} else {
					if (p == n || p == n - 1)
						t = 0;
					else {

						t = p / 2;
						int mid = n / 2;
						if (p > (n / 2) + 1)
							t = mid % t;

					}

				}

			}
			System.out.println(t);

		}

		// your code goes here
	}
}
