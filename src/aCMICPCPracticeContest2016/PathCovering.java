package aCMICPCPracticeContest2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class node
{
	int x;
	int y;
	public node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}

public class PathCovering {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		
		List<node> map= new ArrayList <node>();
		
		for(int i=0;i<n-1;i++)
		{
			int x=scan.nextInt();
			int y=scan.nextInt();
			node nod= new node(x,y);
			map.add(nod);
		}
		
	/*	for (node node : map) {
			System.out.println(node.x+ " "+ node.y );
			
		}*/
		
		int q=scan.nextInt();
		
		
		for(int v=0;v<q;v++)
		{
			int newn=scan.nextInt();
			
			int newarr[]= new int[newn];
			
			for(int j=0;j<newn;j++)
				newarr[j]=scan.nextInt();
				
			if(newn==1)
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(1);
			}
		}
		
		
			
	}

}
