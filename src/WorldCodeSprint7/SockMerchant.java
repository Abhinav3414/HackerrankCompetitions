package WorldCodeSprint7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SockMerchant {

	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		
		Map<Integer, Integer>pairs= new HashMap<Integer, Integer>();
		
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			if(pairs.containsKey(a[i]))
			{
				int val=pairs.get(a[i]);
				pairs.remove(a[i]);
				pairs.put(a[i],++val);
			}
			else
				pairs.put(a[i],1);
		}
		
		int count=0;
		for (Entry<Integer, Integer> entry : pairs.entrySet()) {
			int val=entry.getValue()/2;
			count=count+val;
		}
			
		System.out.println(count);
		
		
	}
}
