/*File:Palindromeornot
 *Description:To check whether a string is paliandrome or not
 *Author:Elna S Bijo
 *Version:1.0
 *Date:29/09/2023
 */





package javalab;
import java.util.Scanner;

public class Palindromeornot {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		boolean isPaliandrome=check(input);
		if(isPaliandrome) {
			System.out.println("String is palindrome");
				}
		else {
			System.out.println("String is not palindrome");	
		}}
		/*
		 * Function recieves a string as input
		 * return true if it is palindrome
		 * return false if it is not palindrome
		 */
		static boolean check(String input) {
			char[]charArray=input.toCharArray();
			int length=input.length();
			for(int i=0;i<length/2;i++)
			{
				if(charArray[i]!=charArray[length-i-1]) {
					return false;
				}
			}
			return true;
		
		
	}

}
