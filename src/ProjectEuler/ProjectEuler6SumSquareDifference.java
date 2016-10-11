package ProjectEuler;

import java.util.Scanner;

public class ProjectEuler6SumSquareDifference {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		long t=scan.nextLong();
		
		for(long i=0;i<t;i++)
		{
			long n=scan.nextLong();
			
			long sum1= (n * (n+1)* ((2*n)+1))/6;
			long sum2= (n*(n+1))/2;
			sum2=sum2*sum2;
			
			/*System.out.println(sum1);
			System.out.println(sum2);*/
			System.out.println(Math.abs(sum1-sum2));
			
		}
		
		
		
		
	}

}
