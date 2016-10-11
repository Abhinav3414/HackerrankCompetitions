package moodysAnalyticsUniversityHackathon;

import java.util.Scanner;

public class LearningFromThePast {
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		int max=Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum=0;
			
			int a[]=new int[3];
			
			for(int j=0;j<3;j++)
				a[j]=scan.nextInt();
			
			for(int j=0;j<3;j++)
				sum=sum+a[j];
			//System.out.println("sum  "+ sum);
			
			int min=Integer.MAX_VALUE;
			for(int j=0;j<3;j++)
			{
				if(a[j]<min)
					min=a[j];
			}
			sum=sum-min;

			if(sum>max)
			{
				max=sum;
			}
				
		}
		
		System.out.println(max);
	}

}
