package com.lijen.object_oriented;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{99,28,76,-5,32,-85,99,-85,7,66,25,0};
		
		ArrayUtil util = new ArrayUtil();
		
		util.print(arr);
		
		System.out.println(" ");
		
		util.reserve(arr);
		util.print(arr);
		
		System.out.println(" ");
		
		int max = util.getMax(arr);
		
		System.out.println(max);
		

	}

}
