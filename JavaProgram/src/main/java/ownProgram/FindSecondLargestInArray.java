package ownProgram;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,35,1,10,34,1};
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second = first;
				first = num;
				
			} else if(num>second && num!=first){
				second = num;
				
			}
		}
		System.out.println(second);
	}
	

}