package universityCodeSprint;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class HackerlandRadioTransmitters {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		int k=scan.nextInt();
		
		Map<Integer, Integer>map= new TreeMap<Integer, Integer>();
		
		for(int i=0;i<n;i++)
		{
			int x=scan.nextInt();
			if(map.containsKey(x))
			{
				int val=map.get(x);
				map.remove(x);
				val++;
				map.put(x, val);
			}
			else
				map.put(x,1);
			
			
		}
		
		int key=0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			
			key=entry.getKey();
			break;
		}
		
	/*	System.out.println(map);
		System.out.println(key);*/
		int count=1;
		int z=0;
		int prevKey=0;
		
		while(z!=3)
		{
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				
				int tempKey=entry.getKey();
				if(entry.getValue()==-1)
				{}
				else if(tempKey<=key+(k*2) && tempKey>prevKey)
				{
					
					map.replace(tempKey,-1);
				//	System.out.println(tempKey);
					prevKey=tempKey;
				}
				else
				{
					count++;
					key=tempKey;
				//	System.out.println("next "+key);	
				
					break;
					
				}
			}
			



		z++;
		}
	//	System.out.println(map);
		
		System.out.println(count);
			
		
	}

}
