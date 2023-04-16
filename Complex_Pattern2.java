
public class Complex_Pattern2 {

	public static void main(String[] args) {
	 
		int n=9;
		  for(int i=0;i<n;i++)  //Printing of "P" starts
		  {
			 for(int j=0;j<n;j++)
			 {
			if(i==0&&j<(n-1)/2 || j==0 || i==(n-1)/2&&j<(n-1)/2
					|| j==(n-1)/2&&i>0&&i<(n-1)/2)
				 {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }                   // "P" end
			 
			 
			 for(int k=0;k<n+12;k++) //Printing of "W" starts
			 {
			   if(k==0||k==n-1||i==k&&i>=(n-1)/2||
					   i+k==n-1&&i>=(n-1)/2)
			   {
				 System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
			 }                     //"W" end
			 
			 
			
			 for(int j=0;j<n;j++)   //Printing of "S" starts
			 {
			   if(i==0&&j>0&&j<=(n-1)/2||j==0&&i>0&&i<(n-1)/2
					   ||i==(n-1)/2&&j>0&&j<(n-1)/2||
				  j==(n-1)/2&&i>(n-1)/2&&i<n-1||
				  i==n-1&&j<(n-1)/2)
			   {
				 System.out.print("*");
			   }
			   else
			   {
				 System.out.print(" ");
			   }
			 }                      //"S" end
			 
			 
			 
			 for(int k=0;k<n;k++)   //Printing of "K" starts
			 {
			   if(k==0||i+k==(n-1)/2||i-k==(n-1)/2)
			   {
				 System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
			 }                     //"K" end
			 
			 
			 for(int j=0;j<n+4;j++)   //Printing of "I" starts
			 {
			   if(i==0 && j<=n-1 || j==(n-1)/2 
					   || i==n-1 && j<=n-1)
			   {
				 System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
			 }                     //"I" end
			 
			 
			 for(int k=0;k<n;k++)   //Printing of "L" starts
			 {
			   if(k==0 || i==n-1 && k<=(n-1)/2)
			   {
				 System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
			 }                     //"L" end
			 
			 
			 
			 for(int k=0;k<n;k++)   //Printing of 2nd "L" starts
			 {
			   if(k==0 || i==n-1 && k<=(n-1)/2)
			   {
				 System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
			 }                     //2nd "L" end
			 
			 
			 
			 for(int j=0;j<n;j++)     //Printing of 2nd "S" starts
			 {
			   if(i==0&&j>0&&j<=(n-1)/2||j==0&&i>0&&i<(n-1)/2
					   ||i==(n-1)/2&&j>0&&j<(n-1)/2||
				  j==(n-1)/2&&i>(n-1)/2&&i<n-1
				  ||i==n-1&&j<(n-1)/2)
			   {
				 System.out.print("*");
			   }
			   else
			   {
				 System.out.print(" ");
			   }
			 }                      //2nd "S" end
			 
			 
			 System.out.println();
			 
		  }
	}
}
