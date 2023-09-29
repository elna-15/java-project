/*File:Frequency of charectors
 *Description:To check the frequency of charectors in string
 *Author:Elna S Bijo
 *Version:1.0
 *Date:29/09/2023
 */package javalab;
import java.util.Scanner;
public class frequencyofcharectors {
	public static void main(String[]args){
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();//input string
		System.out.println("Enter the charector");
		char checkMe=sc.next().charAt(0);//input charector
		int charCount=checkFreq(input,checkMe);
		System.out.println("The number of occurences of given charectors is"+charCount);}
	}
	static int checkFreq(String input,char checkMe) {
		char[]charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++)
		{
			if(charArray[i]==checkMe) {
				charCount++;
			}
		}
		return charCount;
	}
	
	

}
