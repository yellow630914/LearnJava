package com.lijen;
public class BreakAndContinue {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      if (i % 3 == 0) {
        break; // break的功能是跳出全部循環,包括之後的循環都不會被執行。
      }
      System.out.print(i);
    }
    System.out.println(" ");
    for (int i = 1; i < 10; i++) {
      if (i % 3 == 0) {
        continue; // continue則是指跳出單次循環,之後的循環依然會執行。
      }
      System.out.print(i);
    }
  }
  // 在這兩個關鍵字的後面不能有執行列,否則報錯。
}
