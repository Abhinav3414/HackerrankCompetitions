package universityCodeSprint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		List<Long> list= new ArrayList<Long>();
		long minsum=0, maxsum=0;
		
		for(int i=0;i<5;i++)
			list.add(scan.nextLong());
		
		Collections.sort(list);
		
		for(int i=0;i<4;i++)
			minsum=minsum+ list.get(i);
		
		for(int i=1;i<5;i++)
			maxsum=maxsum+ list.get(i);
		
		System.out.println(minsum+" "+maxsum);

	}
}
