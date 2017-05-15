package bookingWomenInTech;

import java.util.ArrayList;
import java.util.Scanner;

public class HighlightLandmarks {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int n = scan.nextInt();
		scan.nextLine();
		String t = scan.nextLine();
		String[] tArr = t.split(" ");
		ArrayList<String> aList = new ArrayList<>();

		for (int i = 0; i < tArr.length; i++)
			aList.add(tArr[i]);

		String[] strArr = str.split(" ");
		StringBuilder sB = new StringBuilder();

		for (int j = 0; j < strArr.length; j++) {
			StringBuilder sB2 = new StringBuilder();
			if (aList.contains(strArr[j])) {
				sB2.append("<b>" + strArr[j] + "</b>");
			} else
				sB2.append(strArr[j]);
			sB.append(sB2 + " ");
		}

		System.out.println(sB);

	}

}
