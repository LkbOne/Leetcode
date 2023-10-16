package org.lkb.hugh.bits;

public class SingleNumberIII260 {
  // this use xor rule
  // two number is equals, will be become zero.
  // so, we can get result of two one number
  //
  // and we use the xor rule again,
  // we can xor the one of low bit, get two group of numbers.
  // and equals numbers will disappear in one group
  // so, we can get the result
  class Solution {
    public int[] singleNumber(int[] nums) {
      int xor = 0;
      for (int num : nums) {
        xor ^= num;
      }
      int lowbit = xor & -xor;
      int ansA = 0;
      int ansB = 0;
      for (int num : nums) {
        if ((lowbit & num) != 0) {
          ansA ^= num;
        }
      }
      ansB = xor ^ ansA;
      return new int[] {ansA, ansB};
    }
  }
}
