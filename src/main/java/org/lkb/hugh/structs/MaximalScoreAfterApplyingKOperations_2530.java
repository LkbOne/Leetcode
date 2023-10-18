package org.lkb.hugh.structs;

import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations_2530 {
  // learn how to use the PriorityQueue
  // and learn how to replace ceil
  class Solution {
    public long maxKelements(int[] nums, int k) {
      // 1. priority. nlogn + klogn
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
      for(int num : nums){
        pq.offer(num);
      }

      long res = 0;
      for(int i = 0; i < k; i++){
        int tmp = pq.poll();
        res += tmp;
        pq.offer((tmp+2)/3);
      }
      return res;
    }
  }
}
