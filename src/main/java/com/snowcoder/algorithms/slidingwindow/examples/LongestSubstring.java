package com.snowcoder.algorithms.slidingwindow.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string and a positive number k,
 * find the longest substring of the string containing k distinct characters.
 * If k is more than the total number of distinct characters in the string,
 * return the whole string.
 *
 * For k = 2, o/p is ‘bdbdbbd’
 * For k = 3, o/p is ‘bcbdbdbbdcd’
 * For k = 5, o/p is ‘abcbdbdbbdcdabd’
 */
public class LongestSubstring {

  public String findLongestSubstring(String word, int numberOfUniqueCharacters){
    int CHAR_RANGE = 128;
    if(word == null ||  word.length() == 0)
      return word;

    int end = 0, begin = 0;

    Set<Character> window =  new HashSet<>();
    int [] freq =  new int[CHAR_RANGE];

    for(int low=0, high = 0; high < word.length(); high++ ){
      window.add(word.charAt(high));
      freq[word.charAt(high)]++;

        while(window.size() > numberOfUniqueCharacters){
          if(--freq[word.charAt(low)] == 0){
            window.remove(word.charAt(low));
          }
          low++;
        }
      if(end - begin < high -low){
        end = high;
        begin = low;
      }
    }

    return word.substring(begin, end + 1);
  }

  public static void main(String[] args)
  {
    LongestSubstring longestSubstring = new LongestSubstring();
    String str = "abcbdbdbbdcdabd";
    int k = 3;

    System.out.println(longestSubstring.findLongestSubstring(str, k));
  }
}
