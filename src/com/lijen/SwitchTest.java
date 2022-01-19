package com.lijen;
import java.util.Scanner;

public class SwitchTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int flag = scan.nextInt();

    switch (flag) {
      case 1:
        System.out.println("一");
        break;
      case 2:
        System.out.println("二");
        break;
      case 3:
        System.out.println("三");
        break;
      default:
        System.out.println("非1-3間的數字");
        break;
    }
  }
}
