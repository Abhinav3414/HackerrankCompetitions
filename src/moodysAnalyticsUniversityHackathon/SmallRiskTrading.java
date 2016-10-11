package moodysAnalyticsUniversityHackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SmallRiskTrading {
	
	    public static void main(String[] args) {
	      	
			Scanner scan= new Scanner(System.in);
			int n= scan.nextInt();
			int k=scan.nextInt();
			
			double p[]=new double[n];
			double x[]=new double[n];
			double y[]=new double[n];
			
			List<Double> set= new ArrayList<Double>();
			
			
			for (int i = 0; i < n; i++)
				p[i]=scan.nextDouble();
			
			for (int i = 0; i < n; i++)
				x[i]=scan.nextDouble();
			
			for (int i = 0; i < n; i++)
				y[i]=scan.nextDouble();
			
			double sum=0;
			for (int i = 0; i < n; i++)
			{
				
				//System.out.println("p "+ p[i] + " x "+ x[i]+ " y "+ y[i]);
				
				double pi= Math.round (p[i] * 10.0) / 10.0; 
				double xi=  Math.round (x[i] * 10.0) / 10.0;
				double yi=  Math.round (y[i] * 10.0) / 10.0;
				
				double a=pi*xi;
				double b= (1.00-pi)*yi;
				sum=a-b;
				if(sum>0)
				set.add(Math.round (sum * 100.0) / 100.0);
	/*			System.out.print("a "+ a);
				System.out.print(" b " +b);
				System.out.println(" sum "+ sum);*/
			}

			//System.out.println(set);
			
			Collections.sort(set);
			
			double maxSum=0;
			int tmp=0;

			for (Double double1 : set) {

				if(tmp==k)
					break;
				if(double1<0)
				{}
				else
				maxSum=maxSum+double1;
				
				tmp++;
				
			}
				
			System.out.println(String.format("%.2f", maxSum));
		
		
	    }
	

}
