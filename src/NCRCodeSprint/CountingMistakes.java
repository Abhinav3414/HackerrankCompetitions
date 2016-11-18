package NCRCodeSprint;

import java.util.Scanner;

public class CountingMistakes {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		int a[]= new int[n];
		int mistakes=0;
		
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		
		if(a[0]!=1)
			mistakes++;
		
		for(int i=1;i<n;i++)
		{
			if(a[i]!=a[i-1]+1)
				mistakes++;
		}
			System.out.println(mistakes);		
		
	}
}