package hackerrank.weekofcode23;

import java.util.*;

public class UnexpectedProblem {

    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
		String str= scan.nextLine();
		long m=scan.nextLong();
		
		boolean isAllSame=false;

		char isSame=str.charAt(0);
		for (int i = 1; i < str.length(); i++) 
		{
			if(str.charAt(i)!=isSame)
			{
				isAllSame=false;
				break;
			}
			else
				isAllSame=true;
		}
		
		
		if(isAllSame==true)
			System.out.println(m);
		else
		{
			int minLength= Integer.MAX_VALUE;
			int len=str.length();
			
					
					if(m>len)
					{
						
						for (int i = 0,j=len-1; i < len-1 || j>=0; i++,j--) 
						{
							String str1=str.substring(0,i+1);
							String str2=str.substring(j,len);					
							
							if(str1.length()>m)
								break;
							
							if(str1.equals(str2))
							{
								if(str1.length()<minLength)
									minLength=str1.length();
								break;

							}
						}
						
						int div=(int) (m/minLength);
						System.out.println(div);
					}
					else
					{
					
						int count=0;
						int listCount=0;
						
						
						for (int i = 0,j=len-1; i < len-1 || j>=0; i++,j--) 
								{
									String str1=str.substring(0,i+1);
									String str2=str.substring(j,len);					
									
									if(str1.length()>m)
										break;
									
									if(str1.equals(str2))
									{
										if(str1.length()<minLength)
											minLength=str1.length();

										listCount++;
									}
								}
												
						System.out.println(count+listCount);
					}
											
				}	
    }
}

/*abc
6

2*/