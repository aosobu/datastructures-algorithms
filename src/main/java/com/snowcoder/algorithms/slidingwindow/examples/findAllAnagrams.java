//package com.snowcoder.algorithms.slidingwindow.examples;
//
//public class findAllAnagrams {
//
//  public static void findAllAnagrams(String x, String y){
//    int m, n;
//
//    if((m = y.length()) > (n = x.length())){
//      return;
//    }
//
//    Multiset<Character> window = HashMultiset.create();
//    Multiset<Character> set = HashMultiset.create();
//
//    for (int i = 0; i < m; i++) {
//      set.add(y.charAt(i));
//    }
//
//    for (int i = 0; i < n; i++) {
//      if(i < m){
//        window.add(x.charAt(i));
//      }else{
//        if(window.containsAll(set)){
//          System.out.println("Anagram " + x.substring(i -m, i)
//              + " present at index" + (i - m)) ;
//        }
//        if(window.contains(x.charAt(i - m))){
//          window.remove(x.charAt(i - m));
//        }
//        window.add(x.charAt(i));
//      }
//    }
//
//    if(window.containsAll(set)){
//      System.out.println("Anagram " + x.substring(n-m, n) +
//          " present at index " + (n - m));
//    }
//  }
//
//  public static void main(String[] args)
//  {
//    String X = "XYYZXZYZXXYZ";
//    String Y = "XYZ";
//
//    findAllAnagrams(X, Y);
//  }
//
//
//}
