package hack41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WashingPlates {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int n= scan.nextInt();
		int k=scan.nextInt();
		
			int p[]= new int[n];
			int d[]= new int[n];
			
		
		for(int i=0;i<n;i++)
		{
			p[i]=scan.nextInt();
			d[i]=scan.nextInt();
		}
		
		int paid=0;
		for(int i=0;i<n;i++)
		{
			paid=paid+p[i];
		}
		
		int nn=0;
	
	//	System.out.println(paid);
		while(nn!=k)
		{
			int min=Integer.MAX_VALUE;
		//	System.out.println("Hi");
			int minind=0;
			for(int z=0;z<n;z++)
			{
	
				int x=(p[z]+d[z]);
				if(x<min)
				{
					min=p[z];
					minind=z;
				}
			}
	//	System.out.println("min "+min + "minind "+minind );
		/*		System.out.println("p[minind] "+p[minind] +" d[minind] "+d[minind] );*/
			paid=paid-(p[minind]+d[minind]);
			p[minind]=Integer.MAX_VALUE/2-1;
			d[minind]=Integer.MAX_VALUE/2-1;
			nn++;
		
		}
	//	System.out.println(min);
		

		System.out.println(paid);
	}

}
