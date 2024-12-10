package ownProgram;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string which you want to reverse : ");
		String input = sc.nextLine();
		char ch;
		String nstr  = "";
		for(int i=0;i<input.length();i++) {
			ch=input.charAt(i);
			nstr=ch+nstr;
		}
		
		System.out.println("Reverse string is : "+ nstr);
		
			
	}

}
