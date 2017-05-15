package weekOfCode31;

import java.util.Scanner;

public class BeautifulWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char strArr[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'y') {
				strArr[i] = '#';
			}
		}
		int same = 0;
		for (int j = 0; j < str.length() - 1; j++) {
			if (strArr[j] == strArr[j + 1]) {
				same = 1;
				break;
			}
		}
		if (same == 1)
			System.out.println("No");
		else
			System.out.println("Yes");

	}
}
