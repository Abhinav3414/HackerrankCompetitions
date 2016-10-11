package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class ProjectEuler13LargeSum {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);		
		int t=scan.nextInt();
		scan.nextLine();
		

		String str=scan.nextLine();
		BigInteger b= new BigInteger(str);	
		
		for(int i=1;i<t;i++)
		{
			str=scan.nextLine();
			 BigInteger b1= new BigInteger(str);
			 b=b.add(b1);
		}
		
		System.out.println(String.valueOf(b).substring(0,10));
		
	}

}
