package com.snowcoder.algorithms.slidingwindow.examples;

import java.util.HashMap;
import java.util.Map;

public class HasDuplicate {

  public static boolean hasDuplicate(int [] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<nums.length; i++){
      if(map.containsKey(nums[i])){
        if(i - map.get(nums[i]) <= k){
          return true;
        }
      }
      map.put(nums[i], 1);
    }

    return false;
  }

  public static void main(String[] args)
  {
    int[] nums = { 5, 6, 8, 2, 4, 6, 9 };
    int k = 4;

    if (hasDuplicate(nums, k)) {
      System.out.println("Duplicates found");
    }
    else {
      System.out.println("No duplicates were found");
    }
  }
}
