package com.lijen.array;

import java.util.Arrays;

public class ArrayMethods {
	public static void main(String[] args) {
		
		//Array.equals比較兩array是否相等
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		//Arrays.toString將array轉換成一串String
		System.out.println(Arrays.toString(arr1));
		
		//Arrays.fill將某一值全填充入array中
		Arrays.fill(arr1,10);
		System.out.println(Arrays.toString(arr1));
		
		//Arrays.sort對數組進行排序,此使用快速排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//Arrays.binarySearch用二元搜尋查找array中的元素
		int index = Arrays.binarySearch(arr2, 3);
		if(index >= 0) {
			System.out.println(index);
		}else {
			System.out.println("not found");
		}
		
	}
}
