package com.lijen;
import java.util.Scanner; //導入scanner類別

class ScannerTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // 實體化scan

    int num = scan.nextInt();
    System.out.println(num);
  }
}