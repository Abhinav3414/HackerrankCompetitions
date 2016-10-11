package ProjectEuler;

import java.util.Scanner;

public class ProjectEuler5SmallestMultiple {
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			
			int n=scan.nextInt();
			int j=1;
			int flag=0;
			int start=n;
			while(j>0)
			{
				flag=0;
			//	System.out.println("start " + start);
				for(int z=1;z<=n;z++)
				{
					if(start%z!=0)
					{
						flag=1;
						break;
					}
				}
				start++;
				if(flag==0)
				{
					System.out.println(start-1);
					break;
				}
			}
		}
	}
}
