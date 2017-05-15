package weekOfCode31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AccurateSorting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int a[] = new int[n];

			ArrayList<Integer> aList = new ArrayList<>();
			ArrayList<Integer> bList = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				a[j] = scan.nextInt();
				aList.add(a[j]);
			}
			Collections.sort(aList);

			for (int k = 0; k < n - 1; k++) {
				int l = k + 1;
				{
					if (a[k] - a[l] == 1) {
						int temp = a[l];
						a[l] = a[k];
						a[k] = temp;
					}
				}
				l++;
			}

			for (int j : a)
				bList.add(j);

			if (aList.equals(bList))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
