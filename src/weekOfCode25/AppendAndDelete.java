package weekOfCode25;

import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		int k = scan.nextInt();
		int s_len = s.length();
		int t_len = t.length();

		if (s.equals(t) && k%2==0)
			System.out.println("Yes");
		else {
			int x = -1;

			for (int i = 0; i < s_len; i++) {
				if (s.charAt(i) != t.charAt(i))
					break;
				else
					x++;
			}
			// System.out.println("x "+x);

			// change all
			if (x == -1) 
			{
				if (k >= (s_len + t_len))
					System.out.println("Yes");
				else
					System.out.println("No");
			} 
			else if (x >= 0) 
			{

				if (k >= s_len + t_len)
					System.out.println("Yes");
				else if (k == (s_len - (x + 1)) + (t_len - (x + 1)))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}

	}

}
