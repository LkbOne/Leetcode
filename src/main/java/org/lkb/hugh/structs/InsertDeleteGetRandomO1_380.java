package org.lkb.hugh.structs;

import java.util.HashMap;
import java.util.Random;

// learn how to use the iterator array,
// the iterator array use to get random number
public class InsertDeleteGetRandomO1_380 {
  class RandomizedSet {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] nums = new int[20010];
    int idx = -1;
    Random random = new Random();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
      if (map.containsKey(val)) {
        return false;
      }
      nums[++idx] = val;
      map.put(val, idx);
      return true;
    }

    public boolean remove(int val) {
      if (!map.containsKey(val)) {
        return false;
      }
      int loc = map.remove(val);
      if (loc != idx) {
        map.put(nums[idx], loc);
      }
      nums[loc] = nums[idx--];
      return true;
    }

    public int getRandom() {
      return nums[random.nextInt(idx + 1)];
    }
  }
}
