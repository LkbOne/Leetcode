package org.lkb.hugh.arrays;

import java.util.HashMap;

public class TuplewithSameProduct_1726 {
  // learn combination of C2
  // a * b = c * d; a != b != c != d
  // use the a * b as a unit
  class Solution {
    public int tupleSameProduct(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < nums.length - 1; i++){
        for(int j = i + 1; j < nums.length; j++){
          int key = nums[i] * nums[j];
          map.merge(nums[i] * nums[j], 1, Integer::sum);
        }
      }
      int ans = 0;
      for(Integer value : map.values()){
        ans += value * (value - 1) * 4;
      }
      return ans;
    }
  }
}
