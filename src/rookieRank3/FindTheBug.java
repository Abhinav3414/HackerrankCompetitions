package rookieRank3;

import java.util.Scanner;

public class FindTheBug {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int row = 0;
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			int c = str.indexOf('X');
			if (c != -1) {
				System.out.println(row + "," + c);
				break;
			} else
				row++;
		}

	}

}
