package weekOfCode30;

import java.util.Scanner;

public class FindTheMinimumNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = "min(int, int)";
		StringBuilder sB = new StringBuilder(str);
		String appendStr = "min(int, ";
		String appendStrClose = ")";

		int n = scan.nextInt();
		for (int i = 2; i < n; i++) {
			sB.insert(0, appendStr);
			sB.insert(sB.length(), appendStrClose);
		}
		System.out.println(sB);

	}
}
