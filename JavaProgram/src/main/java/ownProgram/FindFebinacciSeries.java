package ownProgram;

import java.util.Scanner;

public class FindFebinacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms ");
		int number = sc.nextInt();
		int first = 0, second = 1 , next;
		System.out.println("The febonacci series is ");
		for (int i =0;i<number;i++) {
			System.out.println(first+ " ");
			next= second + first ;
			first = second;
			second = next;
		}
		

	}

}
