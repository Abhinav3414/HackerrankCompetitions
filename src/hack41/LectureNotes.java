package hack41;

import java.util.Scanner;

public class LectureNotes{

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		int k = scan.nextInt();
		scan.nextLine();
		
		String str=scan.nextLine();
		char attendance[]=str.toCharArray();
		
		String frnds=scan.nextLine();
		
		String frndsFinal[]=frnds.split(" ");
		
	/*	for(int i=0;i<frndsFinal.length;i++)
		System.out.println(frndsFinal[i]);
	*/	
		int borrrow=0;
		for(int j=0;j<frndsFinal.length;j++)
		{
			int frndId=Integer.parseInt(frndsFinal[j]);
			
			if(attendance[frndId-1]=='0')
			{
				borrrow=1;
				break;
			}
			
		}
		
		if(borrrow==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
