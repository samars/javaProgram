package ownProgram;

public class FindLargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,100,45,95,99};
		int largest = arr[0];
		for(int num:arr) {
			if(num>largest) {
				largest = num;
			}
		}
		System.out.println(largest);
	}

}
