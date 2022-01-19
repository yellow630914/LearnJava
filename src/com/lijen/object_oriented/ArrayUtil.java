package com.lijen.object_oriented;

public class ArrayUtil {
	
	//求Array最大值
	public int getMax(int[] arr) {
		int max = 0;
		
		for(int i = 0;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	

	//反轉
	public void reserve(int[] arr) {
		
		for(int i = (arr.length - 1),j = 0;i > j;i--,j++) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	//遍歷Array
	public void print(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
