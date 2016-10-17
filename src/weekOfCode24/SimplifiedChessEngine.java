package weekOfCode24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SimplifiedChessEngine {
	
	static String board [][]= new String[4][4];
	
	public static boolean checkMate(String pawnType, int pawnRow, int pawnColumn, int queenRow, int queenColumn)
	{
		boolean isMate=false;
		
		char pawn = pawnType.charAt(0);
		
		if(pawn=='N')
		{
			if ( (queenRow== pawnRow+2 && queenColumn == pawnColumn-1) || (queenRow== pawnRow+2 && queenColumn == pawnColumn+1)
			||(queenRow== pawnRow-1 && queenColumn == pawnColumn+2) || (queenRow== pawnRow+1 && queenColumn == pawnColumn+2) 
			||(queenRow== pawnRow-2 && queenColumn == pawnColumn-1) || (queenRow== pawnRow-2 && queenColumn == pawnColumn+1)
			||(queenRow== pawnRow-1 && queenColumn == pawnColumn-2) || (queenRow== pawnRow+1 && queenColumn == pawnColumn-2) )
				isMate=true;
		}
		else if (pawn=='R')
		{
			 if(pawnColumn == queenColumn)
				 isMate=true;
		        if(pawnRow == queenRow)
		       	isMate=true;
		}
		else if (pawn=='B')
		{
			if(pawnColumn - queenColumn == pawnRow - queenRow)
				isMate=true;
		}
		else if (pawn=='Q')
		{
			 if(pawnColumn - queenColumn ==  pawnRow - queenRow)
				 isMate=true;
		        if(pawnColumn == queenColumn)
		        	isMate=true;
		        if(pawnRow == queenRow)
		        	isMate=true;	        
		}
		
		return isMate;
	}
	
	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		int g= scan.nextInt();
		int w=scan.nextInt();
		int b= scan.nextInt();
		int m= scan.nextInt();
		scan.nextLine();
		int blackQueenRow=0;
		int blackQueenColumn=0;
		
		
		Map <String, ArrayList<Integer>> mapBlack=  new HashMap<String, ArrayList<Integer>>();
		Map <String, ArrayList<Integer>> mapWhite= new HashMap<String, ArrayList<Integer>>();
		
		
		for(int i=0;i<w;i++)
		{
			ArrayList<Integer> bList= new ArrayList<Integer>(); 
			String pawn = scan.next(), c = scan.next(),  r = scan.next(); 
			pawn=pawn+i;
			
			int column=0;
			
			switch (c) {
			case "A":
				column=1;
				break;
			case "B":
				column=2;
				break;
			case "C":
				column=3;
				break;
			case "D":
				column=4;
				break;
			}
			

			board[Integer.parseInt(r)-1][column-1]=pawn;
			bList.add(column); bList.add(Integer.parseInt(r));			
			mapWhite.put(pawn,bList);
		}
	
		for(int j=0;j<b;j++)
		{
			ArrayList<Integer> wList= new ArrayList<Integer>();
			String pawn = scan.next(), c = scan.next(), r = scan.next(); 
			
			int column=0;
			
			switch (c) {
			case "A":
				column=1;
				break;
			case "B":
				column=2;
				break;
			case "C":
				column=3;
				break;
			case "D":
				column=4;
				break;
			}
			
			if(pawn.equals("Q"))
			{
				blackQueenRow=column-1;
				blackQueenColumn=Integer.parseInt(r)-1;
			}
			
			pawn=pawn+j;
			
			
			board[Integer.parseInt(r)-1][column-1]=pawn;
			wList.add(column); wList.add(Integer.parseInt(r));
			mapBlack.put(pawn,wList);
		}

	/*	
		
		System.out.println(mapBlack);
		System.out.println(mapWhite);
*/
		
		
/*		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
		}*/
		

		int mm;
		boolean isMate=false;
		for(mm=m;mm>0;mm--)
		{
			for (Entry<String, ArrayList<Integer>> entry : mapWhite.entrySet()) 
			{
			String key=entry.getKey();
			ArrayList<Integer> wList= entry.getValue();

			String pType= String.valueOf(key.charAt(0));
			isMate=(checkMate(pType, wList.get(0), wList.get(1), blackQueenRow, blackQueenColumn));
			if(isMate==true)
				break;
			}
		}
		
		if(isMate==true)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
	}
}