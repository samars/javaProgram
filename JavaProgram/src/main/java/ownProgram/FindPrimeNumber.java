package ownProgram;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int number = sc.nextInt();
		if (isPrime(number)) {
			System.out.println("The given number is prime");
		}else {
			System.out.println("The given number is not prime");
		}
	}
	static boolean isPrime(int no) {
		for(int i=2;i<=no/2 ; i++) {
			
			if(no % i ==0) {
				return false;
			} 
			}
		return true;
		}
		
	}


