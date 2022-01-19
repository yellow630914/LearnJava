package com.lijen;
class javaOperatorTest {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;
    short z = 40;
    if ((z++ == 40) && (y = true)) { // 這裡z++是後++,先檢定z是否等於40再++,然後y被賦值true,所以是true,這裡z是41
      z++; // z是42
    }
    if ((x = false) || (++z == 43)) { // 前++則先++,z先變為43再作檢定
      z++; // z是44
    }
    System.out.println("z = " + z);
  }
}