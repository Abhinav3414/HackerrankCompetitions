package moodysAnalyticsUniversityHackathon;

import java.util.Scanner;
import java.util.Stack;

public class AsteriskExpressions {
	
	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < n; i++) {
		String str= scan.nextLine();
		
		if(str.charAt(0)=='*' || str.contains("***") || str.charAt(str.length()-1)=='*')
			System.out.println("Syntax Error");
		
		else if( str.contains("*0*") || str.charAt(0)=='0' || str.charAt(str.length()-1)=='0')
		{
			System.out.println("0");
			break;
		}
		
		else
		{
			char a[]= str.toCharArray();
	
			Stack <String> st= new Stack<String>();
			
			st.push(String.valueOf(str.charAt(0)));
			
			for(i=2;i<str.length();i++)
			{
				
				if(str.charAt(i)!='*' && str.charAt(i-1)=='*' && str.charAt(i-2)!='*' )
				{
					int initial=i;
				
				while(initial!=str.length()-1 )
					{

					if(str.charAt(initial+1)=='*')
						break;
					else
						initial++;	
					}
	
				String sub=str.substring(i,initial+1);
				i=initial;
					st.push(sub);
					
				}
				
				
				if(str.charAt(i)!='*'  && str.charAt(i-1)=='*' && str.charAt(i-2)=='*' )
				{
					int initial=i;
					
					while(initial!=str.length()-1 )
						{

						if(str.charAt(initial+1)=='*')
							break;
						else
							initial++;	
						}
		
					
					String sub=str.substring(i,initial+1);
					i=initial;

					int pop= Integer.parseInt(st.pop());
					int b= Integer.parseInt(sub);
					int mul=  (int) Math.pow(pop, b);
					st.push(String.valueOf(mul));					
				}
				
				if(str.charAt(i)=='*')
				{

				}

			}
			
			int f=1;
			for (String string : st) {
			f=f* Integer.parseInt(string);
			}
			System.out.println(f);
			
		}
	}
		
		
		
		
		
	}

}
