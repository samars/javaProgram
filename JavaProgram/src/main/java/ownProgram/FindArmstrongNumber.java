package ownProgram;

import java.util.Scanner;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arm=0,a,b,c,d,no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = sc.nextInt();
		d=no;
		while(no>0) {
			a= no%10;
			no = no/10;
			arm = arm+a*a*a;
		}
		if(arm==d) {
			System.out.println("The given number is armstrong");
		} else {
			System.out.println("The given number is not armstrong");
		}
	}

}
