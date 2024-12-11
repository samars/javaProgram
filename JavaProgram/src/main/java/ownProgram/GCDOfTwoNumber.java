package ownProgram;

public class GCDOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =30, b=60;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}

		System.out.println(a);
	}

}
