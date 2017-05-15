package weekOfCode30;

import java.util.Scanner;

public class CandyReplenishingRobot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int c[] = new int[t];

		for (int i = 0; i < t; i++)
			c[i] = scan.nextInt();

		int candiesAdded = 0;
		int candiesCount = n;

		for (int j = 0; j < t - 1; j++) {
			candiesCount = candiesCount - c[j];
			if (candiesCount < 5) {
				int remCan = n - candiesCount;
				candiesAdded = candiesAdded + remCan;
				candiesCount = n;
			}
		}
		System.out.println(candiesAdded);

	}
}
