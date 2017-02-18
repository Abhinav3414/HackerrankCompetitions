package universityCodeSprint2;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int max = 0;
		int min = 0;
		int maxCount = 0;
		int minCount = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if (i == 0) {
				max = a[0];
				min = a[0];
			}
			if (max < a[i]) {
				maxCount++;
				max = a[i];
			}
			if (min > a[i]) {
				minCount++;
				min = a[i];
			}
		}
		System.out.println(maxCount + " " + minCount);

	}

}
