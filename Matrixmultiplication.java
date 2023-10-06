package javalab;
import java.util.Scanner;
public class Matrixmultiplication {
	public static void main(String[]args) {
		int i,j,k,r1,c1,r2,c2;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the order of matrix 1");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the order of matrix 2");
		r2=sc.nextInt();
		c2=sc.nextInt();
		int[][]firstmatrix=new int[r1][c1];
		int[][]secondmatrix=new int [r2][c2];
		int[][]resultmatrix=new int [r1][c2];
		if(r2==c1)
		{
			System.out.println("Multiplication is possible");
			System.out.println("Enter the elements of first matrix");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++) {
					firstmatrix[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of second matrix");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++) {
					secondmatrix[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					resultmatrix[i][j]=0;
			for(k=0;k<r2;k++) {
					resultmatrix[i][j]=resultmatrix[i][j]+firstmatrix[i][k]*secondmatrix[k][j];
				}
			}
			}
			System.out.println("Resultant Matrix:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++) {
				
				System.out.print(resultmatrix[i][j]+" ");
					
				}
				System.out.println();
				}
			
		}
		else
		{
			System.out.println("Multiplication is not possible");
		}
			}
}
			
	
		
	


