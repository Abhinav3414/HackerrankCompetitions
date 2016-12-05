package weekOfCode26;

import java.util.Scanner;

public class MusicOnTheStreet {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		
		int a[]= new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		
		int m=scan.nextInt();
		int hmin=scan.nextInt();
		int hmax=scan.nextInt();
		int lengthpatch=a[n-1]-a[0];
		int newm= m=lengthpatch;
		
		System.out.println(a[0]-hmax);
				
	}

}
