package com.lijen.array;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] int2DArray = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
		
		int sum = 0;
		
		for(int i = 0;i < int2DArray.length;i++) {
			for(int j = 0;j< int2DArray[i].length;j++) {
				sum += int2DArray[i][j];
			}
		}
		
		System.out.print(sum);
	}

}
