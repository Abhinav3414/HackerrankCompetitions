package weekofCode28;

import java.util.Scanner;

public class BoatTrips {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		int capacity=scan.nextInt();
		int boatsCount=scan.nextInt();
		
		int tripsCount=0;
		
		for(int i=0;i<n;i++)
		{
			int x=scan.nextInt();

			if(tripsCount<x)
				tripsCount=x;
				
		}

		if(tripsCount<=boatsCount*capacity)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
