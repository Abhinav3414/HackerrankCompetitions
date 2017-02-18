package universityCodeSprint2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameOfTwoStacks {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int g = scan.nextInt();

		for (int i = 0; i < g; i++) {

			int m = scan.nextInt();
			int n = scan.nextInt();
			int x = scan.nextInt();
			int count = 0;

			List<Integer> stackA = new ArrayList<Integer>();
			List<Integer> stackB = new ArrayList<Integer>();

			for (int j = 0; j < m; j++) {
				int sA = scan.nextInt();
				stackA.add(sA);
			}

			for (int k = 0; k < n; k++) {
				int sB = scan.nextInt();
				stackB.add(sB);
			}

			// logic
			// check if a and b both are greater than x already

			if (stackA.get(0) > x && stackB.get(0) > x)
				System.out.println(0);
			else {

				while (x > 0) {

					int element = 0;
					if (stackA.get(0) > x && stackB.get(0) > x) {
						element = -1;
					}
					if (stackB.get(0) < stackA.get(0)) {
						if (stackB.get(0) < x) {
							element = stackB.get(0);
							stackB.remove(0);
						}
					} else {
						if (stackA.get(0) < x) {
							element = stackA.get(0);
							stackA.remove(0);
						}
					}

					if (element == -1)
						break;
					x = x - element;

					count++;

				}

				System.out.println(count);
			} // main else ends

		}

	}

}
