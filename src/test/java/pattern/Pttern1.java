package pattern;

public class Pttern1 {

	public static void main(String[] args) {
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
//        int n=5;
//        for(int i=0;i<n;i++)//this for loop for rows
//        {
//        	for(int j=0;j<n;j++)//this for loop for columns
//        	{
//        		System.out.print("* ");
//        	}
//        	System.out.println();
//        }
		
//		*
//		* * 
//		* * *
//		* * * *
//		* * * * *
//		int n=5;
//		for(int i=0;i<n;i++)//for rows
//		{
//			for(int j=0;j<=i;j++)//for column
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//	    * * * * *
//	    * * * *
//	    * * *
//	    * *
//	    *
//		int n= 5;
//		for(int i=0;i<n;i++)//rows
//		{
//			for(int j=n;j>i;j--)//columns
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		        *
//		      * *
//		    * * *
//		  * * * *     
//		* * * * *       
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=i;j<n;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		* * * * *
//		  * * * *
//		    * * * 
//		      * *
//		        *
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<i;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int j=i;j<=n;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//          *
//	      * * duplicate
//	    * * *
//	  * * * *     
//	* * * * *     
//	     *         
//	    * *                           
//	   * * *      original  by removing one space                 
//	  * * * * 
//	 * * * * * 
		

//		 int n=5;
//		 for(int i=1;i<=n;i++)
//		 {
//			 for(int j=i;j<n;j++)
//			 {
//				 System.out.print(" ");
//			 }
//			 for(int j=1;j<=i;j++)
//			 {
//				 System.out.print("* ");
//			 }
//			 System.out.println();
//		 }
		
		
//		* * * * *
//		  * * * *
//		    * * *  duplicate
//		      * *
//		        *
//		 * * * * * 
//		  * * * * 
//		   * * * original
//		    * * 
//		     * 

		
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=i;j<=n;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		1 1 1 1 1 
//		2 2 2 2 2 
//		3 3 3 3 3 
//		4 4 4 4 4 
//		5 5 5 5 5
		
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1
//		int n=5;
//		for(int i=5;i>=1;i--)
//		{
//			for(int j=n;j>=i;j--)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
	
		
//	     *         
//	    * *                           
//	   * * *      duplicate                
//	  * * * * 
//	 * * * * * 
		
//	     1 
//	    2 2 
//	   3 3 3 
//	  4 4 4 4   original
//	 5 5 5 5 5 
//		 int n=5;
//		 for(int i=1;i<=n;i++)
//		 {
//			 for(int j=i;j<n;j++)
//			 {
//				 System.out.print(" ");
//			 }
//			 for(int j=1;j<=i;j++)
//			 {
//				 System.out.print(i+" ");
//			 }
//			 System.out.println();
//		 }

		
//		1 
//		2 2 
//		1 1 1 
//		2 2 2 2 
//		1 1 1 1 1 
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if(i%2==1)
//				System.out.print("1 ");
//				else
//					System.out.print("2 ");
//			}
//			System.out.println();
//		}
		
		
//		A B C D E 
//		F G H I J 
//		K L M N O 
//		P Q R S T 
//		U V W X Y 
//		 int n=5;
//		 char ch='A';
//		 for(int i=1;i<=n;i++)
//		 {
//			 for(int j=1;j<=n;j++)
//			 {
//				 System.out.print(ch++ +" ");
//			 }
//			 System.out.println();
//		 }
		
		
		
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print((char)(j+64)+" ");
//			}
//				System.out.println();
//		}
		  
	}
}
