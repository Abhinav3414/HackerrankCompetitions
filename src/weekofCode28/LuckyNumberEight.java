package weekofCode28;

import java.util.Scanner;

public class LuckyNumberEight {

	static int printListSubsets(int n, int[] list) {

		int count = 0;

		for (int i = 0; i < (1 << n); i++) 
		{
			int number = 0;
			for (int j = 0; j < n; j++) 
			{
				if ((i & (1 << j)) > 0)
					number = number * 10 + list[j];

			}

			if (number % 8 == 0)
				count++;

		}
		return count - 1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int n = scan.nextInt();
		int k = n;

		int a[] = new int[size];

		int tt = size - 1;
		while (k != 0) {
			a[tt] = k % 10;
			tt--;
			k = k / 10;
		}

		System.out.println(printListSubsets(size, a));

	}

}
