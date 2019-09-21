package rookieRank4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExamRush {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		Collections.sort(list);

		int count = 0;
		for (int j = 0; j < n; j++) {
			int val = list.get(j);
			if (val <= t) {
				count++;
				t = t - val;
			} else
				break;
		}

		System.out.println(count);

	}
}
