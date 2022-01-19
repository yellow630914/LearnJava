package com.lijen.array;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] thisIsArrayWithString = {"a","b","c","d","e"};
		
		String target1 = "d";
		
		boolean isFlag = true;
		
		for(int i = 0;i < thisIsArrayWithString.length;i++) {
			if(target1.equals(thisIsArrayWithString[i])) {
				System.out.println("位於: " + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("無資料");
		}
	}

}
