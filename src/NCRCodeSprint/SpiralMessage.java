package NCRCodeSprint;

import java.util.Scanner;

public class SpiralMessage {

	
	
	
	static String spiralPrint(int m, int n, char a[][])
	{
		StringBuilder sB= new StringBuilder();
		
	    int i, k = 0, l = 0;
	 
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	 
	    while (k < m && l < n)
	    {
	    	
	    	  /* traversing the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            	sB.append(a[i][l]);
	            l++;   
	        }  
	        
	        
	        /* traversing the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        	sB.append(a[k][i]);
	        k++;
	 
	        /* traversing the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        	sB.append(a[i][n-1]);
	        n--;
	 
	        /* traversing the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            	sB.append(a[m-1][i]);
	            m--;
	        }
	 
	           
	    }
	    return sB.toString();

	}
	
	
public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		scan.nextLine();
		
		char a[][]= new char[n][m];
		
		for(int i=0;i<n;i++)
		{
			String line=scan.nextLine();
			for(int j=0;j<m;j++)
			{
				a[i][j]=line.charAt(j);
			}
		}
		

		StringBuilder sB2=new StringBuilder(spiralPrint(n, m, a));
		
		
		for(int k=0;k<sB2.length()-1;k++)
		{
			if(sB2.charAt(k)=='#' && sB2.charAt(k+1)=='#')
			{
				sB2.replace(k,k+1, "&");
			}
			
			if(sB2.charAt(k)=='&' && sB2.charAt(k+1)=='#')
			{
				sB2.replace(k,k+1, "&");
			}
			
		}
		
	//	System.out.println(sB2);
		
		
		
		while(sB2.charAt(0)=='#' || sB2.charAt(0)=='&')
		{
			sB2.deleteCharAt(0);
		}
		
		//System.out.println(sB2);
		
		
		int count=1;
		for(int k=0;k<sB2.length()-1;k++)
		{
			if(sB2.charAt(k)=='#')
			{
				count++;
			}
		}
		
		if(n==1 && m==1 && a[0][0]=='#')
			System.out.println(0);
		else
		{
			int wordCount=0;
			for(int k=0;k<sB2.length()-1;k++)
			{
				if(sB2.charAt(k)!='#' && sB2.charAt(k)!='&' )
				{
					wordCount=1;
					break;
				}
			}
			if(wordCount==1)
			System.out.println(count);
			else
				System.out.println(0);
			
		}
		
		
		
		
	}


}

/*


3 5
a##ar
a#aa#
xxwsr


3 5
a##ar
##aa#
#xwsr
*/