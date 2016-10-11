package WeekOfCode23;

import java.util.Scanner;

public class GearsOfWar {
public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		
		
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			
			if(n%2==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
