
public class Print_ABCDEFGH {

	public static void main(String[] args) {
		
		int n=7;
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)          //Printing of "A" starts
				 {
				if(i==0&&j>0&&j<(n-1)/2 || j==0&&i>0 ||
					j==(n-1)/2&&i>0 || i==(n-1)/2&&j<=(n-1)/2)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");
					 }
				 }                           //"A" end
			  
			  
			  for(int j=0;j<n;j++)        //Printing of "B" starts
				 {
				if(i==0&&j<(n-1)/2 || j==0 || i==(n-1)/2&&j<(n-1)/2 ||
				    j==(n-1)/2&&i>0&&i!=(n-1)/2&&i<n-1 ||
				    i==n-1&&j<(n-1)/2)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");
					 }
				 }                          //"B" end
			  
			   
			    for(int j=0;j<n;j++)         //Printing of "C" starts
				 {
				if(i==0 && j>0 && j<=(n-1)/2 || j==0 && i>0 && i<n-1 
						|| i==n-1 && j>0 && j<=(n-1)/2)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");				
						 }
				     }                      //"C" end
			    
			    
			    for(int j=0;j<n;j++)         //Printing of "D" starts
				 {
				if(i==0&&j<(n-1)/2 || j==0 || j==(n-1)/2&&i>0&&i<n-1
						|| i==n-1&&j<(n-1)/2)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");
					 }
				 }                        //"D" end
			    
			    
			    for(int j=0;j<n;j++)        //Printing of "E" start
				 {
				if(i==0 && j<=(n-1)/2 || j==0 || i==(n-1)/2 && j<=(n-1)/2 
						|| i==n-1 && j<=(n-1)/2)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");
					 }
				 }                         //"E" end
			    
			    
			    for(int j=0;j<n;j++)         //Printing of "F" starts
				 {
				if(i==0 && j<=(n-1)/2 || j==0 ||
						i==(n-1)/2 && j<=((n-1)/2)-1)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");
					 }
				 }                         //"F" ends
			    
			    
			    for(int j=0;j<n;j++)        //Printing of "G" starts
				 {
	            if(i==0&& j>0&&j<=(n-1)/2||j==0&&i>0&&i<n-1||
	            		i==n-1&&j>0&&j<(n-1)/2||
	                 j==(n-1)/2&&i>=(n-1)/2&&i<n-1||
	                 i==(n-1)/2&&j>1&&j<=(n-1)/2)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");				
						 }
				 }                         //"G" ends
			    
			    
			    for(int j=0;j<n;j++)       //Printing of "H" starts
				 {
				if(j==0 || j==(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2)
					 {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");
					 }
				 }                          //"H" end
			    
			    
			 System.out.println();
		  }

	}

}