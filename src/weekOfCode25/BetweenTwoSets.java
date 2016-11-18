package weekOfCode25;

import java.util.Scanner;

public class BetweenTwoSets {

	public static boolean isFactor(int x, int arr[]) {
		boolean isFactor = true;

		for (int i = 0; i < arr.length; i++) {
			if (x % arr[i] == 0) {
			} else {
				isFactor = false;
				break;
			}
		}
		return isFactor;
	}

	public static boolean isFactorial(int x, int arr[]) {
		boolean isFacto = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % x == 0) {
			} else {
				isFacto = false;
				break;
			}
		}
		return isFacto;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];
		int max = 0;

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if (a[i] > max)
				max = a[i];
		}

		int min = Integer.MAX_VALUE;

		for (int j = 0; j < m; j++) {
			b[j] = scan.nextInt();
			if (b[j] < min)
				min = b[j];
		}

		int count = 0;

		
		for (int k = max; k <= min; k++) {
			
			boolean isA=isFactor(k, a);
			boolean isB=isFactorial(k, b);

		
			if ( isA == true && isB == true) {
			//	 System.out.println(" yes "+k);
				count++;
			}
		}
		System.out.println(count);
		
	}
}