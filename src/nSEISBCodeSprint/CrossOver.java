package nSEISBCodeSprint;

import java.util.Scanner;

public class CrossOver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p[] = new int[n];

		for (int i = 0; i < n; i++)
			p[i] = scan.nextInt();

		final int LTMALIMIT = 300;// 5;
		final int STMALIMIT = 60;// 2;

		int initialLTMASum = 0;

		for (int k = 0; k < LTMALIMIT; k++)
			initialLTMASum = initialLTMASum + p[k];

		int LTMAArr[] = new int[LTMALIMIT + 1];
		int firstIndex = 0;
		int lastIndex = n - (LTMALIMIT + 1);
		int referenceLastIndex = lastIndex;

		for (int j = 0; j < (n - (LTMALIMIT - 1)); j++) {
			if (j == 0)
				LTMAArr[j] = initialLTMASum;
			else {
				int temp = initialLTMASum - p[firstIndex - 1];
				LTMAArr[j] = temp + p[lastIndex];
				initialLTMASum = LTMAArr[j];
			}
			firstIndex++;
			lastIndex++;
		}

		int STMAArr[] = new int[LTMALIMIT + 1];
		int firstSTMAindex = referenceLastIndex - (STMALIMIT - 1);
		int lastSTMAindex = referenceLastIndex;

		/*
		 * System.out.println("p[firstSTMAindex] "+ p[firstSTMAindex]);
		 * System.out.println("p[lastSTMAindex] "+ p[lastSTMAindex]);
		 */
		int initialSTMASum = 0;

		for (int k = firstSTMAindex; k <= lastSTMAindex; k++)
			initialSTMASum = initialSTMASum + p[k];

		for (int m = 0; m < (n - (LTMALIMIT - 1)); m++) {
			if (m == 0)
				STMAArr[m] = initialSTMASum;
			else {
				int temp = initialSTMASum - p[firstSTMAindex - 1];
				STMAArr[m] = temp + p[lastSTMAindex];
				initialSTMASum = STMAArr[m];
			}
			firstSTMAindex++;
			lastSTMAindex++;

		}
		int index = LTMALIMIT;

		for (int g = 1; g < (n - (LTMALIMIT - 1)); g++) {
			index++;
			double Ltma = (double) LTMAArr[g] / LTMALIMIT;
			double Stma = (double) STMAArr[g] / STMALIMIT;

			double prevLtma = (double) LTMAArr[g - 1] / LTMALIMIT;
			double prevStma = (double) STMAArr[g - 1] / STMALIMIT;

			if ((Stma <= Ltma && prevStma > prevLtma) || (Stma >= Ltma && prevStma < prevLtma)
					|| (Stma != Ltma && prevStma == prevLtma)) {
				System.out.println(index + " " + Stma + " " + Ltma);
			}
		}

	}

}
