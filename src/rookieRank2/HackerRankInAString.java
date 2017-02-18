package rookieRank2;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		scan.nextLine();

		String hack = "hackerrank";

		for (int i = 0; i < t; i++) {
			String str = scan.nextLine();
			char hackArr[] = hack.toCharArray();

			char stArr[] = str.toCharArray();
			int k = 0;

			for (int j = 0; j < stArr.length; j++) {
				if (k > 9)
					break;
				if (stArr[j] == hackArr[k]) {
					hackArr[k] = '#';
					k++;
				}
			}

			int flag = 0;
			for (char c : hackArr) {
				if (c != '#') {
					flag = 1;
					break;
				}
			}

			if (flag == 0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

}
