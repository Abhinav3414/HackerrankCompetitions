package worldCodeSprint8;

import java.util.Scanner;

public class SnakeCase {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String str=scan.nextLine();
		
		if(str.length()>=1)
		{
			if(!str.contains("_"))
				System.out.println(1);
			else
			{
			//	System.out.println(str);
				String[] st=str.split("_");
				
			/*	for (String string : st) {
					System.out.println(string);
				}*/
				System.out.println(st.length);
			}
		}
		else
		{
			System.out.println(0);
		}
	}

}
