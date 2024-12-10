package ownProgram;

import java.util.Scanner;

public class FindNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=0, a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		no = sc.nextInt();
		if (no<0) {
			no = no * -1;
		} else if (no==0){
			no=1;
			
		}
		while(no>0) {
			no = no/10;
			a++;
			
		}
		System.out.println("Number of digit in given number is : "+a);

	}

}
