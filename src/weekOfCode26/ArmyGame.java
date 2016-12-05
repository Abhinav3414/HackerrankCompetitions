package weekOfCode26;

import java.util.Scanner;

public class ArmyGame {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		int drop=0;
		
		if(x==y)
		{
			int fin=0;
			if(x%2!=0)
				fin=x+1;
			else
				fin=x;
			
		drop=(fin*fin)/4;	
		}
		else if(x ==1 && y==1)
		{
			drop=1;
		}
		else if(x ==1 || y==1)
		{
			if(x==1)
			{
				if(y%2==0)
					drop=y/2;
				else
					drop=(y/2)+1;
			}
			else
			{
				if(x%2==0)
					drop=x/2;
				else
					drop=(x/2)+1;
			}
		}
		else
		{
			if(x%2!=0)
				x=x+1;
			if(y%2!=0)
				y=y+1;
			
			drop=(x*y)/4;	
			
		}
		
		System.out.println(drop);
		
		
	}

}
