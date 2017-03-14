package weekOfCode29;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigSorting {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		scan.nextLine();
		
		ArrayList<BigInteger> aList= new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			BigInteger bigInteger= new BigInteger(scan.nextLine());
			aList.add(bigInteger);
		}
		
		Collections.sort(aList);
		//Collections.reverse(aList);
		
		for (BigInteger long1 : aList) {
			System.out.println(long1);
		}
	}

}
