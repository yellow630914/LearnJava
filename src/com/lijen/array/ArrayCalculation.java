package com.lijen.array;

public class ArrayCalculation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		int a = 99;//最大值
		int b = 10;//最小值
		
		for(int i = 0;i < arr.length;i++) {
			//獲取10到99間的隨機數公式,a是最大值,b是最小值
			arr[i] = (int)(Math.random() * (a - b + 1) +b);
		}
		
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ");
		
		//最大值----
		int max = 0;
		
		for(int i = 0;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		
		//最小值----
		int min = 99;
		
		for(int i = 0;i < arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
		
		//平均數----
		int ave = 0;
		
		for(int i = 0;i < arr.length;i++) {
			ave += arr[i];
		}
		System.out.println("ave = " + (ave/arr.length));
		
		//總和----
		int sum = 0;
		
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum);
	}
}
