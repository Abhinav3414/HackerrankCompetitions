package aCMICPCPracticeContest2016;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a0, a1, a2, b0, b1, b2 = 0;
		int a = 0, b = 0;

		a0 = scan.nextInt();
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		b0 = scan.nextInt();
		b1 = scan.nextInt();
		b2 = scan.nextInt();

		if (a0 == b0) {
			a = a + 0;
			b = b + 0;
		} else if (a0 > b0)
			a = a + 1;
		else
			b = b + 1;

		if (a1 == b1) {
			a = a + 0;
			b = b + 0;
		} else if (a1 > b1)
			a = a + 1;
		else
			b = b + 1;

		if (a2 == b2) {
			a = a + 0;
			b = b + 0;
		} else if (a2 > b2)
			a = a + 1;
		else
			b = b + 1;

		System.out.println(a + " " + b);
	}

}
