package com.lijen.array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {-99,-58,-6,8,12,33,65,87};
		
		//二分法搜尋在有序Array會更有效率
		
		int target = 0;
		int head = 0;
		int end = arr.length - 1;
		
		boolean isFlag = false;
		
		while(head <= end) {
			int middle = (head + end) / 2;
			
			if(target == arr[middle]) {
				System.out.println("位於:" + middle);
				isFlag = true;
				break;
			}else if(arr[middle] > target) {
				end = middle - 1;
			}else if(arr[middle] < target) {
				head = middle + 1;
			}
		}
		if(!isFlag) {
			System.out.println("無資料");
		}
	}

}
