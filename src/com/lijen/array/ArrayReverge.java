package com.lijen.array;

public class ArrayReverge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] thisIsArrayWithString = {"a","b","c","d","e"};
		
		
		//複製
		String[] copyArr = new String[thisIsArrayWithString.length];
		
		for(int i = 0;i < thisIsArrayWithString.length;i++) {
			copyArr[i] = thisIsArrayWithString[i];
		}
		
		//反轉
		String[] revergeArr = new String[thisIsArrayWithString.length];
		
		for(int i = (thisIsArrayWithString.length - 1),j = 0;i >= 0;i--,j++) {
			revergeArr[i] = thisIsArrayWithString[j];
		}
		for(int i = 0;i < thisIsArrayWithString.length;i++) {
			System.out.print(revergeArr[i] + " ");
		}
	}

}
