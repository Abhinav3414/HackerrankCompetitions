package openbracketCodeSprint;

import java.util.Scanner;
import java.util.Map.Entry;

public class ViralAdvertising {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		int count=2;
		
		if(n==1)
			System.out.println(count);
		else
		{
			int t=2;
			for(int i=1;i<n;i++)
			{
				t= (t*3)/2;
				count=count+t;
			}	
			System.out.println(count);
		}

		
	}
}