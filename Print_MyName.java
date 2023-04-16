
public class Print_MyName {

	public static void main(String[] args) {
	 int n = 7;
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n+3;j++)   //Printing of "T" starts
		 {
		   if(i==0 && j<=n-1 || j==(n-1)/2)
		   {
			 System.out.print("*");
		   }
		   else {
			   System.out.print(" ");
		   }
		 }                      //"T" end
		 
		 
		 for(int j=0;j<n;j++)   //Printing of "R" starts
		 {
		if(i==0&&j<(n-1)/2||j==0||i==(n-1)/2&&j<(n-1)/2
				||j==(n-1)/2&&i>0&&i!=(n-1)/2)
			 {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }                             //"R" end
		 
		 for(int j=0;j<n+3;j++)   //Printing of "I" starts
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
		 
		 

		 for(int j=0;j<n;j++)   //Printing of "S" starts
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
		 }                      //"S" end
		 
		 
		 for(int j=0;j<n+3;j++)   //Printing of 2nd "I" starts
		 {
		   if(i==0 && j<=n-1 || j==(n-1)/2
				   || i==n-1 && j<=n-1)
		   {
			 System.out.print("*");
		   }
		   else {
			   System.out.print(" ");
		   }
		 }                     //2nd "I" end
		 
		 
		 for(int j=0;j<n+11;j++)   //Printing of 2nd "T" starts
		 {
		   if(i==0 && j<=n-1 || j==(n-1)/2)
		   {
			 System.out.print("*");
		   }
		   else {
			   System.out.print(" ");
		   }
		 }                      //2nd "T" end
		 
		 
		 for(int j=0;j<n;j++)     //Printing of "D" starts
		 {
		if(i==0&&j<(n-1)/2 || j==0 ||
				j==(n-1)/2&&i>0&&i<n-1 || i==n-1&&j<(n-1)/2)
			 {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }                       //"D" end
		 
		 
		 for(int j=0;j<n+3;j++)   //Printing of "U" starts
		 {
		if(j==0 && i<n-1 || j==n-1 && i<n-1 
				|| i==n-1 && j>0 && j<n-1)
			 {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }                     //"U" end 
		 
		 for(int j=0;j<n+3;j++)   //Printing of 3rd "T" starts
		 {
		   if(i==0 && j<=n-1 || j==(n-1)/2)
		   {
			 System.out.print("*");
		   }
		   else {
			   System.out.print(" ");
		   }
		 }                      //3rd "T" end
		 
		 for(int j=0;j<n+3;j++)   //Printing of 4th "T" starts
		 {
		   if(i==0 && j<=n-1 || j==(n-1)/2)
		   {
			 System.out.print("*");
		   }
		   else {
			   System.out.print(" ");
		   }
		 }                      //4th "T" end
		 
		 
		 for(int j=0;j<n;j++)     //Printing of "A" starts
		 {
		  if(i==0&&j>0&&j<(n-1)/2 || j==0&&i>0 
				  || j==(n-1)/2&&i>0 || i==(n-1)/2&&j<=(n-1)/2)
			 {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }                        //"A" end
		 
		 System.out.println();
	 }

	}

}
