package rookieRank4;

import java.util.Scanner;

public class ServerRoomSafety {
	
	public static int leftFallIndex(int x[], int h[], int n)
	{
		int i=0;
		int xPos=0;
		boolean breaktwo=false;
		
		while(xPos!=n-1) {
			
		/*	System.out.println("while xPos "+ xPos);
			System.out.println("while i "+ i);
		*/	
			int breakOne=0;
			for(int j=i+1;j<n;j++)
			{
				
				breaktwo=false;
				
				if(x[i]+h[i]>=x[j]) {
					breakOne++;
				//	System.out.println("i "+i+" x[i] "+ x[i]+" h[i] "+ h[i] + " x[j] "+ x[j]);
					xPos=j;
				//	System.out.println("xPos "+ xPos);
				}
				else {
					
					if(breakOne==0)
						breaktwo=true;
					//System.out.println("x[j] broken "+ x[j] + " xPos " + xPos + " breakOne "+breakOne+" breaktwo " + breaktwo);
					break;
				}
					
			}
			if(breakOne==0 && breaktwo==true)
				break;

					i=xPos;
		}
		
	
	return xPos+1;
	
	}
	
	public static int rightFallIndex(int x[], int h[], int n)
	{

		int k=20;
		int i=n-1;
		int xPos=n-1;
		boolean breaktwo=false;
		boolean finalBreak=false;
		
		while(xPos!=0) {
			
	/*		System.out.println("while xPos "+ xPos);
			System.out.println("while i "+ i);*/
			
			int breakOne=0;
			for(int j=i-1;j>=0;j--)
			{
			//	System.out.println("aaa,i= "+i+ ", j= "+ j+ " x[i] "+ x[i]+" h[i] "+ h[i] + " x[j] "+ x[j]);
				breaktwo=false;
				
				if(x[i]-h[i]<=x[j]) {
					breakOne++;
					xPos=j;
				//	System.out.println("i= "+i+ ", j= "+ j+ " x[i] "+ x[i]+" h[i] "+ h[i] + " x[j] "+ x[j] + "xPos "+ xPos);
				}
				else {
					
					if(breakOne==0)
						breaktwo=true;
				//	System.out.println("j broken "+ j + " xPos " + xPos + " breakOne "+breakOne+" breaktwo " + breaktwo);
					break;
				}
					
			}
			if(breakOne==0 && breaktwo==true) {
				finalBreak=true;
				break;
				
			}
				
		//	System.out.println("i is "+i);
					i=xPos;
			//		System.out.println("i is "+i);
				//	k--;
		}
		
	
	return n-xPos;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		int x[]= new int[n];
		int h[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			x[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			h[i]=scan.nextInt();
		}
		int leftPos = leftFallIndex(x,h,n);
		int rightPos = rightFallIndex(x,h,n);
		
	//	System.out.println(leftPos);
	//	System.out.println(rightPos);
		
		
		
		if(rightPos==n && leftPos==n)
			System.out.println("BOTH");
		
		if(leftPos==n && rightPos!=n)
			System.out.println("LEFT");
		
		if(rightPos==n && leftPos!=n)
			System.out.println("RIGHT");
		

		if(rightPos!=n && leftPos!=n)
			System.out.println("NONE");
		
	}
	

}
/*
6
1 2 3 5 12 18
1 10 1 2 3 4

4
1 2 3 5
1 10 1 2

*/
