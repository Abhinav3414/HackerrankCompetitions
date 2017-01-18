package weekofCode28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TheValueOfFriendship {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		for(int j=0;j<t;j++)
		{
			
			Map<Integer,Set<Integer>> myMap= new HashMap<Integer,Set<Integer>>();
			
			int n=scan.nextInt();
			int m=scan.nextInt();
			
			int a[]= new int[n];
			
			int  map[][]= new int [m][2];
			
			for(int i=0;i<m;i++)
			{
				int p=scan.nextInt();
				int q=scan.nextInt();
				map[i][0]=p;
				map[i][1]=q;
			}
			
			System.out.println("map");
			
			/*
			print 2d array 
			for (int i = 0; i < map.length; i++) {
				
				for (int k = 0; k < 2; k++) {
				
					System.out.print(map[i][k]+" ");
				}
				System.out.println();
				
			}*/
			
			for (int i = 0; i < 3; i++) {
				
				int one=map[i][0];
				int two= map[i][1];
				int flag=0;
				
				if(i==0)
				{
					Set<Integer> set = new HashSet<Integer> ();
					set.add(map[i][0]);
					set.add(map[i][1]);
					
					myMap.put(i,set);
					
					a[one-1]=a[one-1]+1;
					a[two-1]=a[two-1]+1;
					
				}
				else
				{

					flag=0;
					Set<Integer> valueF= new HashSet<Integer>();
					for (Entry<Integer, Set<Integer>> entry : myMap.entrySet()) {

						int key=entry.getKey();
						Set<Integer> value= new HashSet<Integer>();
						
						value=entry.getValue();
						
						if(value.contains(one)|| value.contains(two))
						{
							value.add(one);
							value.add(two);
							myMap.replace(key, value);
							valueF=value;
							flag=1;
							break;
						}
						
					}
					
					System.out.println("myMap " + myMap);
					
					for (Integer integer : valueF) {
						System.out.print("set " + integer+ " ");
						
						if(a[integer-1]==0)
						{
							a[integer-1]= a[integer-1]+2;
						}
						else
							a[integer-1]= a[integer-1]+1;
						
					}
					
					
				}
			
				
				
				
				
			}
			System.out.println("a");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println(myMap);
			
		}// t loop ends
		
		
	}

}
