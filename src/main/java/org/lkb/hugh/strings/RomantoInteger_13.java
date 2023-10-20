package org.lkb.hugh.strings;

public class RomantoInteger_13 {
  // learn the rule of roman numbers;
  class Solution {
    public int romanToInt(String s) {
      char[] chs = s.toCharArray();
      int preNum = symbolToValue(chs[0]);
      int res = 0;
      for(int i = 1; i < chs.length; i++){
        int num = symbolToValue(chs[i]);
        if(preNum < num){
          res -= preNum;
        }else{
          res += preNum;
        }
        preNum = num;
      }
      res += preNum;
      String ss = new String();
      return res;


    }

    private int symbolToValue(char s){
      return switch (s) {
        case 'I' -> 1;
        case 'V' -> 5;
        case 'X' -> 10;
        case 'L' -> 50;
        case 'C' -> 100;
        case 'D' -> 500;
        case 'M' -> 1000;
        default -> 0;
      };
    }
  }
}
