
package javalab;
import java.util.Scanner;
public class Diagonalmatrixzero {
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 int r,c;
		 System.out.println("Enter the Rows and Columns:");
		 r=sc.nextInt();
		 c=sc.nextInt();
		 int[][] matrix = new int [r][c];
		 int i,j;
		 System.out.println("Enter the values:");
		 for(i=0;i<r;i++)
		 {
			 for(j=0;j<c;j++)
			 {
				 matrix[i][j]=sc.nextInt();
			 }
		 }
	   //making 0
	 
		 for(i=0;i<r;i++)
		 {
			 for(j=0;j<c;j++)
			 {
				 if(i==j)
				 {
					matrix[i][j]=0; 
				 }
			if(j==c-i-1)
			{
				matrix[i][j]=0;
			}
			 
			 }
		 
		  }
	System.out.println("The Given Matrix:");
	for(i=0;i<r;i++)
	{
		 for(j=0;j<c;j++)
		 {
			 System.out.print(matrix[i][j]+" ");
			 
		 }
		 System.out.println();
	}
	 }
	}


