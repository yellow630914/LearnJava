package com.lijen;

class javaBigAndSmallInt {
  public static void main(String[] args) {
    int[] nums = { 65, 44, 28 };

    for (int i = 0; i < nums.length - 1;) {
      if (nums[i] > nums[i + 1]) {
        int temp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = temp;
        i = 0;
      } else {
        i++;
      }
    }

    System.out.println(nums[0] + "," + nums[1] + "," + nums[2]);

  }
}