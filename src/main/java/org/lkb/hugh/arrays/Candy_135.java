package org.lkb.hugh.arrays;

public class Candy_135 {

  // learn how to use the rating[i - 1] < rating[i]; left
  // learn how to use the rating[i - ] > rating[i]; right
  // so get , i => Math.max(left, right);
  class Solution {
    public int candy(int[] ratings) {
      int[] left = new int[ratings.length];
      left[0] = 1;
      for(int i = 1; i < ratings.length; i++){
        if(ratings[i - 1] < ratings[i]){
          left[i] = left[i - 1] + 1;
        }else{
          left[i] = 1;
        }
      }
      int ans = 0;
      int right = 1;
      for(int i = ratings.length - 1; i >=0; i--){
        if(i < ratings.length - 1 && ratings[i] > ratings[i + 1]) {
          right = right + 1;
        }else{
          right = 1;
        }
        ans += Math.max(left[i], right);
      }
      return ans;
    }
  }
}
