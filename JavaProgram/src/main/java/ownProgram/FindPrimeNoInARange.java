package ownProgram;

public class FindPrimeNoInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=10, end=100;
		for(int num=start;num<=end;num++) {
			boolean isPrime = true;
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime&&num>1) {
				System.out.println(num+" ");
			}
		}
	}

}
