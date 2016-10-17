package weekOfCode24;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class HappyLadybugs {


public static boolean isSame(String str)
{
	boolean isSame=true;
	
	for(int i=1;i<str.length()-1;i++)
	{
		if(str.charAt(i)!=str.charAt(i-1))
		{
			isSame=false; break;
		}		
	}
	return isSame;
}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for (int i = 0; i < testCases; i++) 
		{
			int n = scan.nextInt();
			scan.nextLine();
			String strng = scan.nextLine();
			
			// only one underscore
			if(strng.length()==1 && strng.charAt(0)=='_')
				System.out.println("YES");
			// all same 
			else if(isSame(strng))
				System.out.println("YES");
			
			else
			{
				
				// construct map 
				Map<String, Integer> myMap = new HashMap<String, Integer>();
				for (int j = 0; j < n; j++) 
				{
					String s = String.valueOf(strng.charAt(j));
					if (myMap.containsKey(s)) 
					{
						int val = myMap.get(s);
						val++;
						myMap.remove(s);
						myMap.put(String.valueOf(s), val);
					} 
					else 
						myMap.put(String.valueOf(s), 1);

				}				
				// System.out.println(map);
					
				int flag = 0;
				for (Entry<String, Integer> stringEntry : myMap.entrySet()) {
					
					if(flag==1) 
						break;
					
					String mapKey = stringEntry.getKey();
					int mapValue = stringEntry.getValue();
			
					// if any char present only one time other than underscore 
					if (mapValue == 1 && !stringEntry.getKey().equals(String.valueOf('_'))) 
					{
						System.out.println("NO");
						flag = 1;
						break;
					} 
					else
					{
						// traverse the string 
						for(int index=1;index<n-1;index++)
						{
							if(strng.charAt(index)==strng.charAt(index-1) || strng.charAt(index)==strng.charAt(index+1))
							{}
							
							// if there is some character which has no similar adjacent 
							else
							{
								if(strng.contains(String.valueOf('_')))
								{}
								// if there is no underscore and some character is not having same adjacent as well
								else
								{
									if(myMap.size()==1)
									{}
									// if all are not same as well
									else{
										System.out.println("NO");
										flag=1;break;
									}									
								}
							}
						}
					}		
				} // iteration for map ends
				
				if (flag == 0)
					System.out.println("YES");
			}

		} // for closes

		
	}
}