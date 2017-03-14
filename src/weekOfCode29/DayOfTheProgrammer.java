package weekOfCode29;

import java.util.Scanner;

public class DayOfTheProgrammer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int flag = 0;

		if (year >= 1700 && year <= 1917) {
			if (year % 4 == 0) // leap
				flag = 1;
			else // not leap
				flag = 3;
		} else if (year == 1918) // not leap
			flag = 2;
		else {
			if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) // not
																		// leap
				flag = 1;
			else
				flag = 3;
		}

		if (flag == 1)
			System.out.println("12.09." + year);
		else if (flag == 2)
			System.out.println("26.09." + year);
		else
			System.out.println("13.09." + year);

	}

}
