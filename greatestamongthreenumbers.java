import java.util.Scanner;
public class greatestamongthreenumbers {
	public static void main(String[]args) {
	int number1,number2,number3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	number1=sc.nextInt();
	System.out.println("Enter the second number");
	number2=sc.nextInt();
	System.out.println("Enter the third number");
	number3=sc.nextInt();
	if(number1>number2&&number1>number3)
	{
		System.out.println("number1 is greatest");
	}
	else if(number2>number3)
	{
		System.out.println("number2 is greatest");
	}
	else
	{
		System.out.println("number3 is greatest");
	}
}
}	
	


