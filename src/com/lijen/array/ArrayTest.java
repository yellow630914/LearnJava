package com.lijen.array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] thisIsArrayWithInt = {1,2,3,4,5,6,7,8,9,10};
		String[] thisIsArrayWithString = {"a","b","c","d","e"};
		// Array長度一旦確定則不可修改
		System.out.println(thisIsArrayWithInt[0]);
		System.out.println(thisIsArrayWithString[0]);
		
		int[][] thisIs2DArray = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0;i < thisIs2DArray.length;i++) {
			for(int j = 0;j < thisIs2DArray[i].length;j++) {
				System.out.print(thisIs2DArray[i][j]);
			}
		}
	}

}
