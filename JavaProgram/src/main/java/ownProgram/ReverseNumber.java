package ownProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, rev =0, r,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		no = sc.nextInt();
		a=no;
		while(no>0) {
			r=no%10;
			rev = rev*10+r;
			no = no/10;
		}
		System.out.println("Reverse number is :"+rev);
		

	}

}
