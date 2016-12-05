package weekOfCode26;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BestDivisor {
	
	public static int sumDig(int digit)
	{
		int summm=0;
		while(digit!=0)
		{
			summm=summm+(digit%10);
			digit=digit/10;
		}
		return summm;
	}
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Map<Integer,Integer> mapDigits=  new HashMap<Integer, Integer>();
		
		
		int n=scan.nextInt();
		int maxVal=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				int digSum=sumDig(i);
				mapDigits.put(i,digSum);
				if(digSum>maxVal)
					maxVal=digSum;
			}
		}
		
		Set<Integer>mySet= new TreeSet<Integer>();
		
		for (Entry<Integer,Integer> integer : mapDigits.entrySet()) 
		{
			int val=integer.getValue();
			if(val==maxVal)
				mySet.add(integer.getKey());
			
		}
			
			for (Integer integer : mySet) {
				System.out.println(integer);
				break;
			}
		
	}

}
