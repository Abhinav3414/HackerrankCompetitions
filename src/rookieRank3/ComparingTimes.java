package rookieRank3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ComparingTimes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			String times[] = str.split(" ");

			if (times[0].charAt(5) == 'A' && times[1].charAt(5) == 'P')
				System.out.println("First");
			else if (times[0].charAt(5) == 'P' && times[1].charAt(5) == 'A')
				System.out.println("Second");
			else {
				DateFormat sdf = new SimpleDateFormat("hh:mm");
				Date date1 = null;
				Date date2 = null;

				try {
					date1 = sdf.parse(times[0].substring(0, 5));
					date2 = sdf.parse(times[1].substring(0, 5));
				} catch (ParseException e) {
					e.printStackTrace();
				}

				if (date1.before(date2))
					System.out.println("First");
				else
					System.out.println("Second");
			}
		}

	}

}
