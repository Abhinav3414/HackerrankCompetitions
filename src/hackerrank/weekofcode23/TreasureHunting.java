package hackerrank.weekofcode23;

import java.util.*;

public class TreasureHunting {

    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
		long x=scan.nextLong();
		long y=scan.nextLong();
		
		long a=scan.nextLong();
		long b=scan.nextLong();
		long aa=-b;
		long bb=a;
		
		double k=0;//((x+y)*1.00)/(a+b);
		double n=0;//((x-(k*a))*1.00)/aa;

		k= (((x*bb)-(y*aa))*1.00)/((a*bb)-(b*aa));
		n=(((x*b)-(y*a))*1.00)/((aa*b)-(bb*a));
		System.out.println(String.format("%.12f", k));
		System.out.println(String.format("%.12f", n));
    }
}

/*
Sample Input

5 3
1 1
Sample Output

4.000000000000 
-1.000000000000*/