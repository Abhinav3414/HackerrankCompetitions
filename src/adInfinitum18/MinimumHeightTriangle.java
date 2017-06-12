package adInfinitum18;

import java.util.Scanner;

public class MinimumHeightTriangle {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		float b=scan.nextInt();
		float a=scan.nextInt();
		
		float h = (a*2)/b;
		
		System.out.println((int)Math.ceil(h));
		
		
	}

}
