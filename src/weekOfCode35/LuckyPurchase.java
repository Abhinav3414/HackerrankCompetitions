package weekOfCode35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class LuckyPurchase {
	
	static boolean isNumberOccurenceEqual(int integer)
	{
		int fourCount=0;
		int sevenCount=0;
		
		while(integer!=0)
		{
			int remainder=integer%10;
			if(remainder==4)
				fourCount++;
			else
				sevenCount++;
			integer=integer/10;
		}
		
		if(fourCount==sevenCount)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		scan.nextLine();
		TreeSet<Integer> tSet= new TreeSet<>();
		Map<Integer, String> map= new HashMap<>();
		for(int i=0;i<t;i++)
		{
			
			String str=scan.nextLine();
			String splitted[]=str.split("\\s+");
			map.put(Integer.valueOf(splitted[1]),splitted[0]);
			tSet.add(Integer.valueOf(splitted[1]));
		}
			
			int myFlag=0;
			for (Integer integer : tSet) {
				if(isNumberOccurenceEqual(integer)==true)
				{
					System.out.println(map.get(integer));
					myFlag=1;
					break;
				}
			}
			if(myFlag==0)
				System.out.println("-1");
			
			
		
	}
}
