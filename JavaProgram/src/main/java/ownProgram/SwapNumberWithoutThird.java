package ownProgram;

import java.util.Scanner;

public class SwapNumberWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner("System.in");
		System.out.println("Enter the first number ");
		int a = 5;
		System.out.println("Enter the second number ");
		int b = 6;
		System.out.println("Before swapping a = "+a+" , b = "+b);
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a= "+a+" , b= "+b);

	}

}
