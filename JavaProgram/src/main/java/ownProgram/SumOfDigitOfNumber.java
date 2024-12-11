package ownProgram;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sumofDigit = calculateSumofDigit(num);
		System.out.println("Sum of digit of "+num+" is : "+sumofDigit);
       
	}
	public static int calculateSumofDigit(int number) {
		int sum =0;
		while(number>0) {
			int digit = number % 10;
			sum = sum+ digit;
			number = number/10;
		}
		return sum;
	}
	

}
