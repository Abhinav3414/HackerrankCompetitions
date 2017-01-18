package weekofCode28;

import java.util.Scanner;

public class TheGreatXOR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			long aa = scan.nextLong();
			int count = 0;
			for (long k = 1; k < aa; k++) {
				long xor = k ^ aa;
				if (xor > aa)
					count++;
			}
			System.out.println(count);
		}

	}
}
