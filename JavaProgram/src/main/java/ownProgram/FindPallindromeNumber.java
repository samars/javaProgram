package ownProgram;

import java.util.Scanner;

public class FindPallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if(isPallindrome(num)) {
			System.out.println("The given number "+num+" is pallindrome");
		} else {
			System.out.println("The given number "+num+" is not pallindrome");
		}

	}
	public static boolean isPallindrome(int number) {
		int originalNumber = number;
		int reverseNumber =0;
		while(number!=0) {
			int digit = number %10 ;
			reverseNumber = reverseNumber*10 + digit;
			number = number/10;
		}
		return originalNumber == reverseNumber;
		
	}

}
