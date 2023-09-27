import java.util.Scanner;
public class sumofnnumbers {
	public static void main(String[]args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum of n numbers is +sum");	
	}

}
