package hourRank18;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WherestheMarble {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> cups = new HashMap<>();

		for (int i = 1; i <= 10; i++)
			cups.put(i, 0);

		int m = scan.nextInt();
		int n = scan.nextInt();

		cups.get(m);
		cups.replace(m, 1);

		int currentPos = m;
		for (int j = 0; j < n; j++) {
			int to = scan.nextInt();
			int from = scan.nextInt();

			int toVal = cups.get(to);
			int fromVal = cups.get(from);

			if (toVal == 1) {
				cups.replace(from, 1);
				cups.replace(to, 0);
				currentPos = from;
			} else if (fromVal == 1) {
				cups.replace(from, 0);
				cups.replace(to, 1);
				currentPos = to;
			} else {
			}

		}

		System.out.println(currentPos);
	}

}
