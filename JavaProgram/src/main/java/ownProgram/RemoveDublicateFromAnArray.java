package ownProgram;

import java.util.HashSet;

public class RemoveDublicateFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3,3,3,3};
		HashSet<Integer>set = new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
       System.out.println(set);
	}
  
}
