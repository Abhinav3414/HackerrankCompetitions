package universityCodeSprint2;

import java.util.Scanner;

public class SeparateTheNumbers {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		int flag=0;
		int vPrev=0;
		
		for(int i=0;i<t;i++)
		{
			String str=scan.nextLine();
			
			if(str.length()==1)
				System.out.println("NO");
			else
			{
				int len=str.length();
				
				if(len%2==0)
				{
					StringBuilder sB= new StringBuilder();
					
					int tempLen= len/2;
					
					while(tempLen>0)
					{
						sB.append(".");
						tempLen--;
					}
					int sBLen=sB.length();
					while(sBLen>0)
					{
				//		System.out.println("cecking for length"+ sBLen);
						StringBuilder sB2= new StringBuilder(sB.substring(0,sBLen--));
						String myArr[]= str.split("(?<=\\G"+sB2+")");
						
						int prev=Integer.parseInt(myArr[0]);
						
				//		System.out.println("vPrev "+ vPrev);
						for (int j= 1; j<myArr.length; j++) {
						//	System.out.print(" "+myArr[j]+" ");
							int curr=Integer.parseInt(myArr[j]);
							if(curr-prev!=1 || myArr[j].charAt(0)=='0')
							{
						//		System.out.println("curr "+ curr + "prev "+ prev);
							//	System.out.println("breaking");
								flag=1;break;
							}
							else
							{
								flag=0;
								vPrev=Integer.parseInt(myArr[0]);
							}
								
							
							prev=curr;
						}
					//	System.out.println();
						if(flag==0)
							break;
					}
					
				}
				if(flag==0)
				System.out.println("YES "+vPrev);
				else
					System.out.println("NO");
					
			}
			
		}
		
		
	}

}
