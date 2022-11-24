package com.snowcoder.algorithms.slidingwindow.examples;

public class MaximumLengthOfContinuousOnes {

  public static int findIndexOfZero(int [] A){
    int left = 0;
    int count = 0;
    int max_count = 0;
    int max_index = -1;
    int prev_zero_index = -1;

    for(int i=0; i<A.length; i++){
      if(A[i] == 0){
        prev_zero_index = i;
        count++;
      }

      if(count == 2){
        while(A[left] != 0){
          left++;
        }
        left++;
        count = 1;
      }

      if(i - left + 1 > max_count){
        max_count = i - left + 1;
        max_index = prev_zero_index;
      }
    }

    return max_index;
  }

  public static void main (String[] args)
  {
    int[] A = { 0, 0, 1, 0, 1, 1, 1, 1, 0, 1 };

    int index = findIndexOfZero(A);

    if (index != -1) {
      System.out.println("Index to be replaced is " + index);
    }
    else {
      System.out.println("Invalid input");
    }
  }

}
