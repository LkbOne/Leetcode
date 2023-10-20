package org.lkb.hugh.double_point;

public class TrappingRainWater_42 {
  // learn how to use the max letf and right, get the middle number;
  class Solution {
    public int trap(int[] height) {
      int res = 0;
      int left = 0;
      int right = height.length - 1;
      int maxL = height[left];
      int maxR = height[right];
      while(left < right){
        if(maxL <= maxR){
          res += maxL - height[left];
          maxL = Math.max(maxL, height[++left]);
        }else{
          res += maxR - height[right];
          maxR = Math.max(maxR, height[--right]);
        }
      }
      return res;
    }
  }
}
