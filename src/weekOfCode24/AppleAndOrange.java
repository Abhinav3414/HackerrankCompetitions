package weekOfCode24;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		int startHouse= scan.nextInt() , endHouse= scan.nextInt();
		int treeA= scan.nextInt(), treeB= scan.nextInt();
		int numberOfApples= scan.nextInt(),  numberOfOranges= scan.nextInt();
		
		int applesArray[]= new int[numberOfApples];
		int orangesArray[]= new int[numberOfOranges];
		
		for (int i = 0; i < numberOfApples; i++)
			applesArray[i]=scan.nextInt();
		
		for (int i = 0; i < numberOfOranges; i++)
			orangesArray[i]=scan.nextInt();
		
		int count_apple=0,count_orange=0;
		
		for (int i = 0; i < numberOfApples; i++) 
		{
			if(treeA+applesArray[i]>=startHouse && treeA+applesArray[i]<=endHouse )
				count_apple++;
		}
		
		for (int i = 0; i < numberOfOranges; i++) 
		{
			if(treeB+orangesArray[i]>=startHouse && treeB+orangesArray[i]<=endHouse )
				count_orange++;
		}
		
		System.out.println(count_apple);
		System.out.println(count_orange);
		
	}
}