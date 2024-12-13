package ownProgram;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,6,9};
		int[] arr1 = {2,3,5,10};
		int[] merged = new int[arr.length+arr1.length];
		System.arraycopy(arr, 0, merged, 0, arr.length);
		System.arraycopy(arr1, 0, merged, arr.length, arr1.length);
		System.out.println(Arrays.toString(merged));
		

	}

}
