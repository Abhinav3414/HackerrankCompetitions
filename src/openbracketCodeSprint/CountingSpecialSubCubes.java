package openbracketCodeSprint;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CountingSpecialSubCubes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < t; i++) {

			int n = scan.nextInt();
			int size = n * n * n;
			int a[] = new int[size];

			for (int j = 0; j < size; j++)
				a[j] = scan.nextInt();

			for (int j = 0; j < size; j++) {

				if (map.containsKey(a[j])) {
					int val = map.get(a[j]);
					val++;
					map.remove(a[j]);
					map.put(a[j], val++);
				} else {
					map.put(a[j], 1);
				}
			}

		//	System.out.println(map);

			for (Entry<Integer, Integer> entry : map.entrySet()) {
				int val=entry.getValue();
				
				if(entry.getKey()>1)
				{
					val=1+ val/3;
				}
				System.out.print(val + " ");
			}
			System.out.println();
			map.clear();
			
			
			
			for(int p=1;p<=n;p++)
			{
				for(int j=1;j<=n;j++)
				{
					for(int k=1;k<=n;k++)
					{
						
				//		System.out.println();
						int index= ((p-1)*(n*n))+ ((j-1)*(n))+k;
						System.out.print(a[index-1]+"       ");
						System.out.println("p "+p + " j "+ j + " k "+k);
					}
				}
			}
			


		}

	}

}
