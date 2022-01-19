package com.lijen.array;

public class PascalTriangleWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//為三角形預留空間
		int[][]PascalTriangle = new int[15][15];
		
		//先為2DArray賦值,搭建三角形
		for(int i = 0;i < PascalTriangle.length;i++) {
			for(int j = 0;j < i+1;j++) {
				if(j == 0 || j == i) { 
					//第一個與最後一個設定成1
					PascalTriangle[i][j] = 1; 
				}else {
					//在中間的數是由上一層兩數的相加
					PascalTriangle[i][j] = PascalTriangle[i-1][j] + PascalTriangle[i-1][j-1];
				}
				
			}
		}
		
		for(int i = 0;i < PascalTriangle.length;i++) {
			for(int j = 0;j < PascalTriangle[i].length;j++) {
				//過濾掉是0的數,遍歷帕斯卡三角形
				if(PascalTriangle[i][j] != 0) {System.out.print(PascalTriangle[i][j] + " ");}
			}
			System.out.println(" ");
		}
	}

}
