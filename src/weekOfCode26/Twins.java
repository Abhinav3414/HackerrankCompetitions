package weekOfCode26;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Twins {
	
	public static boolean isPrime(int n)
	{
	     if (n <= 1)  return false;
	    if (n <= 3)  return true;
	    if (n%2 == 0 || n%3 == 0) return false;
	 
	    for (int i=5; i*i<=n; i=i+6)
	        if (n%i == 0 || n%(i+2) == 0)
	           return false;
	 
	    return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		Set<Integer> set= new TreeSet<Integer>();	
		
		for(int i=a;i<=b;i++)
		{
			if(isPrime(i))
				set.add(i);
		}
		
		int prev=0, count=0;
		
		for (Integer integer : set) 
		{
			if(integer-prev==2)
				count++;
			
			prev=integer;
		}
		
		System.out.println(count);
		
	}

}
