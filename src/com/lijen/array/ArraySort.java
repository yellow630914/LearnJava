package com.lijen.array;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{99,28,76,-5,32,-85,99,-85,7,66,25,0}; 
		
		//冒泡排序
		//相鄰兩元素互相比較後判斷是否交換。
		for(int i = 0;i<arr.length -1;i++) {
			for(int j = 0;j<arr.length - 1 -i;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
