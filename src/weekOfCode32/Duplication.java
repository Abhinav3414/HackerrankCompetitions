package weekOfCode32;

import java.util.Scanner;

public class Duplication {

	public static StringBuilder compliemnt(StringBuilder sB) {
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < sB.length(); i++) {
			char ch = sB.charAt(i);
			if (ch == '1')
				ch = '0';
			else
				ch = '1';
			st.append(ch);
		}
		return st;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		StringBuilder s = new StringBuilder("0");

		StringBuilder st = new StringBuilder();

		while (st.length() <= 1000) {
			st = new StringBuilder();
			StringBuilder t = compliemnt(s);
			st.append(s).append(t);
			s = null;
			s = st;
		}
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			System.out.println(st.charAt(x));

		}

	}

}
